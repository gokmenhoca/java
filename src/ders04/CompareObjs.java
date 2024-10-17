package ders04;

public class CompareObjs {
    public static void main(String[] args) {
        String str1 = new String("Yeni bir metin");
        String str2 = new String("Yeni bir metin");

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true
    }
}
