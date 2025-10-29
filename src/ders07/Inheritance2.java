package ders07;

class Parent2 {
	int x, y;

	public void assignVals(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Child2 extends Parent2 {
	public int multiply() {
		return x * y;
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.assignVals(5, 9);
		System.out.println("Result = " + child2.multiply());
	}
}
