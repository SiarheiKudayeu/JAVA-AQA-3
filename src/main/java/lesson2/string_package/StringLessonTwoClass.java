package lesson2.string_package;

public class StringLessonTwoClass {
    public static void main(String[] args) {
        int name = 29;
        //new

        StringLessonTwoClass variableName = new StringLessonTwoClass();
        StringLessonTwoClass variableName2 = new StringLessonTwoClass();

        String text = new String("Text for Test");

        String text2 = "Text for test 2";
        System.out.println(text);
        System.out.println(text2);

        //primitive == => equals()

        System.out.println("Text"==("Text2"));
        System.out.println(variableName2.equals(variableName));


    }
}
