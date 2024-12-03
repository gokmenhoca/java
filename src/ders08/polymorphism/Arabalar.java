package ders09.polymorphism;

class Araba {
    String marka;
    String model;

    public Araba() {
        marka = "Yok";
        model = "Yok";
    }

    public Araba(String a) {
        marka = a;
        model = "Yok";
    }

    public Araba(String a, String b) {
        marka = a;
        model = b;
    }
}

public class Arabalar {
    public static void main(String[] args) {
        Araba[] a = new Araba[3];
        a[0] = new Araba();
        a[1] = new Araba("TOGG");
        a[2] = new Araba("TOGG", "T10X");

        for (int i = 0; i < 3; i++) {
            System.out.println("Marka: " + a[i].marka + "\tModel: " + a[i].model);
        }
    }
}
