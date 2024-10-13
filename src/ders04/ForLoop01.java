package ders04;

public class ForLoop01 {
    public static void main(String[] args) {
        int n         = 1;
        int factorial = 1;

        for (n = 1; n <= 6; n++) {
            factorial *= n;
        }
        System.out.println("6! = " + factorial);
    }
}
