package lesson6.ex3;

import java.util.Scanner;

public class PersonExceptionExampleClass {
    public static void main(String[] args) {
        PersonExceptionExampleClass notSergey = new PersonExceptionExampleClass();
        try {
            notSergey.askAndSetName();
        }catch (SergeyNameException e){
            System.out.println(e.getMessage());
        }

        System.out.println(notSergey.getName());

    }

    private String name;

    public String getName() {
        return name;
    }

    public void askAndSetName() throws SergeyNameException{
        System.out.println("Insert your name:");
        String name = new Scanner(System.in).next();
        if(name.equals("Sergey")){
            throw new SergeyNameException();
        }
        this.name = name;
    }
}
