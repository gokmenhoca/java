package ders07;

class Calculate {
    void compute(double a, double b) {
        System.out.println("Calculator: " + (a * b));
    }

    final void compute(int a, int b) {
        System.out.println("Calculator  : " + (a * b));
    }
}

class Compute extends Calculate {
    @Override
    void compute(double a, double b) {
        System.out.println("Computer  : " + (a + b));
    }
}

public class Hesaplama {
    public static void main(String args[]) {
        Compute comp = new Compute();
        Calculate calc = new Calculate();
        comp.compute(2.5, 2.5); // Calls Computer
        calc.compute(3.0, 3.0); // Calls Calculator
        calc.compute(2, 3); // Calls Computer
    }
}
