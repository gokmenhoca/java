package ders07;

class Parent3 {
	@SuppressWarnings("unused")
	private int ogrNo = 121;
}

class Child3 extends Parent3 {
	public String ogrAd = "Ruhi BUNALIM";
}

public class Inheritance3 {
	public static void main(String[] args) {
		Child3 child3 = new Child3();
		System.out.println(child3.ogrAd);
		System.out.println(child3.ogrNo); // Error
	}
}
