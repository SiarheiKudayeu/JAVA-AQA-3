package lesson7.g_buffered_stream;

import java.io.*;

public class BufferedOutputAndInputStreams {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt";
        String textToWrite = "Test AQA message!";

        try(OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filePath))) {
            outputStream.write(textToWrite.getBytes());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        StringBuilder resultText = new StringBuilder();
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(filePath))){
            int count;
            while ((count = inputStream.read()) != -1) {
                resultText.append((char) count);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(resultText);
    }
}
