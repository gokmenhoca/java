package ders05;

import java.util.Scanner;

public class ArrayElmInput {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Eleman Sayısı?: ");

        int   es  = kb.nextInt();
        int[] arr = new int[es];
        System.out.println("Dizi elemanları: ");

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(i + 1 + ". Eleman: ");

            int el = kb.nextInt();
            arr[i] = el;
        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        kb.close();
    }
}
