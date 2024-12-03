package ders09.refcasting;

public class PersonelCalis {
    public static void main(String[] args) {
        Personel personel = new Isci();
        Isci isci = (Isci) personel; // DownCasting

        isci.temizlikYap(); // Call temizlikYap() of Isci
        isci.calis(); // Call calis() of Personel
        isci.dinlen(); // Call dinlen() of Isci
    }
}
