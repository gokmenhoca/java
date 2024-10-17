package ders04;

public class StringPool {
    public static void main(String[] args) {
        String s1 = new String("Teknoloji");
        String s2 = new String("Tekno");
        String s3 = new String("loji");
        String s4 = s2 + s3;
        String s5 = "Tek" + "noloji";

        System.out.println(s1 == s4); // false
        System.out.println(s1.equals(s4)); // true
        System.out.println(s1 == s5); // false
        System.out.println(s1.equals(s5)); // true
    }
}
