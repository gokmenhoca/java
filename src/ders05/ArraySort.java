package ders05;

import java.util.Arrays;

public class ArraySort {
    public static void diziYaz(double[] dbl) {

        for (int i = 0; i < dbl.length; i++) {
            System.out.println("dbl[" + i + "] = " + dbl[i]);
        }
    }

    public static void main(String[] args) {
        double[] dizi = { 2, 3.45, -4.78, 1, 15.12, -15.32, 78.17 };
        System.out.println("Karışık : ");
        diziYaz(dizi);
        Arrays.sort(dizi);
        System.out.println("Sıralı:");
        diziYaz(dizi);
    }
}
