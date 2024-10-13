package ders04;

import java.util.Scanner;

public class SwitchCase {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String karne;
        System.out.print("Not ortalamanız nedir?: ");
        int puan = kb.nextInt();

        switch (puan / 10) {
            case 10: karne = "A";  break;
            case  9: karne = "A-"; break;
            case  8: karne = "B+"; break;
            case  7: karne = "B";  break;
            case  6: karne = "B-"; break;
            case  5: karne = "C+"; break;
            case  4: karne = "C";  break;
            case  3: karne = "C-"; break;
            case  2: karne = "D+"; break;
            case  1: karne = "D";  break;
            case  0: karne = "F";  break;
            default: karne = "Yanlış not";
        }

        if (!karne.isEmpty() && ((puan >= 0) && (puan <= 100))) {
            System.out.printf("Harf notunuz : %s", karne);
        } else {
            System.out.println("Yanlış not girdiniz.");
        }
    }
}
