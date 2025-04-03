package lesson7.h_serialization;

import java.io.Serializable;

public class SerializationPersonClass implements Serializable {
    private String name;
    private int age;

    public SerializationPersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SerializationPersonClass: name='" + name + '\'' +
                ", age=" + age;
    }
}
