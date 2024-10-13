package ders04;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 6, factorial = 1;

        while (n > 1) {
            factorial *= n--;
        }
        System.out.println("6! = " + factorial);
    }
}
