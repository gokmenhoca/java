package ders02;

import java.util.Scanner;

public class ScanDemo1 {
    public static void main(String[] args) {
        String  userName = "Ruhi BUNALIM";
        Scanner kb       = new Scanner(userName);
        System.out.printf("Merhaba, " + kb.nextLine());

        while (kb.hasNext()) {
            System.out.print(" " + kb.next());
        }
        System.out.println("!.. Nasılsınız?");
        kb.close();
    }
}