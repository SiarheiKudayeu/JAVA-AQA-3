package lesson1;

public class Increment {
    public static void main(String[] args) {
        // ++
/*        int a = 13;
        a++; // a = a + 1;
        System.out.println(a);*/

        //Postfix increment
        int a = 13;
        System.out.println(a++);  //a = a + 1;
        System.out.println(a);

        //Prefix increment
        a = 13;
        //a = a + 1;
        System.out.println(++a);
        System.out.println(a);

        System.out.println("===============");
        //Postfix decrement
        a = 13;
        System.out.println(a--);  //a = a - 1;
        System.out.println(a);
        System.out.println("===============");
        //Prefix decrement
        a = 13;
        //a = a - 1;
        System.out.println(--a);
        System.out.println(a);

        System.out.println("=======");
        int b = 10;
        b += 12; // b = b + 12
        System.out.println(b);
    }
}
