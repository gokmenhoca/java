package ders05;

import java.util.Random;

public class ArrayRandomize {
    public static void main(String[] args) {
        Random rnd     = new Random();
        int[]  myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(10000);
            System.out.println(myArray[i]);
        }
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println((int) Math.random()); // 0 ?
        System.out.println((int) (Math.random() * 10));
    }
}
