package lesson7.a_strings;

public class StringMethodsExample {
    public static void main(String[] args) {

        //concat()
        String text1 = "text1";
        String text2 = "text2";
        System.out.println(text1 + " " + text2);
        System.out.println(text1.concat(" ").concat(text2));
        System.out.println(text1);
        text1 = text1 + " " + text2;
        System.out.println(text1);

        //equals()
        System.out.println(text1.equals(text2));

        // \", \n, \b
        System.out.println("Very important \"TEXT\"\nnext line textS\b");

        //valueOf()
        boolean myBoolean = true;
        int myInt = 33;
        String stringBoolean = String.valueOf(myBoolean);
        String stringInt = String.valueOf(myInt);
        System.out.println(stringBoolean + " " + stringInt);

        //chartAt()
        String symbols = "012A456789";
        System.out.println(symbols.charAt(0));
        System.out.println(symbols.charAt(3));

        System.out.println("====================");
        //indexOf(), lastIndexOf()
        String symbolsIndexing = "012A45A678A9X";
        System.out.println(symbolsIndexing.indexOf("A"));
        System.out.println(symbolsIndexing.indexOf("X"));
        System.out.println(symbolsIndexing.lastIndexOf("A"));

        //replace()
        System.out.println("Very important \"TEXT_TO_REPLACE\" next line text"
                .replace("TEXT_TO_REPLACE","AQA LESSON 7"));

        //startsWith(), endsWith()
        System.out.println("Any text for test".startsWith("Any "));
        System.out.println("Any text for test".startsWith("And"));
        System.out.println("Any text for test".endsWith("test"));
        System.out.println("Any text for test".endsWith("SMTH"));

        //substring(), substring()
        System.out.println("Any text for test".substring(5));
        System.out.println("Any text for test".substring(5, 11));

        //split
    }
}
