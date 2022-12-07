package com.softserve.edu04.PracticalTask4;

public enum DaysWeek {
    MONDAY("Monday","Понеділок"), TUESDAY("Tuesday","Вівторок"), WEDNESDAY("Wednesday","Середа"),
    THURSDAY("Thursday","Четвер"), FRIDAY("Friday","П'ятниця"), SATURDAY("Saturday","Субота"), SUNDAY("Sunday","Неділя");

    private final String en;
    private final String ua;

   DaysWeek(String en, String ua){
       this.en = en;
       this.ua = ua;
   }

   public String getEn(){
       return en;
   }

   public String getUa(){
       return ua;
   }

}
