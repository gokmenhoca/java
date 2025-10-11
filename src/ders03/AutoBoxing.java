package ders04;

public class AutoBoxing {
    public static void main(String[] args) {
        Integer   intNumber    = 123;       // Autoboxing
        Double    doubleNumber = 5.72;      // Autoboxing
        Character charNumber   = 65;        // Autoboxing & Implicit cast
        int       i            = intNumber; // Unboxing

        System.out.println(intNumber);
        System.out.println(doubleNumber);
        System.out.println((char) charNumber); // Explicit Cast
        System.out.println("----");

        // The following regular forms do the same above
        System.out.println(intNumber.intValue());
        System.out.println(doubleNumber.doubleValue());
        System.out.println(charNumber.charValue());
        System.out.println("----");

        System.out.println(doubleNumber.toString().length());
    }
}
