package ders02;

public class Vakit {
    public int saat;
    public int dakika;
    public int saniye;

    public void ilerlet() {
        saniye++;

        if (saniye == 60) {
            saniye = 0;
            dakika++;

            if (dakika == 60) {
                dakika = 0;
                saat++;

                if (saat == 24) {
                    saat = 0;
                }
            }
        }
    }

    public void vakitYaz() {
        System.out.printf("Zaman : %0,2d:%0,2d:%0,2d\n", saat, dakika, saniye);
    }
}
