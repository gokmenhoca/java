package ders02;

import java.util.Calendar;
import java.util.Scanner;

public class DogumYili2 {
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

        Calendar cal   = Calendar.getInstance();
        Integer  birth = cal.get(Calendar.YEAR) - kb.nextInt();
        System.out.printf("%s, %d doğumludur.", userName.toUpperCase(), birth);
    }
}
