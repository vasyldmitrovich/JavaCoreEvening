package com.softserve.edu12.practicalTask.Rectangle;
import com.softserve.edu06.practicalTasks.car.UserEnter;
import java.lang.NumberFormatException;

public class Rectangle {

    public int squareRectangle () {
        try {
            UserEnter.UserEnter("Введіть довжину прямокутника: ");
            int a = Integer.parseInt(UserEnter.inform);
            UserEnter.UserEnter("Введіть ширину прямокутника: ");
            int b = Integer.parseInt(UserEnter.inform);
            if (a < 0 || b < 0) {
                throw new Exception("Невірно введено дані. Значення не може бути <0");
            }
            System.out.println("Площа прямокутника: " + a * b);
            return a * b;
        }
        catch (NumberFormatException e){
            System.out.println("Невірний формат даних. Введіть число\n" + e);
            return 0;
        }

        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return 0;
        }
    }
}
