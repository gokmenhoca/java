package ders07;

class Phone {
	public int price;

	public Phone() {
		System.out.println("Constructor of Phone.");
	}
}

class CellPhone extends Phone {
	public CellPhone() {
		System.out.println("Constructor of CellPhone.");
	}
}

class SmartPhone extends Phone {
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
		Nokia   nokia   = new Nokia();
		Samsung samsung = new Samsung();

		nokia.price   = 100;
		samsung.price = 250;
	}
}
