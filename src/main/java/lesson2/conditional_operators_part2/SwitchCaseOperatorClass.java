package lesson2.conditional_operators_part2;

import java.util.Scanner;

public class SwitchCaseOperatorClass {
    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);
        System.out.println(scanner2.getClass().getName());
        System.out.println("=================");

        //basic switch-case
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Insert your profession");
        String profession = scanner.nextLine();
        //QA, DEVELOPER, DEVOPS
        switch (profession.toUpperCase()){
            case ("QA"):
                System.out.println("Do you know automation?");
                String answer = scanner.nextLine();
                switch (answer){
                    case ("yes"):
                        System.out.println("Hello AQA!");
                        break;
                    case ("no"):
                        System.out.println("Hello QA");
                        break;
                }
                break;
            case ("DEVELOPER"):
                System.out.println("Hello DEVELOPER");
                break;
            case ("DEVOPS"):
                System.out.println("Hello DEVOPS");
                break;
            default:
                System.out.println("Sorry your profession is not here :(");
        }

        //enhanced switch-case
        System.out.println("Put any test type");
        String testType = scanner.nextLine();
        switch (testType){
            case "smoke" -> System.out.println("Smoke testing");
            case "regression" -> System.out.println("regression testing");
            case "white box" -> {
                System.out.println("Box testing");
                System.out.println("At least white.");
            }
            default -> System.out.println("No testing");
        }

    }
}
