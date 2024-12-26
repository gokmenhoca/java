package ders13.collections;

import java.util.ArrayList;
import java.util.Calendar;

public class Performance {
  public static void main(String[] args) {
    ArrayList<Integer> liste = new ArrayList<Integer>();
    long               basla;
    long               sure;

    for (int i = 1; i < 4194304; ++i) {
      liste.add(i);
    }

    /* 1: Geleneksel for-each kullanarak index ile erişim */
    basla = Calendar.getInstance().getTimeInMillis();
    for (int i : liste) {
      int a = i;
    }
    sure = Calendar.getInstance().getTimeInMillis() - basla;
    System.out.printf("Traditional for-each loop -> %d ms\n", sure);
    /* ---------------------------------------------------------------- */

    /* 2: list.size() değerine kadar index ile erişim */
    basla = Calendar.getInstance().getTimeInMillis();
    for (int j = 0; j < liste.size(); j++) {
      int a = liste.get(j);
    }
    sure = Calendar.getInstance().getTimeInMillis() - basla;
    System.out.printf("Looping to list.size()    -> %d ms\n", sure);
    /* ---------------------------------------------------------------- */

    /* 3: Liste elemanlarına ters sırada (en sondan en başa) erişim */
    basla = Calendar.getInstance().getTimeInMillis();
    for (int j = liste.size() - 1; j >= 0; j--) {
      int a = liste.get(j);
    }
    sure = Calendar.getInstance().getTimeInMillis() - basla;
    System.out.printf("Looping reverse order     -> %d ms\n", sure);
    /* ---------------------------------------------------------------- */

    // 4: Listenin eleman sayısını öğrendikten sonra index ile erişim
    basla = Calendar.getInstance().getTimeInMillis();
    int size = liste.size();
    for (int j = 0; j < size; j++) {
      int a = liste.get(j);
    }
    sure = Calendar.getInstance().getTimeInMillis() - basla;
    System.out.printf("Getting list size first   -> %d ms\n", sure);
    /* ---------------------------------------------------------------- */
  }
}
