package ders05;

public class MainArgs {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("HATA: Parametre girmediniz!..");
            return; // Attention - A void method
        }
        System.out.print("Parametre Sayısı: " + args.length + "\n");

        int a = 0;

        while (a < args.length) {
            System.out.println("args[" + a + "] = " + args[a++]);
        }
    }
}
