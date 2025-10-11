package ders01;

import java.time.LocalDate;

public class LessonInfo {
    public String get() {
        StringBuilder msg  = new StringBuilder();
        String        ders = "Nesneye Yönelik Programlama";
        String        donem;  // = null
        LocalDate     date = LocalDate.now();
        Integer       mnth = date.getMonth().getValue();
        Integer       year = date.getYear();
        Integer       year2;
        if ((mnth <= 2) || (mnth >= 8)) {
            donem = "Güz";
            year2 = year + 1;
        } else {
            donem = "Bahar";
            year2 = year;
            year  = year - 1;
        }
        msg.append("Yıl\t: " + year + "-" + year2 + "\n");
        msg.append("Dönem\t: " + donem + "\n");
        msg.append("Ders\t: " + ders + "\n");
        return msg.toString();
    }
}
