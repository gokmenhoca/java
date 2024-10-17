package ders04;

public class ForEach02 {
    public static int maksimum(int[] sayilar) {
        int enbuyuk = sayilar[0];

        for (int s : sayilar) {

            if (s > enbuyuk) {
                enbuyuk = s;
            }
        } // Diziler konusunda daha fazlasını göreceğiz.
        return enbuyuk;
    }

    public static void main(String[] args) {
        int[] ucret = { 850, 970, 615, 550, 488, 827, 995, 108 };
        int   max   = maksimum(ucret);
        System.out.println("En yüksek ücret: " + max);
    }
}
