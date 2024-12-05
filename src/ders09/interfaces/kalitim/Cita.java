package ders09.interfaces.kalitim;

public class Cita implements IHizli {
  @Override
  public void hizliKos() {
    System.out.println("Cita hizli kosuyor.");
  }

  @Override
  public void nefesAl() {
    System.out.println("Cita nefes aliyor.");
  }
}
