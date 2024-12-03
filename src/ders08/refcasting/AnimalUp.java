package ders09.refcasting;

public class AnimalUp {
    public static void main(String[] args) {
        Animal cat = new Cat();

        cat.eat();
        cat.sleep();

        Animal dog = new Dog();

        dog.eat();
        dog.sleep();
    }
}
