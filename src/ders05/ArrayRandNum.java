package ders05;

import java.util.Random;

public class ArrayRandNum {
    public static void main(String[] args) {
        Random   rand   = new Random();
        int[]    iArray = new int[10];
        double[] dArray = new double[10];

        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = rand.nextInt(100);
        }

        for (int i = 0; i < iArray.length; i++) {
            System.out.printf("iArray[%d]=%d\n", i, iArray[i]);
        }

        for (int i = 0; i < dArray.length; i++) {
            dArray[i] = rand.nextDouble();
        }

        for (int i = 0; i < dArray.length; i++) {
            System.out.printf("dArray[%d]=%.2f\n", i, dArray[i]);
        }
        System.out.printf("Boolean = %b\n", rand.nextBoolean());
        System.out.printf("Double  = %.2f\n", rand.nextDouble());
    }
}
