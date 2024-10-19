package ders05;

public class ArrayMulDiff {
    public static void main(String[] args) {
        //@formatter:off
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
             };
        //@formatter:on

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d  ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
