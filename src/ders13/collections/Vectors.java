package ders13.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectors {
  static class Sayi {    // Inner Class
    private Integer sayi;

    public Sayi() {
      sayi = 0;
    }

    public Sayi(Integer d) {
      sayi = d;
    }

    public Integer getSayi() {
      return sayi;
    }

    public void setSayi(Integer sayi) {
      this.sayi = sayi;
    }
  }

  public static void main(String[] args) {
    Sayi         s1  = new Vectors.Sayi();
    Sayi         s2  = new Vectors.Sayi(5);
    Sayi         s3  = new Vectors.Sayi(9);

    Vector<Sayi> vec = new Vector<>();
    vec.add(s1);
    vec.add(s2);
    vec.add(s3);
    vec.add(1, new Vectors.Sayi(2));

    // Print the all elements by forEach()
    System.out.print("forEach() (initial)   : ");
    vec.forEach(e -> System.out.print(e.getSayi() + " "));
    System.out.println();

    // Construct an Iterator (fIter) for 'vec' (Forward Iterator)
    Iterator<Sayi> fIter = vec.iterator();

    // Advance Iterator by one
    fIter.next();

    // Print the remaing elements by forEachRemaining()
    System.out.print("forEachRemaining()    : ");
    fIter.forEachRemaining(e -> System.out.print(e.getSayi() + " "));
    System.out.println();

    // Set the sayi value of element in 2nd index
    vec.get(2).setSayi(30);

    // Print the all elements by forEach()
    System.out.print("forEach() (after set) : ");
    vec.forEach(e -> System.out.print(e.getSayi() + " "));
    System.out.println();

    // Construct an Iterator (bIter) for 'vec' (Backward Iterator)
    ListIterator<Sayi> bIter = vec.listIterator(vec.size());

    // Print the element if bIter has the previous element
    System.out.print("bIter.previous()      : ");
    while (bIter.hasPrevious())
      System.out.print(bIter.previous().getSayi() + " ");
  }
}