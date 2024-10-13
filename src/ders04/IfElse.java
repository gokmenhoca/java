package ders04;

import java.util.Scanner;

public class IfElse {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Alan Hesaplama: 0-Daire 1-Dörtgen");
        System.out.print("Seçiminiz? (0-1): ");

        int secim = kb.nextInt();

        if (secim == 0) {
            System.out.print("Yarıçap:");

            int yr = kb.nextInt();
            System.out.println("Dairenin Alanı: " + (yr * yr * Math.PI));
        } else {
            System.out.print("Birinci Kenar: ");

            int kenar1 = kb.nextInt();
            System.out.print("İkinci Kenar: ");

            int kenar2 = kb.nextInt();
            int Alan   = kenar1 * kenar2;
            System.out.println("Dörtgenin Alanı: " + Alan);
        }
    }
}
