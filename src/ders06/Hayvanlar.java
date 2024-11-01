package ders06;

class Hayvan {
    String name;
    public void beslen() {
        System.out.println(this.name + " beslenir...");
    }
}
class Kedi extends Hayvan {
    public Kedi() { this.name = "Kedi"; }
    public void yuru() {
        System.out.println(this.name + " yurur...");
    }
}
class Kus extends Hayvan {
    public Kus() { super.name = "Kus"; }
    public void uc() {
        System.out.println(this.name + " ucar...");
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
