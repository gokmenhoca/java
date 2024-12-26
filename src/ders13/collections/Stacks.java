package ders13.collections;

import java.util.Stack;

public class Stacks {
  public static void main(String[] args) {
    Stack s = new Stack<>(); // Vector s = new Stack<>(); Is this valid? 
    s.push("Ali");
    s.push("Ayşe");
    s.push("Kamil");
    s.push("Meryem");
    s.push("Muhammed");
    s.push("Furkan");

    System.out.println("Stack's content    : " + s);
    // Pop (Get) an element from the stack and remove it
    System.out.println("Top element (POP)  : " + s.pop());
    // Fetch element present at the top without removing
    System.out.println("Top element (PEEK) : " + s.peek());
    // Search for an element and get its distance from the top
    System.out.println("Location of 'Ayşe' : " + s.search("Ayşe"));
    // Clear the stack
    s.clear();
    // Check the stack if empty or not
    if (s.empty()) {
      System.out.println("Stack is empty");
    }
  }
}
