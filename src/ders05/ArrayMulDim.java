package ders05;

public class ArrayMulDim {
    public static void main(String args[]) {
        int[][] arr = new int[3][4];

        //@formatter:off
        arr[0][0] = 45; arr[0][1] = 83; arr[0][2] = 11; arr[0][3] = 18;
        arr[1][0] = 17; arr[1][1] = 56; arr[1][2] = 26; arr[1][3] = 79;
        arr[2][0] = 13; arr[2][1] = 93; arr[2][2] = 43; arr[2][3] = 12;
        //@formatter:on

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d    ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
