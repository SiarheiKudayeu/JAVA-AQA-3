package lesson5.generics.ex1;

import lesson5.enums.ex2.GroupPerson;

public class GenericBoxWithTwoArgs <M, T>{

    public static void main(String[] args) {
        GenericBoxWithTwoArgs<GroupPerson, Integer> box = new GenericBoxWithTwoArgs<>(
                new GroupPerson(100, "Max"), 1034
        );
        box.printAllFieldsTypes();
    }

    private M firstField;
    private T secondField;

    public GenericBoxWithTwoArgs(M firstField, T secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    public void printAllFieldsTypes(){
        System.out.println("First field type: " + firstField.getClass().getName());
        System.out.println("Second field type: " + secondField.getClass().getName());
    }
}
