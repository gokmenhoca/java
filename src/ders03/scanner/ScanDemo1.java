package ders03.scanner;

import java.util.Scanner;

public class ScanDemo1 {
	public static void main(String[] args) {
    String userName = "Ali Kamil ZEMBEREK";
    Scanner kb = new Scanner(userName);
    System.out.printf("Merhaba, " + kb.next());

    while (kb.hasNext()) {
      System.out.print(" " + kb.next());
    }

    System.out.println("!.. Nasılsınız?");
    kb.close();
  }
}
