package ders05;

public class ArrayForEach {
    public static void lstFiyat(int[] arr) {
        System.out.print("Fiyatlar : ");

        for (int s : arr) {
            System.out.printf("%d ", s);
        }
        System.out.println();
    }

    public static int maxFiyat(int[] arr) {
        int most = arr[0];

        for (int s : arr) {

            if (s > most) {
                most = s;
            }
        }
        return most;
    }

    public static int ortFiyat(int[] arr) {
        int toplam = 0;

        for (int element : arr) {
            toplam += element;
        }
        return toplam / arr.length;
    }

    public static void main(String[] args) {
        int[] arrFiyat = { 850, 970, 615, 827, 995, 108 };
        lstFiyat(arrFiyat);
        System.out.println("En yüksek: " + maxFiyat(arrFiyat));
        System.out.println("Ortalama : " + ortFiyat(arrFiyat));
    }
}
