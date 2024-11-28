package ders09.polymorphism;

class Kus {
    String ad;

    Kus() {
        ad = "Kus";
    }

    public void fly() {
        System.out.println(ad + " ucuyor...");
    }
}

class Kartal extends Kus {
    Kartal() {
        ad = "Kartal";
    }

    @Override
    public void fly() {
        super.fly();
    }
}

public class Kuslar {
    public static void move(Kus obj) {
        obj.fly();
    }

    public static void main(String args[]) {
        Kus kus;
        kus = new Kus();
        move(kus);
        kus = new Kartal();
        move(kus);
    }
}
