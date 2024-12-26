package ders13.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
  public static void printList(String desc, LinkedList<String> list) {
    // Check the list if empty or not
    if (!list.isEmpty()) {
      System.out.print(desc + " : " + list);
    } else {
      System.out.print(desc + " : (Empty)");
    }
    // Print the number of elements at the end
    System.out.println(" (" + list.size() + ")");
  }

  public static void main(String[] args) {
    // Construct an ArrayList using the list of elements in an Array
    LinkedList<String> lst1 = new LinkedList<String>(
        Arrays.asList("Ali", "Aliye", "Veli", "Selami", "Kamil", "Ayşe", "Nuri"));

    // Add elements to list lst1
    lst1.add("Nuriye");
    printList("add(i)", lst1);

    // Get an element in index 3 from the list
    System.out.println("get(3): " + lst1.get(3));

    // Get the first element from the list
    System.out.println("getFirst(): " + lst1.getFirst());

    // Get the last element from the list
    System.out.println("getLast(): " + lst1.getLast());

    // Add an element before the first element of lst1
    lst1.addFirst("Arife");
    printList("addFirst(\"Arife\")", lst1);

    // Add an element after the last element of lst1
    lst1.addLast("Ruhi");
    printList("addLast(\"Ruhi\")", lst1);

    // Change the value of the 3rd element to '4' in 'lst1'
    lst1.set(3, "Zafer");
    printList("set(3, \"Zafer\")", lst1);

    // Check if lst1 contains an element index value of 15 and remove
    if (lst1.contains("Zafer"))
      lst1.remove(3);
    printList("remove(3)", lst1);

    // Insert the value '5' to the index where the 4th element is located
    lst1.add(3, "Veli");
    printList("add(3, \"Veli\")", lst1);

    // Remove the first element in 'lst1'
    lst1.removeFirst();
    printList("removeFirst()", lst1);

    // Remove the last element in 'lst1'
    lst1.removeLast();
    printList("removeLast()", lst1);

    // Remove the element whose value is '5'
    lst1.removeIf((e) -> (Boolean) (e == "Kamil"));
    printList("After removeIf((e) -> (Boolean) (e == \"Kamil\"))", lst1);

    // Create the list 'lst2' by cloning the list 'lst1'
    LinkedList<String> lst2 = (LinkedList<String>) lst1.clone();
    printList("Cloned lst2 ", lst2);

    // Check if 'lst1' and 'lst2' references are the same
    if (lst1.equals(lst2)) {
      System.out.println("lst1 equals to lst2");
    } else {
      System.out.println("lst1 not equals to lst2");
    }

    // Clear the list 'lst2'
    lst2.clear();
    printList("clear()", lst2);

    // Add all elements of 'lst1' to 'lst2'
    lst2.addAll(lst1);
    printList("addAll(lst1)", lst2);

    // Print each element in 'lst2'
    System.out.print("forEach(e -> System.out.print(e + \" \")) : ");
    lst2.forEach(e -> System.out.print(e + " "));
    System.out.println();

    // Replace each element's value by 'Unknown'.
    lst2.replaceAll(e -> "Unknown");
    printList("replaceAll(e -> \"Unknown\")", lst2);

    // Remove all elements in 'lst2'
    lst2.removeAll(lst2);
    printList("removeAll(lst2)", lst2);

    // Initialize an Iterator for 'lst1' (Forward Iterator)
    Iterator<String> iter = lst1.iterator();

    // Print the element if iterator has the next element
    System.out.print("iter.next() : ");

    while (iter.hasNext()) {
      String i = iter.next();
      System.out.print(i + " ");
    }
    System.out.println();

    iter = lst1.iterator();
    // Advance Iterator by one and print the
    // remaing elements by forEachRemaining()
    iter.next();
    System.out.print("iter.forEachRemaining() : ");
    iter.forEachRemaining(e -> System.out.print(e + " "));
    System.out.println();

    // Initialize a listIterator for 'lst1' (Forward ListIterator)
    ListIterator<String> listIter = lst1.listIterator();

    // Print the element if listIter has the next element
    System.out.print("listIter.next() : ");

    while (listIter.hasNext()) {
      System.out.print(listIter.next() + " ");
    }
    System.out.println();

    // Construct a ListIterator object for 'lst1' (Backward ListIterator)
    listIter = lst1.listIterator(lst1.size()); // Constructor differs

    // Print the element if listIter has the previous element
    System.out.print("listIter.previous() : ");

    while (listIter.hasPrevious()) {
      System.out.print(listIter.previous() + " ");
    }
    System.out.println();

    System.out.print("for-each loop : ");
    for (String a : lst1) {
      System.out.print(a + " ");
    }
    System.out.println();

    // Remove all elements range between 1 (inclusive) and 4 (exclusive)
    lst1.subList(1, 4).clear();
    printList("subList(1, 4).clear() : ", lst1);
  }
}
