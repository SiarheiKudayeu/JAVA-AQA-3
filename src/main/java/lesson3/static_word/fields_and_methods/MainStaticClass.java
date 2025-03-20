package lesson3.static_word.fields_and_methods;

public class MainStaticClass {
    public static void main(String[] args) {
        String nonStatic = new ClassWithStaticFieldsAndMethods().nonStaticField;
        System.out.println(nonStatic);

        String staticField = ClassWithStaticFieldsAndMethods.staticField;
        System.out.println(staticField);

        ClassWithStaticFieldsAndMethods.staticMethod();
        new ClassWithStaticFieldsAndMethods().nonStaticMethod();

        //System.out.println(new ClassWithStaticFieldsAndMethods().staticField);
    }
}
