package ders09.interfaces.sekil;

public class SekilApp {
  public static void main(String[] args) {
    Kare kare = new Kare();

    kare.alanHesapla(1.0);
    System.out.printf("Karenin Alani  = ");
    System.out.printf("%.2f\n", kare.sonuc);

    Daire daire = new Daire(1.0);

    daire.alanHesapla();
    System.out.printf("Dairenin Alani = ");
    System.out.printf("%.2f\n", daire.sonuc);
    System.out.printf("(C)Copyleft by %s", ISekil.yazan);
  }
}
