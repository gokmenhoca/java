package ders09.interfaces.sekil;

public class Kare extends Sekil {
  public Kare() {
    x = 0;
  }

  public Kare(double x) {
    this.x = x;
  }

  @Override
  public void alanHesapla(double x) {
    this.x = x;
    sonuc  = (Math.pow(this.x, 2.0));
  }
}
