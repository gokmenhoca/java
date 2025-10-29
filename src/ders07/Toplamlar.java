package ders07;

class Toplam {
	public void islemYap(int a, int b) {
		int sonuc = a + b;
		System.out.println("Sonuc1 = " + sonuc);
	}

	public void islemYap(int a, double b) {
		double sonuc = a + b;
		System.out.println("Sonuc2 = " + sonuc);
	}

	public void islemYap(double a, int b) {
		double sonuc = a + b;
		System.out.println("Sonuc3 = " + sonuc);
	}

	public void islemYap(float a, int b) {
		float sonuc = a + b;
		System.out.println("Sonuc4 = " + sonuc);
	}
}

public class Toplamlar {
	public static void main(String[] args) {
		Toplam top = new Toplam();

		top.islemYap(3, 4);
		top.islemYap(3, 5.51);
		top.islemYap(6.86, 4);
		top.islemYap(6.86f, 4);
	}
}
