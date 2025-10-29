package ders07;

class Araba {
	String constr;
	String marka;
	String model;

	public Araba() {
		this.constr = "(Default)";
		marka = "Yok";
		model = "Yok";
	}

	public Araba(String marka) {
		this.constr = "(Overloaded - 1)";
		this.marka = marka;
		model = "Yok";
	}

	public Araba(String marka, String model) {
		this(model); // Must be in first line
		this.constr = "(Overloaded - 2)";
		this.model = model;
	}
}

public class Arabalar {
	public static void main(String[] args) {
		Araba[] a = new Araba[3];
		a[0] = new Araba();
		a[1] = new Araba("TOGG");
		a[2] = new Araba("TOGG", "T10X");

		for (int i = 0; i < 3; i++) {
			System.out.println("Marka : " + a[i].marka +
			                 "\tModel : " + a[i].model +
			                 "\tConst : " + a[i].constr
			                  );
		}
	}
}
