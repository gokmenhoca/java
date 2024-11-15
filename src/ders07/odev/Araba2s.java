package ders07.odev;

public class Araba2s extends Araba2 {
    private String segment;

    Araba2s(String marka, int motor, String segment) {
        super(marka, motor);
        this.segment = segment;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Arac Segmenti   : " + getSegment());
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }
}
