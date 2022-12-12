package com.softserve.edu04.PracticalTask04.Continent;

public enum Continent {
        EUROPE ("Europe"),
        ASIA("Asia"),
        AFRIKA("Africa"),
        AUSTRALIA("Australia"),
        AMERICA("America");


        private final String Continent;

        Continent (String Name){
              this.Continent = getContinent();
        }

        public String getContinent() {
                return Continent;
        }
        public void setContinent(String Continent) {Continent = Continent; }
}
