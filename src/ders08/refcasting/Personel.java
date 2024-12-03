package ders09.refcasting;

public class Personel {
    public int    maas;
    public String name;

    public void dinlen() {
        System.out.println("Personel dinleniyor.");
    }

    public void calis() {
        System.out.println("Personel calisiyor.");
    }
}

class Isci extends Personel {
    @Override
    public void dinlen() {
        System.out.println("Isci dinleniyor.");
    }

    public void temizlikYap() {
        System.out.println("Isci temizlik yapiyor.");
    }
}

class Memur extends Personel {
    public void raporYaz() {
        System.out.println("Memur rapor yaziyor.");
    }
}
