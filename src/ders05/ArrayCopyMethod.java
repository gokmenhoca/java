package ders05;

public class ArrayCopyMethod {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 80, 70, 60, 50, 40, 30, 20, 10 };
        System.arraycopy(arr1, 2, arr2, 2, arr1.length - 2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
