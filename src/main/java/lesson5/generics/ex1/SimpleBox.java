package lesson5.generics.ex1;

import lesson5.enums.ex2.GroupPerson;

public class SimpleBox {
    public static void main(String[] args) {
        Object o = new Object();
        o = 12;
        o = "sascsa";
        o = new GroupPerson(1233, "assasa");
    }

    public Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public SimpleBox(Object object) {
        this.object = object;
    }
}
