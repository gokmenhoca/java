package ders04;

public class ForEach01 {
    public static void main(String[] args) {
        Integer[] sayilar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (Integer i : sayilar) {
            System.out.printf("%2d^2  = %3.0f\n", i, Math.pow(i, 2));
        } // Diziler konusunda daha fazlasını göreceğiz.
    }
}
