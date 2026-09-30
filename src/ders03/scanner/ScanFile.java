package ders03.scanner;

import java.io.File;

import java.util.Scanner;

public class ScanFile {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(new File("src/ders03/scanner/values"));

      while (sc.hasNextInt()) {
        int iValue = sc.nextInt();
        System.out.println(iValue);
      }
      sc.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
