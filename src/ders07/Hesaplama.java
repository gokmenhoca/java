package ders07;

class Calculate {
	void compute(double a, double b) {
		System.out.println("Calculate: " + (a * b));
	}

	final void compute(int a, int b) {
		System.out.println("Calculate: " + (a * b));
	}
}

class Compute extends Calculate {
	void compute(double a, double b) {
		System.out.println("Compute  : " + (a + b));
	}
}

public class Hesaplama {
	public static void main(String args[]) {
		Compute comp = new Compute();
		Calculate calc = new Calculate();
		comp.compute(2.5, 2.5); // Calls Compute's compute
		calc.compute(3.0, 3.0); // Calls Calculate's compute
		calc.compute(2, 3); // Calls Calculate's final compute
	}
}
