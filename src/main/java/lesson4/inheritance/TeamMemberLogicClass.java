package lesson4.inheritance;

public class TeamMemberLogicClass {
    public static void main(String[] args) {
        QA qa = new QA();
        qa.doWork();
        System.out.println("==============");

        //TeamMember member = new TeamMember();
       // member.doWork();

        qa.callChild();
        System.out.println("=============");
        qa.callParent();

        System.out.println("=============");
        TeamMember teamMember1 = new QA();
        teamMember1.doWork();

        ((QA) teamMember1).qaMethod();

        System.out.println("========");
        TeamMember[] teamMembers = new TeamMember[3];
        teamMembers[0] = new QA();
        teamMembers[1] = new QA();
        teamMembers[2] = new Developer();

        for (TeamMember member: teamMembers){
            member.doWork();
        }
    }
}
