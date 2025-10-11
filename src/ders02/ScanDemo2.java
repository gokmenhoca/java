package ders02;

import java.util.Scanner;

public class ScanDemo2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Adınız? : ");
        String uName = kb.nextLine();
        kb.close();

        Scanner str = new Scanner(uName);
        System.out.print("Merhaba, ");

        do {
            System.out.print(str.next());

            if (str.hasNext()) {
                System.out.print(" ");
            } else {
                break;
            }
        } while (str.hasNext());
        System.out.print("!.. Nasılsınız?");
        str.close();
    }
}
