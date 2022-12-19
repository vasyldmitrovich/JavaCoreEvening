package com.softserve.edu04.PracticalTask.Two;

public enum DayOfTheWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public DayOfTheWeek dayInTwoLanguage(int a) {
        if (a >= 1 && a <= 7) {
            return switch (a) {
                case 1 -> MONDAY;
                case 2 -> TUESDAY;
                case 3 -> WEDNESDAY;
                case 4 -> THURSDAY;
                case 5 -> FRIDAY;
                case 6 -> SATURDAY;
                case 7 -> SUNDAY;
                default -> null;
            };
        } else {
            return null;
        }
    }
}

