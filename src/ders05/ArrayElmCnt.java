package ders05;

import java.util.Scanner;

public class ArrayElmCnt {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Eleman Sayısı?: ");

        int elm = kb.nextInt();
        kb.close();

        int[] arr = new int[elm];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (i * 2) + i;
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }
}
