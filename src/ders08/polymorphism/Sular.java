package ders09.polymorphism;

class Su {
    String durum() {
        return "sivi";
    }

    String hacim() {
        return "normaldir.";
    }
}

class Buz extends Su {
    @Override
    String durum() {
        return "buz";
    }

    @Override
    String hacim() {
        return "sividan buyuktur.";
    }
}

class Buhar extends Su {
    @Override
    String durum() {
        return "buhar";
    }

    @Override
    String hacim() {
        return "sividan kucuktur.";
    }
}

public class Sular {
    static void bilgi(Su su) {
        System.out.printf("Suyun %s halde hacmi, ", su.durum());

        if (su instanceof Su) {
            System.out.printf("%s\n", su.hacim());
        }
    }

    public static void main(String[] args) {
        Su su = new Su();
        Su buz = new Buz();
        Su buhar = new Buhar();
        bilgi(su);
        bilgi(buz);
        bilgi(buhar);
    }
}
