package ders09.interfaces.sekil;

public class Daire extends Sekil {
  public Daire() {
    x = 0;
  }

  public Daire(double x) {
    this.x = x;
  }

  @Override
  public void alanHesapla(double x) {
    sonuc = (Math.PI * Math.pow(x, 2.0));
  }
}
