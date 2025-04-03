package lesson7.e_byte_streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutputAndInputStreams {
    public static void main(String[] args) throws IOException {
        //write OutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //-128 till 127
        byteArrayOutputStream.write(24);
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(2353);

        byte[] arrayFromOutput = byteArrayOutputStream.toByteArray();
        System.out.println(Arrays.toString(arrayFromOutput));
        byteArrayOutputStream.close();

        //read InputStream
        byte[] arrayForInput = {22, 115, 43};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayForInput);
        int count;
        while ((count = byteArrayInputStream.read()) != -1) {
            System.out.print(count + " ");
        }
        byteArrayInputStream.close();
    }
}

