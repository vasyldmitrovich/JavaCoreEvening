package softserve.edu04.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class NumberOfDay {
    public static void main(String[] args) throws IOException {

        EnumDayOfWeek day;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(in));

        int number=1;

        while (number!=0){
            out.print("Please enter number of day, 0 to exit: ");
             number= Integer.parseInt(br.readLine());
            switch (number) {
                case 1 -> {
                    day = EnumDayOfWeek.MONDAY;
                    out.println(day);
                }
                case 2 -> {
                    day = EnumDayOfWeek.TUESDAY;
                    out.println(day);
                }
                case 3 -> {
                    day = EnumDayOfWeek.WEDNESDAY;
                    out.println(day);
                }
                case 4 -> {
                    day = EnumDayOfWeek.THURSDAY;
                    out.println(day);
                }
                case 5 -> {
                    day = EnumDayOfWeek.FRIDAY;
                    out.println(day);
                }
                case 6 -> {
                    day = EnumDayOfWeek.SATURDAY;
                    out.println(day);
                }
                case 7 -> {
                    day = EnumDayOfWeek.SUNDAY;
                    out.println(day);
                }
                default -> out.println("Entered number should be between 1 and 7");
            }
        }
    }

}
