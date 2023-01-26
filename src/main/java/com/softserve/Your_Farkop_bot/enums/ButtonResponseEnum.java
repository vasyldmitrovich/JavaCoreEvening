package com.softserve.Your_Farkop_bot.enums;

public enum ButtonResponseEnum {

    BUTTON_A1_MESSAGE("A1", """
            
            Чудово, марка Вашого автомобіля AUDI. Оберіть модель
            /Q5
            /A4_B8
            /Q3

            Для зв"язку з менеджером  натисніть /MANAGER
            Щоб повернутися до menu натисніть, будь ласка, /begin
                                                                                                          
            """),

    BUTTON_A2_MESSAGE("A2", """ 
            
            Чудово, марка Вашого автомобіля BMW. Оберіть модель
            /X3
            /X5
            /Q3
            /BMW_320D

            Для зв"язку з менеджером  натисніть /MANAGER
            Щоб повернутися до menu натисніть, будь ласка, /begin
                 
            """
            ),
    BUTTON_A3_MESSAGE("A3", """
               
            Чудово, марка Вашого автомобіля CHERY. Оберіть модель
            /Tiggo_4
            /Tiggo_5
            /Tiggo_7
            /Tiggo_8

            Для зв"язку з менеджером  натисніть /MANAGER
            Щоб повернутися до menu натисніть, будь ласка, /begin
                                         
            """),

    BUTTON_A4_MESSAGE("A4", """
               
            Чудово, марка Вашого автомобіля CHEVROLET. Оберіть модель
            /AVEO
            /CAPTIVA
            /LACETTI
            /NUBIRA
      

            Для зв"язку з менеджером  натисніть /MANAGER
            Щоб повернутися до menu натисніть, будь ласка, /begin 
           """),
    BUTTON_A5_MESSAGE("A5", """
               
            Чудово, марка Вашого автомобіля FIAT. Оберіть модель
            /DOBLO
            /DUCATO
            /SCUDO
      
            Для зв"язку з менеджером  натисніть /MANAGER
            Щоб повернутися до menu натисніть, будь ласка, /begin 
           """),

    BUTTON_A6_MESSAGE("A6", """
               
            Чудово, марка Вашого автомобіля FORD. Оберіть модель
            /FIESTA
            /FOCUS
            /FUSION
            /MONDEO
      

            Для зв"язку з менеджером  натисніть /MANAGER
            Щоб повернутися до menu натисніть, будь ласка, /begin 
           """);

    private final String key;
    private final String message;

    ButtonResponseEnum(String key, String message) {
        this.key = key;
        this.message = message;
    }

    public String getKey() {
        return key;
    }

    public String getMessage() {
        return message;
    }

}
