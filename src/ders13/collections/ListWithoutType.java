package ders13.collections;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutType {
  public static void main(String[] args) {
    List myList = new ArrayList<>();

    myList.add('A');
    myList.add(2.2);
    myList.add(1);
    myList.add(3.3f);
    myList.add("Teknoloji");
    myList.add(new String("Selçuk"));
    myList.add(myList);

    myList.forEach(e -> System.out.println(e));
  }
}
