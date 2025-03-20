package lesson3.final_word;

public class FinalFieldAndMethodExample {
    public static final String finalString = "AQA";
    public static  String nonFinalString = "AQA";

    public static void main(String[] args) {
        System.out.println(finalString);
        //finalString = "QA";
        nonFinalString = "QA";
        System.out.println(nonFinalString);
    }
}
