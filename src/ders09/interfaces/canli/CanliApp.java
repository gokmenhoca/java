package ders09.interfaces.canli;

public class CanliApp {
  public static void main(String[] args) {
    Insan human = new Insan();
    human.name = "Insan";
    human.swim();
    human.showAction();

    Penguen peng = new Penguen();
    peng.name = "Penguen";
    peng.walk();
    peng.showAction();
  }
}
