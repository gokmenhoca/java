package ders03.variables;

public class StaticField {
  static int a = 3;
  int        b;

  public static void main(String[] args) {
    StaticField sf = new StaticField();

    sf.b = a;
    sf.displayNum(sf.b);
    displayNum(a); // Error: displayNum() is not static
  }

  public void displayNum(int param) {
    //static int c = 2; // Error
    System.out.println("Sayi : " + param);
  }
}
