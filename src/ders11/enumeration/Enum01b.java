package ders11.enumeration;

enum Cars {
  Tata(70), Suzuki(100), Sahin(240);
  public int speed;

  Cars(int spd) {
    speed = spd;
  }
}

public class Enum01b {
  public static void main(String[] args) {
    Cars.Tata.speed = 90;

    System.out.println(Cars.Tata.toString() + ": " + Cars.Tata.speed + "km/s");
    System.out.println(Cars.Suzuki.toString() + ": " + Cars.Suzuki.speed + "km/s");
    System.out.println(Cars.Sahin.toString() + ": " + Cars.Sahin.speed + "km/s :)");
  }
}
