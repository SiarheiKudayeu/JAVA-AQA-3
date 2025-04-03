package lesson7.f_file_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputAndInputStreams {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt";
        String textToWrite = "Test AQA message!";

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
            fileOutputStream.write(textToWrite.getBytes());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        StringBuilder resultText = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(filePath)){
            int count;
            while ((count = fileInputStream.read()) != -1) {
                resultText.append((char) count);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(resultText);
    }


}
