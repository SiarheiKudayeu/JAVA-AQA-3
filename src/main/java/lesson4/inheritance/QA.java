package lesson4.inheritance;

public class QA extends TeamMember{

    public QA(String name, int age) {
        super(name, age);
        System.out.println("assafsafsa");
    }

    public QA(){
        super();
    }

    protected String field = "childField";

    public void qaMethod(){
        System.out.println("Please test me!!!");
    }

    public void callParent(){
        System.out.println(super.field);
        super.doWork();
    }

    public void callChild(){
        System.out.println(this.field);
        doWork();
    }

    @Override
    public void doWork(){
        System.out.println("I am Tester");
    }
}
