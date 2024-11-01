package ders06;

class Phones {
    int price;
    public Phones() {
        System.out.println("Constructor of Phones.");
    }
}
class CellPhone extends Phones {
    public CellPhone() {
        System.out.println("Constructor of CellPhone.");
    }
}
class SmartPhone extends Phones {
    public SmartPhone() {
        System.out.println("Constructor of SmartPhone.");
    }
}
class Nokia extends CellPhone {
    public Nokia() {
        System.out.println("Constructor of Nokia.");
    }
}
class Samsung extends SmartPhone {
    public Samsung() {
        System.out.println("Constructor of Samsung.");
    }
}
public class Inheritance4 {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        nokia.price = 100;
        Samsung samsung = new Samsung();
        samsung.price = 250;
    }
}
