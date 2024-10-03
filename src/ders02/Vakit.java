package ders02;

public class Vakit {
    public int saat;   // = 0
    public int dakika; // = 0
    public int saniye; // = 0

    public void ilerlet() {
        saniye++;
        // TODO : Saniye bir artırılınca saatin yeni değerini hesaplayacak
        // şekilde metodu tamamlayınız.
    }

    public void vakitYaz() {
        System.out.printf(" Zaman : %d:%d:%d\n", saat, dakika, saniye);
        // TODO : Ekran çıktısını örnekte görüldüğü şekilde yapılandıracak
        // printf ifadesini düzenleyiniz. ÖRNEK ÇIKTI -> Zaman : 03:09:15
    }
}
