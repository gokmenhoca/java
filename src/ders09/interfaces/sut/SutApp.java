package ders09.interfaces.sut;

public class SutApp {
  public static void main(String[] args) {
    Sut s = new Sut();

    s.setName("Sut");
    System.out.print(s.getName() + " ");
    s.feed();

    Yogurt y = new Yogurt();
    y.setName("Yogurt");
    System.out.print(y.getName() + " ");
    y.feed();

    Peynir p = new Peynir();
    p.setName("Peynir");
    System.out.print(p.getName() + " ");
    p.feed();

    Ayran a = new Ayran();
    a.setName("Ayran");
    System.out.print(a.getName() + " ");
    a.feed();
  }
}
