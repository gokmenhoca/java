package ders03.variables;

public class FinalVars {
  private final int num;

  public FinalVars(int a) {
    num = a;
  }

  public void setNum(final int a) {
    a++; // Parameter 'a' is final
    num = a; // Field 'num' is final
  }

  public int getNum() {
    return num;
  }

  public static void main(String[] args) {
    FinalVars fVars = new FinalVars(5);
    fVars.setNum(30);
    System.out.println(fVars.getNum());
  }
}
