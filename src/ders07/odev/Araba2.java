package ders07.odev;

public class Araba2 extends Araba {
    private int motor;

    Araba2(String marka, int motor) {
        super(marka);
        this.motor = motor;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Motor Hacmi     : " + getMotor());
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
}
