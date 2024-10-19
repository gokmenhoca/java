package ders05;

public class ArrayReturn {
    public int[] fillArray(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int         n        = 5;
        ArrayReturn arr      = new ArrayReturn();
        int[]       argArray = new int[n];
        int[]       retArray = new int[n];
        retArray = arr.fillArray(argArray);

        for (int i = 0; i < retArray.length; i++) {
            System.out.print(retArray[i] + " ");
        }
    }
}
