package ders07.odev;

public class Araba3 extends Araba {
    private String renk;

    Araba3(String marka, String renk) {
        super(marka);
        this.renk = renk;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Aracin Rengi    : " + getRenk());
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
