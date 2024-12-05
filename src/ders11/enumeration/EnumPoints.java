package ders11.enumeration;

enum Points {
  Mazhar(0), Fuat(0), Ozkan(0);
  int point;

  Points(int param) {
    point = param;
  }

  int showPoints() {
    return point;
  }

  static double avgPoints() {
    return (Mazhar.point + Fuat.point + Ozkan.point) / 3.0;
  }
}

public class EnumPoints {
  public static void main(String[] args) {
    Points.Mazhar.point = 98;
    Points.Fuat.point   = 99;
    Points.Ozkan.point  = 95;

    System.out.println("Mazhar   : " + Points.Mazhar.showPoints());
    System.out.println("Fuat     : " + Points.Fuat.showPoints());
    System.out.println("Ozkan    : " + Points.Ozkan.showPoints());
    System.out.printf("Ortalama : %.2f", Points.avgPoints());
  }
}
