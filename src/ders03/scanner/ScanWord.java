package ders03.scanner;

import java.util.Scanner;

public class ScanWord {

  public static void main(String[] args) {
    Scanner sc = new Scanner("Java güzel bir dildir.");

    System.out.println("hasNext()? : " + sc.hasNext());
    System.out.println(sc.next());
    System.out.println("hasNext()? : " + sc.hasNext());

    sc.close();
  }

}
