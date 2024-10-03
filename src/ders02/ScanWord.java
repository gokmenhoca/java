package ders02;

import java.util.Scanner;

public class ScanWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Merhaba Millet");
        System.out.println("" + sc.hasNext());
        System.out.println("" + sc.next());  // sc.next()
        System.out.println("" + sc.hasNext());
        sc.close();
    }
}
