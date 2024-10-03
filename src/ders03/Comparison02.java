package ders03;

public class Comparison02 {
    public static void main(String[] args) {
        int a = 0, b = 10;

        // Parantezlerin eksik veya fazla kullanımı sonucu değiştirecektir.
        if (((a <= 5) && (b > 10)) && ((a < 1) || (b >= 9))) {
            System.out.println("Koşul doğru.");
        } else {
            System.out.println("Koşul yanlış.");
        }
        // D : DOĞRU         Y: YANLIŞ
        //         (((a <= 5) && (b > 10)) && ((a < 1) || (b >= 9)))
        // 1.adım  ((    D    &&    Y    ) && ((  D    ||    D    ))
        // 2. adım (           Y           &&          D           )
        // 3. adım (                       Y                       )

        if ((a <= 5) && (b > 10)  && (a < 1) || (b >= 9)) {
            System.out.println("Koşul doğru.");
        } else {
            System.out.println("Koşul yanlış.");
        }
        // D : DOĞRU         Y: YANLIŞ
        //         ( (a <= 5) && (b > 10)  &&  (a < 1) || (b >= 9) )
        // 1.adım  (    D     &&    Y                              )
        // 2.adım  (          Y            &&     D                )
        // 3.adım  (                       Y           ||    D     )
        // 4.adım  (                       D                       )
    }
}
