package ders07;

class Hayvan {
	String name;

	public void beslen() {
		System.out.println(name + " beslenir...");
	}
}

class Kedi extends Hayvan {
	public Kedi() {
		name = "Kedi";
	}

	public void yuru() {
		System.out.println(name + " yürür...");
	}
}

class Kus extends Hayvan {
	public Kus() {
		super.name = "Kuş";
	}

	public void uc() {
		System.out.println(name + " uçar...");
	}
}

public class Hayvanlar {
	public static void main(String[] args) {
		Kedi kedi = new Kedi();
		kedi.beslen();
		kedi.yuru();

		Kus kus = new Kus();
		kus.beslen();
		kus.uc();
	}
}
