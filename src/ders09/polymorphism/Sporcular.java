package ders09.polymorphism;

class Sporcu {
    public void calis() {
        System.out.println("Sporcu kosuyor.");
    }
}

class Futbolcu extends Sporcu {
    @Override
    public void calis() {
        System.out.println("Futbolcu kosuyor.");
    }
}

class Yuzucu extends Sporcu {
    @Override
    public void calis() {
        System.out.println("Yuzucu yuzuyor.");
    }
}

public class Sporcular {
    public static void calistir(Sporcu s) {
        if (!(s instanceof Futbolcu)) {
            s.calis();
        }
    }

    public static void main(String args[]) {
        Yuzucu yuzucu = new Yuzucu();
        Sporcu sporcu = new Sporcu();
        Futbolcu futbolcu = new Futbolcu();
        calistir(sporcu);
        calistir(futbolcu);
        calistir(yuzucu);
    }
}
