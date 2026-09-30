package ders03.scanner;

import java.util.Scanner;

public class ScanLine {

  public static void main(String[] args) {
    Scanner sc = new Scanner("Java güzel bir dildir.");

    System.out.println("hasNext()? : " + sc.hasNext());
    System.out.println(sc.nextLine());
    System.out.println("hasNext()? : " + sc.hasNext());

    sc.close();
  }

}
