package lesson1;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //Numeric (byte, short, int, long)

        //byte -128 till 127
        byte byteVariable = 45;
        System.out.println(byteVariable);

        //short -32768 till 32767
        short shortSecondVar;
        shortSecondVar = 1999;
        System.out.println("Short variable: " + shortSecondVar);

        // int -2^31 till 2^31-1
        // long -2^63 till 2^63 -1

        int x1, x2, x3;
        x1 = 28;
        x2 = 34;
        x3 = 53;

        long myLong = 34L;
        System.out.println(myLong);

        //double float
        double myDouble = 14.73;
        System.out.println("My double: " + myDouble);

        //float WRITE ANY MESSAGE!!!
        float myFloat = 3.86F;
        System.out.println("Float: " + myFloat);

/*        //+ - * /
        int a = 7;
        int b = a + 3;
        System.out.println("b = " + b);
        */

        int qa = 12;
        int aqa = 5;
        System.out.println((double) qa / aqa);

        System.out.println("==========================");

        // %
        // 12/5 = 2 2/5
        System.out.println(12 % 5);
        //3%12 = 3/12
        System.out.println(3 % 12);

        System.out.println("=============");
        System.out.println(12 % 5);
        System.out.println(-12 % 5);
        System.out.println(-12 % -5);
        System.out.println(12 % -5);

    }
}
