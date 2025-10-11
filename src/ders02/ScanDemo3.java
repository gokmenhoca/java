package ders02;

import java.util.Scanner;

public class ScanDemo3 {
    static Scanner kb = new Scanner(System.in);
    String         name;

    public static void main(String[] args) {
        System.out.printf("Yeni bir metin giriniz : ");

        String str1 = kb.nextLine();
        System.out.printf("Bir metin daha giriniz : ");

        String str2 = " " + kb.nextLine();
        System.out.println(str1.concat(str2).toUpperCase());
    }
}
