package ders05;

public class ArrayClone {
    public static void main(String[] args) {
        int[] arrOrig  = new int[] { 1, 3, 5 };
        int[] arrClone = arrOrig.clone();
        System.out.print("Diziler aynı");

        if (arrOrig != arrClone) {
            System.out.print(" değil");
        }
        System.out.println(".");

        for (int i = 0; i < arrOrig.length; i++) {
            System.out.println("arrOrig[" + i + "] = " + arrOrig[i] + " ");
        }

        for (int i = 0; i < arrClone.length; i++) {
            System.out.println("arrClone[" + i + "] = " + arrClone[i] + " ");
        }
    }
}
