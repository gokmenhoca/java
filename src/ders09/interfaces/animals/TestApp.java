package ders09.interfaces.animals;

public class TestApp {
  public static void main(String[] args) {
    Crocodile crocodile = new Crocodile("Nil Timsahi");
    String    name      = crocodile.getName();
    System.out.println(name + " :");
    System.out.println("\t" + crocodile.hunt());
    System.out.println("\t" + crocodile.swim());
    System.out.println("\t" + crocodile.walk());

    Eagle eagle = new Eagle();
    eagle.setName("Anadolu Kartali");
    name = eagle.getName();
    System.out.println(name + " :");
    System.out.println("\t" + eagle.hunt());
    System.out.println("\t" + eagle.fly());
    System.out.println("\t" + eagle.walk());

    Lion lion = new Lion();
    lion.setName("Afrika Aslani");
    name = lion.getName();
    System.out.println(name + " :");
    System.out.println("\t" + lion.hunt());
    System.out.println("\t" + lion.walk());
  }
}
