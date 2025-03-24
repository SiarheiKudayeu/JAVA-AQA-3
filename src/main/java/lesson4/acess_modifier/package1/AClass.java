package lesson4.acess_modifier.package1;

public class AClass {
    public String publicString = "publicString";
    private String privateString = "privateString";
    protected String protectedString = "protectedString";
    String defaultString = "defaultString";

    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.publicString);
        System.out.println(aClass.privateString);
        System.out.println(aClass.protectedString);
        System.out.println(aClass.defaultString);
    }
}
