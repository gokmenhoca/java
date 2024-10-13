package ders04;

public class ForLoopMulti {
    public static void main(String[] args) {
        int i = 0, j = 0;

        for (i = 1, j = 9; ((i <= 9) && (j >= 1)); i++, j--) {
            System.out.printf("%d + %d = %d\n", i, j, i + j);
        }
        System.out.println();

        i = 0; j = 0;

        for (i = 1, j = 9; ((i < 9) && (j > 1)); i++, j--) {
            System.out.printf("%d + %d = %d\n", i, j, i + j);
        }
    }
}
