package ders13.collections;

import java.util.LinkedList;
import java.util.List;

public class ListWithType {
  public static void main(String[] args) {
    List<String> myList = new LinkedList<>();

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
