package ders07;

class Keci {
    String keci;

    protected void goster() {
        System.out.print(keci);
    }
}

class Oglak extends Keci {
    private String oglak = "dama cikan oglu";

    public void goster() {
        System.out.println(oglak + " olur.");
    }

    void eylem() {
        super.keci = "Dala cikan kecinin, ";
        super.goster();
        goster();
    }
}

public class Keciler {
    public static void main(String args[]) {
        Oglak oglak = new Oglak();
        oglak.eylem();
    }
}
