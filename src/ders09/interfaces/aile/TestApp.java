package ders09.interfaces.aile;

public class TestApp {
  protected static Erkek ogul = new Erkek();
  private static Kadin   kiz  = new Kadin("Ayse");
  public static Erkek    baba = new Erkek();

  public static void main(String[] args) {
    TestApp prg = new TestApp();
    prg.setValues();

    Aile anne = new Kadin();
    anne.setAd("Hatice");
    anne.setRol("Anne");
    anne.setYas(48);
    anne.setIs("Hemsire");

    Aile[] aile = {ogul, kiz, baba, anne};
    for (Aile a : aile) {
      System.out.println("-----------------------------");
      System.out.println("Rolu     : " + a.getRol());
      System.out.println("Adi      : " + a.getAd());
      System.out.println("Cinsiyet : " + a.getCinsiyet());
      System.out.println("Yasi     : " + a.getYas());
      System.out.println("Isi      : " + a.getIs());
      System.out.println("Ulkesi   : " + IToplum.ulke);
    }
    prg.printFooter(IToplum.cizen);
  }

  public void setValues() {
    ogul.setRol("Ogul");
    ogul.setAd("Remzi");
    ogul.setYas(27);
    ogul.setIs("Muhendis");
    kiz.setRol("Kiz");
    kiz.setYas(23);
    kiz.setIs("Doktor");
    baba.setRol("Baba");
    baba.setAd("Kazim");
    baba.setYas(50);
    baba.setIs("Gazeteci");
  }

  public void printFooter(String cizen) {
    System.out.println("-----------------------------");
    System.out.printf("Cizen:)  : %s\n", cizen);
    System.out.println("-----------------------------");
  }
}
