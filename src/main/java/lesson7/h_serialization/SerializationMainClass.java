package lesson7.h_serialization;

import java.io.*;
import java.util.Arrays;

public class SerializationMainClass {
    public static void main(String[] args) {
        //serialization
        byte[] byteArrayPerson = null;
        SerializationPersonClass ivan = new SerializationPersonClass("Ivan", 36);
        System.out.println("Before serialization: " + ivan);
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            outputStream.writeObject(ivan);
            byteArrayPerson = byteArrayOutputStream.toByteArray();
        } catch (IOException r) {
            r.printStackTrace();
        }
        System.out.println("After serialization: " + Arrays.toString(byteArrayPerson));

        //deserialization
        SerializationPersonClass ivanBack = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayPerson))) {
            ivanBack = (SerializationPersonClass) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After deserialization: " + ivanBack);
    }
}
