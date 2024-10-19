package ders05;

public class ArrayDefs {
    public static void main(String[] args) {
        int[]    num = new int[] { 1234, 2746, 1785, 8732, 1079 }; // Explicitly
        double[] dbl = { 2.1, 3.4, 4.6, 1.1, 0.11 };               // Implicitly
        String[] str;                                              // Define
                                                                   // Array

        str = new String[5]; // Allocate Memory
        str[0] = new String("defter");
        str[1] = new String("kalem");
        str[2] = new String("sarman");
        str[3] = new String("tekir");
        str[4] = new String("boncuk"); // Fill the elements
        System.out.println("---------------");

        for (int j = 0; j < num.length; j++) {
            System.out.println("num[" + j + "] = " + num[j]);
        }
        System.out.println("---------------");

        for (int i = 0; i < dbl.length; i++) {
            System.out.println("dbl[" + i + "] = " + dbl[i]);
        }
        System.out.println("---------------");

        for (int x = 0; x < str.length; x++) {
            System.out.println("str[" + x + "] = " + str[x]);
        }
    }
}
