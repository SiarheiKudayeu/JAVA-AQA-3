package lesson3.static_word.fields_and_methods;

public class ClassWithStaticFieldsAndMethods {
    public String nonStaticField = "nonStaticField";
    public static String staticField = "staticField";

    public void nonStaticMethod(){
        staticMethod();
        System.out.println("nonStaticMethod");
        anyOther();
        System.out.println(nonStaticField);
        System.out.println(staticField);
    }

    public void anyOther(){

    }

    public static void anyOtherStatic(){

    }

    public static void staticMethod(){
        System.out.println("staticMethod");
        anyOtherStatic();
        System.out.println("nonStaticMethod");
        //anyOther();
        //System.out.println(nonStaticField);
        System.out.println(staticField);
    }
}
