package ders03;

public class FieldTest {
    static int aStatic;       // Class Variable
    int        aDynamic = 5;  // Instance Variable

    public static void main(String[] args) {
        FieldTest obj1  = new FieldTest();
        FieldTest obj2  = new FieldTest();
        char      aChar = 97;  // Local Variable

        int       a     = FieldTest.aStatic * obj1.aDynamic;

        System.out.println("1. Nesne için:");
        System.out.println(aChar + "Static = " + aStatic);
        System.out.println(aChar + "Dynamic = " + obj1.aDynamic);
        System.out.println(aChar + " = " + a);

        FieldTest.aStatic++;
        obj2.aDynamic = 50;

        a             = FieldTest.aStatic * obj2.aDynamic;
        System.out.println("\n2. Nesne için:");
        System.out.println(aChar + "Static = " + aStatic);
        System.out.println(aChar + "Dynamic = " + obj2.aDynamic);
        System.out.println(aChar + " = " + a);
    }
}


