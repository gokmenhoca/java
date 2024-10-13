package ders04;

public class WhileDoLoop {
    public static void main(String[] args) {
        int n         = 1;
        int factorial = 1;

        do {
            factorial *= n++;
        } while (n <= 6);
        System.out.println("6! = " + factorial);
    }
}
