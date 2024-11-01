package ders06.odev;

public class ArabaApp {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        Araba a = new Araba("TOGG");
        a.showInfo();
        System.out.println("----------------------------------");
        Araba1 a1 = new Araba1("Ford", 5);
        a1.showInfo();
        System.out.println("----------------------------------");
        Araba2 a2 = new Araba2("Toyota", 1600);
        a2.showInfo();
        System.out.println("----------------------------------");
        Araba3 a3 = new Araba3("Walkswagen", "Kirmizi");
        a3.showInfo();
        System.out.println("----------------------------------");
        Araba2s a2s = new Araba2s("Toyota", 1600, "SUV");
        a2s.showInfo();
        System.out.println("----------------------------------");
    }
}
