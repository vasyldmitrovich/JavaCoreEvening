package com.softserve.edu04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayWeek {
   public static void main(String [] args) throws IOException{


       BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Введіть порядковий номер дня тижня: ");
       int inpDay = Integer.parseInt(inp.readLine());

    switch (inpDay){
        case 1:
            System.out.println("День тижня: " + dayOfWeek.MD.getEn() + " - " + dayOfWeek.MD.getUa());
            break;
        case 2:
            System.out.println("День тижня: " + dayOfWeek.TD.getEn() + " - " + dayOfWeek.TD.getUa());
            break;
        case 3:
            System.out.println("День тижня: " + dayOfWeek.WD.getEn() + " - " + dayOfWeek.WD.getUa());
            break;
        case 4:
            System.out.println("День тижня: " + dayOfWeek.TH.getEn() + " - " + dayOfWeek.TH.getUa());
            break;
        case 5:
            System.out.println("День тижня: " + dayOfWeek.FD.getEn() + " - " + dayOfWeek.FD.getUa());
            break;
        case 6:
            System.out.println("День тижня: " + dayOfWeek.SD.getEn() + " - " + dayOfWeek.SD.getUa());
            break;
        case 7:
            System.out.println("День тижня: " + dayOfWeek.SND.getEn() + " - " + dayOfWeek.SND.getUa());
            break;
        default:
            System.out.println("ТИЖДЕНЬ МАЄ СІМ ДНІВ");
    }

   }
}
/*Enum must be in own file like all classes in that package*/
enum dayOfWeek {
    MD("Monday", "Понеділок"),
    TD("Tuesday", "Вівторок"),
    WD("Wednesday", "Середа"),
    TH("Thursday", "Четвер"),
    FD("Friday", "П'ятниця"),
    SD("Saturday", "Субота"),
    SND("Sanday", "Неділя");
    private final String en;
    private final String ua;

    dayOfWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public String getUa() {
        return ua;
    }
}