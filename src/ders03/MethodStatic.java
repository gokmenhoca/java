package ders03;

public class MethodStatic {
    public static void uyariYap() {
        System.out.println("Static Method");
    }

    public static void main(String args[]) {
        MethodStatic.uyariYap();
        // ya da aynı sınıfta ise
        uyariYap();
    }
}
