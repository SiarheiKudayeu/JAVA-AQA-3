package lesson1;

public class BooleanDataType {
    public static void main(String[] args) {
        boolean myBoolean = true;
        boolean myBoolean2 = false;

        //System.out.println(myBoolean2);

        // ==
        int x = 10;
        int y = 11;
        boolean resultOfCompare = x == y;
        System.out.println(resultOfCompare);

        // !=
        resultOfCompare = x != y;
        System.out.println(resultOfCompare);

        // > < >= <=
        System.out.println("> < >= <=");
        System.out.println(10 > 10);
        System.out.println(10 >= 10);

        System.out.println("OR");
        // || or
        System.out.println((10 > 9)||(32 == 12)||(33 > 454));

        // &&
        System.out.println((10 > 9)&&(32 == 32)&&(33 > 454));
    }
}
