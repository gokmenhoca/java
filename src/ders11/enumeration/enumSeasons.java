package ders11.enumeration;

enum Seasons {
  Spring("Ilkbahar", 92), 
  Summer("Yaz", 92), 
  Autumn("Sonbahar", 91), 
  Winter("Kis", 90);
  String  ad;
  Integer gun;

  Seasons(String ad, Integer gun) {
    this.ad  = ad;
    this.gun = gun;
  }
}

public class enumSeasons {
  public static void main(String[] args) {
    for (Seasons s : Seasons.values()) {
      System.out.printf("%s. %8s %d gundur.\n", s.ordinal() + 1, s.ad, s.gun);
    }
  }
}
