package lesson4.inheritance;

public class TeamMember {
    public String name;
    public int age;
    public String profession;

    protected String field = "parentField";

    public TeamMember(){}

    public TeamMember(String name, int age){

    }

    public void doWork(){
        System.out.println("I am Team member");
    }
}
