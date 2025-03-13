package lesson1;

public class ConditionalOperator {
    public static void main(String[] args) {
 /*       if (true) {
            System.out.println("Block of code from if");
        }*/

        int x = 123;

        if (x > 0) {
            if(x == 123){
                System.out.println("Congrats you've just win the prize");
            }else {
                System.out.println("Your number " + x + " is more that zero");
            }
        } else if (x < 0) {
            System.out.println("Your number " + x + " is less that zero");
        } else {
            System.out.println("Looks like your number is zero");
        }
    }
}
