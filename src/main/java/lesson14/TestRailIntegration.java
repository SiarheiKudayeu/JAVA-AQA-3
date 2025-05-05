package lesson14;

import com.codepine.api.testrail.TestRail;
import com.codepine.api.testrail.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestRailIntegration {
    public static void main(String[] args) {
        String userName = "bartsimpson@bart.bart";
        String password = "Temp.getPass()";
        String testRailUrl = "https://lizasimpsomaqa.testrail.io/";

        //Create instance of TestRail
        TestRail testRail = TestRail.builder(testRailUrl, userName, password).applicationName("TestRailIntegration").build();

        //List of all projects
        System.out.println("==============LIST OF PROJECTS============");
        List<Project> projectList = testRail.projects().list().execute();
        for (Project project : projectList) {
            System.out.println("Project name is: " + project.getName() + ". Project id is: " + project.getId());
        }

        //List of all suites
        System.out.println("==============LIST OF SUITES============");
        List<Suite> suiteList = testRail.suites().list(1).execute();
        for (Suite suite : suiteList) {
            System.out.println("Suite name is: " + suite.getName() + ". Suite id is: " + suite.getId());
        }

        //List of all cases
        System.out.println("==============LIST OF CASES============");
        List<CaseField> caseFieldsList = testRail.caseFields().list().execute();
        List<Case> caseList = testRail.cases().list(1, 1, caseFieldsList).execute();
        for (Case testCase: caseList){
            System.out.println("Case name is: " + testCase.getTitle() +". Case id is: " + testCase.getId());
        }

        //create Test Run
        /*Run run = testRail.runs().add(1, new Run().setName("AQA Test Run " + LocalDate.now())).execute().setSuiteId(1);
        System.out.println(run.getId());
        List<ResultField> resultFieldList = testRail.resultFields().list().execute();
        testRail.results().addForCase(4, 14, new Result().setStatusId(1), resultFieldList).execute();
        testRail.results().addForCase(4, 15, new Result().setStatusId(2), resultFieldList).execute();
        testRail.results().addForCase(4, 16, new Result().setStatusId(4), resultFieldList).execute();
        testRail.results().addForCase(4, 17, new Result().setStatusId(5), resultFieldList).execute();
        testRail.runs().close(4).execute();*/

        //1- passed, 2 - blocked, 4 - retest, 5 - failed;

        Run run = testRail.runs().add(1, new Run().setName("AQA Test Run 2 " + LocalDate.now())).execute().setSuiteId(1);
        List<ResultField> resultFieldList = testRail.resultFields().list().execute();
        List<Integer> caseIdList = new ArrayList<>();
        for (Case testCase: caseList){
            caseIdList.add(testCase.getId());
        }

        List<Integer> listOfStatuses = new ArrayList<>(Arrays.asList(1,2,4,5));
        for (Integer caseId: caseIdList){
            int randomStatus = listOfStatuses.get(new Random().nextInt(listOfStatuses.size()));
            testRail.results().addForCase(run.getId(), caseId, new Result().setStatusId(randomStatus), resultFieldList).execute();
        }

        testRail.runs().close(run.getId()).execute();

    }
}
