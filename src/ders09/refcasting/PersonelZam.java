package ders09.refcasting;

public class PersonelZam {
    private static void mesai(Personel p) {
        if (p instanceof Isci) {
            ((Isci) p).temizlikYap();
        } else if (p instanceof Memur) {
            ((Memur) p).raporYaz();
        }
    }

    public static void zamYap(Personel p) {
        if (p instanceof Isci) {
            ((Isci) p).maas += (((Isci) p).maas * 0.15);
        } else if (p instanceof Memur) {
            ((Memur) p).maas += (((Memur) p).maas * 0.14);
        }
    }

    public static void maasGoster(Personel p) {
        System.out.println(p.name + " maasi: " + p.maas);
    }

    public static void main(String[] args) {
        Personel i = new Isci();
        Personel m = new Memur();

        i.name = "Isci";
        i.maas = 1200;
        m.name = "Memur";
        m.maas = 1150;
        mesai(i);
        mesai(m);
        zamYap(i);
        zamYap(m);
        maasGoster(i);
        maasGoster(m);
        i.dinlen();
        m.dinlen();
    }
}
