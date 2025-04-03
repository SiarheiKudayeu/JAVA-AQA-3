package lesson7.d_file;

import java.io.File;

public class ExampleFileClass {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt");
        System.out.println("File size is: " +file.length());
        System.out.println("File name is: " +file.getName());
        System.out.println("Can we read this file?: " +file.canRead());
        System.out.println("Can we write this file?: " +file.canWrite());
        System.out.println("Is it a file?: " +file.isFile());
        System.out.println("Is it a directory?: " +file.isDirectory());

        File folder = new File("C:\\Users\\s.kudaev\\Desktop\\AQA");
        System.out.println("Is it a directory?: " +new File("C:\\Users\\s.kudaev\\Desktop\\AQA").isDirectory());

        System.out.println("\nList of files:");
        File[] files = folder.listFiles();
        int counter = 1;
        for(File fileSep: files){
            System.out.println(counter + ") " + fileSep.getName());
            counter++;
        }
    }
}
