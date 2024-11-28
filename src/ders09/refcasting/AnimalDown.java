package ders09.refcasting;

public class AnimalDown {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();

        Dog dog = (Dog) animal; // DownCasting

        dog.bark();
        dog.eat(); // Overriding
        dog.move();
        animal = new Cat();

        Cat cat = (Cat) animal; // Downcasting

        cat.meow();
        cat.sleep(); // Overriding
        cat.move();
    }
}
