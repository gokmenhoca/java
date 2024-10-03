package ders02;

public class VakitApp {
    public static void main(String[] args) {
        Vakit vkt = new Vakit();

        vkt.saat   = 23;
        vkt.dakika = 59;
        vkt.saniye = 59;

        vkt.vakitYaz();
        vkt.ilerlet();
        vkt.vakitYaz();
    }
}
