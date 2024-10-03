package ders03;

public class Comparison01 {
    public static void main(String[] args) {
        int     a = 0, b = 10;
        boolean x1, x2, x, y1, y2, y;
        x1 = (a <= 5); // x1 -> true
        x2 = (b > 10); // x2 -> false
        x = (x1 && x2); // x1 && x2 = true && false = false
        y1 = (a < 1); // y1 -> true
        y2 = (b >= 9); // y2 -> false
        y = (y1 || y2); // y1 || y2 = true || false = true

        if (x && y) { // x && y = false && true = false
            System.out.println("Koşul doğru.");
        } else {
            System.out.println("Koşul yanlış.");
        }
    }
}
