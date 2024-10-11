package ders03;

public class TestFinal {
    final double PI = 3.1415;

    public static void main(String[] args) {
        TestFinal fTest = new TestFinal();
        fTest.PI = 3.14; // Error : PI is a constant
        System.out.println(fTest.PI);
    }
}
