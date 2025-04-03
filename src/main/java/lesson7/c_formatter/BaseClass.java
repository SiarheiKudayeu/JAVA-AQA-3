package lesson7.c_formatter;

public class BaseClass {
    public static void main(String[] args) {
        // %s
        String replaceValue1 = "REPLACE_ONE";
        String replaceValue2 = "REPLACE_TWO";
        System.out.printf("Any string with %s specifier!\n", replaceValue2);
        System.out.printf("Any %s string with %s specifier!\n", replaceValue1, replaceValue2);
        System.out.printf("Any %2$s string with %1$s specifier!\n", replaceValue1, replaceValue2);

        //%c - char
        //%d - byte, short, int, long
        //%f - float, double
        System.out.println("==================");
        //%b
        System.out.printf("This is string with formatter %b\n",replaceValue1);
        System.out.printf("This is string with formatter %b\n", -5);
        System.out.printf("This is string with formatter %b\n", null);
        System.out.printf("This is string with formatter %b\n", false);
        System.out.printf("This is string with formatter %b\n", true);
    }
}
