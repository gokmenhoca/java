package ders09.refcasting;

public class CastUpPersonel {
    public static void main(String[] args) {
        Isci isci = new Isci();

        isci.temizlikYap();
        isci.dinlen();

        Personel personel = new Isci();

        personel.calis(); // Call calis() of Personel
        personel.dinlen(); // Call dinlen() of Isci
    }
}
