package ders03;

// Operator Precedence (Operatörlerin önceliği)
public class OperatorPred {
    public static void main(String[] args) {
        int a = 3, b = 5, c;
        c = (((a * ++b) / 5) - (12 * a)) + b; // (15/5)-36+6
        System.out.println("c: " + c); // -27

        boolean bool = ((a + b) < (a * c)) && ((a + b) >= (b + a));
        System.out.println("bool: " + bool); // bool: false

        int x = 3, y = 5, z;
        z = ((x * ++y) / (5 - 12)) * (x + y); // -2*9
        System.out.println("c: " + z); // -18

        boolean test = ((x + y) < (x * z)) && ((x + y) >= (y + x));
        System.out.println("test: " + test); // test: false
    }
}
