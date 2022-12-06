package com.softserve.edu04.PracticalTask;

    public enum daysOfTheWeek {
        First("Monday", "Montag"),
        Second("Tuesday", "Dienstag"),
        Third("Wednesday", "Mittwoch"),
        Fourth("Thursday", "Donnerstag"),
        Fifth("Friday", "Freitag"),
        Sixth("Saturday", "Samstag"),
        Seventh("Sunday", "Sonntag");

        private final String english;
        private final String german;

        daysOfTheWeek(String english, String german) {
            this.english = english;
            this.german = german;
        }

        public String getEnglish() {
            return english;
        }

        public String getGerman() {
            return german;
        }
    }


