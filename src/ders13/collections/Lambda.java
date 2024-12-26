package ders13.collections;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lambda {

  private static boolean isPrime(int number) {
    if(number < 2) return false;
    for(int i=2; i<number; i++){
      if(number % i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Predicate<Integer> test = e -> isPrime(e);

    list.add(8);
    list.add(17);
    list.add(21);

    list.removeIf(test);

    System.out.println(list);
  }
}
