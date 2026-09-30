package ders03.variables;

public class VariableTypes {
  int        objVariable;   // Nesne değişkeni
  static int classVariable; // Class Variable

  void hesapla(String kelime, int kdv) {
    static int lastVal    = 1;  // Geçersiz (static)
    int        charLength = 10; // Geçerli

    { // yerel kod blokları
      int totalSize; // ilk değer atanmadığı için
      totalSize++; // bu satır hata verecektir.
    }
  }

  public static void main(String[] args) {
    VariableTypes vt = new VariableTypes();
    vt.objVariable = 10;
    classVariable  = 100;
  }
}
