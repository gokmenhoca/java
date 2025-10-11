package ders02;

import java.util.Scanner;

public class ScanLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Merhaba Millet");
        System.out.println("" + sc.hasNext());
        System.out.println("" + sc.nextLine());  // sc.nextLine()
        System.out.println("" + sc.hasNext());
        sc.close();
    }
}
