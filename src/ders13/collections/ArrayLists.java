package ders13.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*****************************************************************
 *  ATTENTION: The following methods are valid in ArrayList Class
 *  since Java 21;
 *  addFirst(), addLast(), 
 *  getFirst(), getLast(),
 *  removeFirst(), removeLast()
 ****************************************************************/
public class ArrayLists {
  public static void printList(String desc, ArrayList<Integer> list) {
    // Check the list if empty or not
    if (!list.isEmpty()) {
      System.out.print(desc + ": " + list);
    } else {
      System.out.print(desc + ": (Empty)");
    }
    // Print the number of elements at the end
    System.out.println(" (" + list.size() + ")");
  }

  public static void main(String[] args) {
    // Construct an ArrayList using the list of elements in an Array
    ArrayList<Integer> lst1 = new ArrayList<Integer>();

    // Add elements to list lst1
    for (int i = 0; i <= 10; i++)
      lst1.add(i);
    printList("add(i)", lst1);

    // Get an element in index 3 from the list
    System.out.println("get(3): " + lst1.get(3));

    // Get the first element from the list
    System.out.println("getFirst(): " + lst1.getFirst());

    // Get the last element from the list
    System.out.println("getLast(): " + lst1.getLast());

    // Add an element before the first element of lst1
    lst1.addFirst(-1);
    printList("addFirst(-1)", lst1);

    // Add an element after the last element of lst1
    lst1.addLast(-1);
    printList("addLast(-1)", lst1);

    // Change the value of the 3rd element to '4' in 'lst1'
    lst1.set(3, 15);
    printList("set(3, 15)", lst1);

    // Check if lst1 contains an element index value of 15 and remove
    if (lst1.contains(15))
      lst1.remove(3);
    printList("remove(3)", lst1);

    // Insert the value '5' to the index where the 4th element is located
    lst1.add(3, 2);
    printList("add(3, 2)", lst1);

    // Remove the first element in 'lst1'
    lst1.removeFirst();
    printList("removeFirst()", lst1);

    // Remove the last element in 'lst1'
    lst1.removeLast();
    printList("removeLast()", lst1);

    // Remove the element whose value is '5'
    lst1.removeIf((e) -> (e == 0));
    printList("removeIf((e) -> (e == 0))", lst1);

    // Create the list 'lst2' by cloning the list 'lst1'
    ArrayList<Integer> lst2 = (ArrayList<Integer>) lst1.clone();
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

    // Remove elements in 'lst1' if it is the even number
    lst1.removeIf((e) -> (Boolean) ((e % 2) == 1));
    printList("After removeIf((e) -> ((boolean) (e % 2 == 1)))", lst1);

    // Remove all elements in a sublist of 'lst1' range between
    lst2.removeAll(lst1);
    printList("removeAll(lst1)", lst2);

    // Calculate the 2nd power of each element in 'lst2'
    System.out.print("forEach(e -> System.out.print(Math.pow(e, 2.0))): ");
    lst2.forEach(e -> System.out.print(Math.pow(e, 2.0) + " "));
    System.out.println();

    // Replace each element's value by one.
    lst2.replaceAll(e -> e + 1);
    printList("replaceAll(e -> e + 1)", lst2);

    // Contruct an Iterator for 'lst1' (Forward Iterator)
    Iterator<Integer> iter = lst1.iterator();

    // Print the element if iterator has the next element
    System.out.print("iter.next() : ");
    while (iter.hasNext()) {
      Integer i = iter.next();
      System.out.print(i + " ");
    }
    System.out.println();

    iter = lst1.iterator();
    // Advance Iterator by one
    iter.next();

    // Print the remaing elements by forEachRemaining()
    System.out.print("iter.forEachRemaining(e -> System.out.println(e)): ");
    iter.forEachRemaining(e -> System.out.print(e + " "));
    System.out.println();

    // Initialize a listIterator for 'lst2' (Forward ListIterator)
    ListIterator<Integer> listIter = lst2.listIterator();

    // Print the element if listIter has the next element
    System.out.print("listIter.next() : ");

    while (listIter.hasNext()) {
      System.out.print(listIter.next() + " ");
    }
    System.out.println();

    // Initialize a listIterator for 'lst2' (Backward ListIterator)
    listIter = lst2.listIterator(lst2.size()); // Constructor differs

    // Print the element if listIter has the previous element
    System.out.print("listIter.previous() : ");

    while (listIter.hasPrevious()) {
      System.out.print(listIter.previous() + " ");
    }
    System.out.println();

    System.out.print("for-each loop : ");

    for (Integer a : lst1) {
      System.out.print(a + " ");
    }
    System.out.println();

    // Remove all elements range between 1 (inclusive) and 4 (exclusive)
    lst1.subList(1, 4).clear();
    printList("subList(1, 4).clear() : ", lst1);
  }
}
