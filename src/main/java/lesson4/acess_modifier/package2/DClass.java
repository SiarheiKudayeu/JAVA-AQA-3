package lesson4.acess_modifier.package2;

import lesson4.acess_modifier.package1.AClass;

public class DClass extends AClass {

    public void printAProtectedField(){
        System.out.println(protectedString);
    }

    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.publicString);
   /*     System.out.println(aClass.privateString);
        System.out.println(aClass.protectedString);
        System.out.println(aClass.defaultString);*/
        System.out.println(new DClass().protectedString);
        new DClass().printAProtectedField();
    }
}
