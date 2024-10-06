package ders02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DogumYili1 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = "";
        System.out.printf("Ad-Soyad ve Yaşınız?: ");

        // Örnek olarak yazıldı. En iyi versiyonunu yazmayı deneyiniz.
        do {
            userName += kb.next();

            if (!kb.hasNextInt()) {
                userName += " ";
            }
        } while (!kb.hasNextInt());

        Date             date  = new Date();
        SimpleDateFormat sdf   = new SimpleDateFormat("YYYY");
        Integer          birth = Integer.parseInt(sdf.format(date)) - kb.nextInt();
        System.out.printf("%s, %d doğumludur.", userName.toUpperCase(), birth);
    }
}
