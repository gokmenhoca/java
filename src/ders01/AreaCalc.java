package ders01;

public class AreaCalc {
    double      radius;
    private int width; // Warning (defined but not used)
    static int  height;

    public double areaCircle(double radius) {
        double area;
        area = radius * radius * Math.PI;
        return area;
    }
}
