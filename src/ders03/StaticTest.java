package ders03;

public class StaticTest {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        displayNum(b); // Error
    }

    public void displayNum(int pB) {
        System.out.println("Sayı : " + pB);
    }
}
