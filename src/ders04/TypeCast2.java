package ders04;

public class TypeCast2 {
    public static void main(String[] args) {
        int    a = 5;
        double b = a;         // ???
        double x = 4.15;
        int    y = (int) x;
        float  z = (float) x; // ???

        System.out.println("b = " + b + ", y = " + y + ", z = " + z);
    }
}
