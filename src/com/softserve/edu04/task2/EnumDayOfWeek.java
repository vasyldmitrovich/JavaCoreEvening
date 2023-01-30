package softserve.edu04.task2;

public enum EnumDayOfWeek {
    MONDAY("Monday","Понеділок"),
    TUESDAY("Tuesday","Вівторок"),
    WEDNESDAY("Wednesday","Середа"),
    THURSDAY("Thurday", "Четверг"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday","Собота"),
    SUNDAY("Sunday","Неділя");

    private final String english, ukrainian;

    EnumDayOfWeek(String english, String ukrainian) {
        this.english = english;
        this.ukrainian= ukrainian;
    }

    @Override
    public String toString() {
        return " Today is " + this.english + " " + this.ukrainian;
    }
}
