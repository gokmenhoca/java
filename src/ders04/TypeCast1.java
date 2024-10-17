package ders04;

public class TypeCast1 {
    public static void main(String[] args) {

        int a = 5;
        int b;
        double c = 18.6;

        // Implicit (Dolaylı) tip dönüşümleri
        b = a / 2; // Automatic Conversion ile veri kaybı
        System.out.println("b -> " + b); // b -> 2 (Veri Kaybı)

        a = c; // Invalid Casting (Derlenemez)
        System.out.println("a -> " + a); // a -> Error

        // Explicit (Doğrudan) tip dönüşümleri
        b = (int) c; // Veri kaybı (Ondalık kısım yok edildi)

        System.out.println("b -> " + b); // b -> 18
        c = (double) a / 2; // Doğru ve Geçerli
        System.out.println("c -> " + c); // b -> 2.5
    }
}
