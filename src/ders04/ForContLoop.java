package ders04;

import java.util.Scanner;

public class ForContLoop {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int carpim = 1, sayi = 0;

        for (;;) {
            System.out.print("Sayı? (0=Son): ");
            sayi = kb.nextInt();

            if (sayi == 0) {
                break;
            } else if (sayi == 1) {
                continue;
            }
            carpim *= sayi;
        }
        System.out.println("Çarpım: " + carpim);
    }
}
