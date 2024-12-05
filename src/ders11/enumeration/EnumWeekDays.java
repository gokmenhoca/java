package ders11.enumeration;

enum WeekDays {
  PAZARTESI("Is gunu"), 
  SALI("Is gunu"), 
  CARSAMBA("Is gunu"), 
  PERSEMBE("Is gunu"), 
  CUMA("Is gunu"),
  CUMARTESI("Hafta sonu"), 
  PAZAR("Hafta sonu");
  
  private String dayType;

  WeekDays(String dayType) {
    this.dayType = dayType;
  }

  public String getDayType() {
    return dayType;
  }
}

public class EnumWeekDays {
  public static void main(String[] args) {
    for (WeekDays day : WeekDays.values()) {
      System.out.printf("%9s : %s\n", day.name(), day.getDayType());
    }
  }
}
