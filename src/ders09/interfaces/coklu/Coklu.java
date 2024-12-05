package ders09.interfaces.coklu;

public class Coklu {
  public static void main(String[] args) {
    Personel p = new Personel();
    IPerson  h = p;

    p.setJob("Ogr.Gor.");
    h.setName("Mustafa GOKMEN");
    p.setDept("Bilgisayar Muh. Bolumu");
    h.setMail("gokmen@selcuk.edu.tr");
    System.out.println(p.job + p.name);
    System.out.println(p.dept);
    System.out.println(p.mail);
    System.out.println("---------------");

    Student s = new Student();
    IPerson o = s;

    s.setNum("993301325");
    o.setName("Ruhi BUNALIM");
    s.setMail("ruhi@bunalim.com");
    System.out.println(s.num);
    System.out.println(s.name);
    System.out.println(s.mail);
  }
}
