package ders11.enumeration;

enum Colors {Red, Green, Blue}

public class EnumColors {
  public static void main(String[] args) {

    for (Colors color : Colors.values()) {
      System.out.println("Colors[" + color.ordinal() + "): " + color);
    }

    System.out.println(Colors.valueOf("Red"));

    // Below line is invalid, no WHITE element in enumeration
    System.out.println(Colors.valueOf("WHITE"));
  }
}
