package ders07.odev;

public class Araba1 extends Araba {
    private int yolcu;

    Araba1(String marka, int yolcu) {
        super(marka);
        this.yolcu = yolcu;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Yolcu Sayisi    : " + getYolcu());
    }

    public int getYolcu() {
        return yolcu;
    }

    public void setYolcu(int yolcu) {
        this.yolcu = yolcu;
    }
}
