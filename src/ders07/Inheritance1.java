package ders07;

class Parent1 {
	int x;

	public void method1() {
		System.out.println("inside of method1");
	}
}

class Child1 extends Parent1 {
	int y;

	public void method2() {
		System.out.println("inside of method2");
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.method1();
		child1.x = 7;
		System.out.println("child1.x = " + child1.x);
		child1.method2();

		Parent1 parent1 = new Parent1();
		parent1.method2(); // Error : Cannot call...
	}
}
