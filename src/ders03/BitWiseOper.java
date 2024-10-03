package ders03;

public class BitWiseOper {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 9;

        System.out.println("a & b   = " + (a & b));
        System.out.println("a | b   = " + (a | b));
        System.out.println("a ^ b   = " + (a ^ b));
        System.out.println("   ~a   = " + (~a));
        System.out.println("   ~b   = " + (~b));
        System.out.println("   ~c   = " + (~c));
        System.out.println("a >> 1  = " + (a >> 1));
        System.out.println("a >> 2  = " + (a >> 2));
        System.out.println("a << 1  = " + (a << 1));
        System.out.println("a << 2  = " + (a << 2));
        System.out.println("a >>> 2 = " + (a >>> 2));
    }
}
