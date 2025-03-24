package lesson4.nested;

public class OuterClass {

    public String nonStatic = "nonStatic";
    public static String staticString = "staticString";

    public void nonStaticVoid(){
        System.out.println("nonStaticVoid");
    }

    public static void staticVoid(){
        System.out.println("staticVoid");
    }

    public static class NestedClass{
        public String field;

        public static void staticNestedMethod(){
            System.out.println("staticNestedMethod");
        }

        public void tryOuterClass(){
            System.out.println(staticString);
            //System.out.println(nonStatic);
            staticVoid();
            //nonStaticVoid();
        }
    }


}
