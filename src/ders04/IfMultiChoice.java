package ders04;

import java.util.Scanner;

public class IfMultiChoice {
    static Scanner kb = new Scanner(System.in);

    public static double alanDaire() {
        System.out.print("Yarıçap: ");

        Double param = kb.nextDouble();
        return Math.pow(param, 2) * Math.PI;
    }

    public static double alanDortgen(float par1, float par2) {
        return par1 * par2;
    }

    public static void main(String[] args) {
        System.out.println("Alan Hesaplama: 0-Daire  1-Dörtgen");
        System.out.print("Seçiminiz? (0-1): ");

        Integer secim = kb.nextInt();
        kb.reset();

        if (secim == 0) {
            System.out.printf("Dairenin Alanı: %3.3f\n", alanDaire());
        } else if (secim == 1) {
            System.out.print("Kenarlar: ");

            Float k1 = kb.nextFloat();
            Float k2 = kb.nextFloat();
            System.out.printf("Dörtgenin Alanı: %3.1f\n", alanDortgen(k1, k2));
        } else {
            System.out.printf("Hatalı Seçim: %s", secim);
        }
    }
}
