package ders09.polymorphism;

class Kedi {
    public void avYakala() {
        System.out.println("Kedi av yakaladi.");
    }
}

class Aslan extends Kedi {
    @Override
    public void avYakala() {
        System.out.println("Aslan av yakaladi.");
    }
}

class Kaplan extends Kedi {
    @Override
    public void avYakala() {
        System.out.println("Kaplan av yakaladi.");
    }
}

public class Kediler {
    public static void avlan(Kedi avci) {
        avci.avYakala();
    }

    public static void main(String args[]) {
        Kedi kedi = new Kedi();
        Kaplan kaplan = new Kaplan();
        Aslan aslan = new Aslan();

        avlan(kaplan);
        avlan(kedi);
        avlan(aslan);
    }
}
