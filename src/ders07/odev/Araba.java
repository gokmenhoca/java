package ders07.odev;

public class Araba {
    private String marka;

    Araba(String marka) {
        this.marka = marka;
    }

    public void showInfo() {
        System.out.println("Arac Markasi    : " + marka);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
