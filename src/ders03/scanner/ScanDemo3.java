package ders03.scanner;

import java.util.Scanner;

public class ScanDemo3 {
	String name;

	public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.printf("Yeni bir metin giriniz : ");
    String str1 = kb.nextLine();

    System.out.printf("Bir metin daha giriniz : ");
    String str2 = " " + kb.nextLine();

    System.out.println(str1.concat(str2).toUpperCase());

    kb.close();
  }
}
