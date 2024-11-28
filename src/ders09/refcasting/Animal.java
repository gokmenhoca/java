package ders09.refcasting;

public class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void move() {
        System.out.println("Animal is moving");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Cat extends Animal {
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    public void meow() {
        System.out.println("Meow Meow!");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void bark() {
        System.out.println("Gow gow!");
    }
}
