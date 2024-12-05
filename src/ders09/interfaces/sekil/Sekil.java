package ders09.interfaces.sekil;

public abstract class Sekil implements ISekil {
  public double x;
  public double sonuc;

  @Override
  public double alanHesapla() {
    alanHesapla(x);
    return sonuc;
  }

  @Override
  public void setX(double x) {
    this.x = x;
  }

  public abstract void alanHesapla(double x);  // ???
}
