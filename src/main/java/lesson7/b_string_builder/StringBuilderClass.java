package lesson7.b_string_builder;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder);

        //append()
        builder.append("First word");
        System.out.println(builder);

        String textForRevert = "TAXI";
        String empty = "";
        for (int i = textForRevert.length() - 1; i >= 0; i--) {
            empty = empty + textForRevert.charAt(i);
        }
        textForRevert = empty;
        System.out.println(textForRevert);

        //reverse()
        StringBuilder builderRevert = new StringBuilder("TAXI");
        builderRevert.reverse();
        System.out.println(builderRevert);

        //insert
        builder.insert(6, "New injection ");
        System.out.println(builder);

        //delete
        System.out.println("delete");
        builder.delete(6, 20);
        System.out.println(builder);

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("stringBuffer");
        String text = String.valueOf(stringBuffer);
    }
}
