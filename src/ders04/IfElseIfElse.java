package ders04;

public class IfElseIfElse {
    public static void main(String[] args) {
        int  puan = 81;
        char karne;

        if (puan >= 90) {
            karne = 'A';
        } else if (puan >= 80) {
            karne = 'B';
        } else if (puan >= 70) {
            karne = 'C';
        } else if (puan >= 60) {
            karne = 'D';
        } else {
            karne = 'F';
        }
        System.out.println("Harf Notu = " + karne);
    }
}
