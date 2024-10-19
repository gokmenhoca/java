package ders05;

public class ArrayCopyIndex {
    public static void main(String[] args) {
        int[] arr1 = { 0, 2, 4, 6 };
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("-- Kopya --");

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("myArray2[%d]=%d\n", i, arr2[i]);
        }
    }
}
