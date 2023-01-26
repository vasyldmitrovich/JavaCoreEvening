package com.softserve.Your_Farkop_bot.controller;


import com.softserve.Your_Farkop_bot.enums.ButtonResponseEnum;
import com.softserve.Your_Farkop_bot.enums.MessageResponseEnum;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QuestionsPointsFactory {

    private Map<String, QuestionsPoint> questionsPointsMap;

    public QuestionsPointsFactory() {

    questionsPointsMap = buildQuestionsPoints();
    }

    public QuestionsPoint getQuestionsPoint(String key){

        return questionsPointsMap.get(key);
    }

    private Map<String, QuestionsPoint> buildQuestionsPoints() {
        var list = new ArrayList<QuestionsPoint>();

        list.add(
                new QuestionsPoint(MessageResponseEnum.WELCOME_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.DEFAULT_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.BEGIN_MESSAGE,
                        List.of(
                                buildButton("AUDI", "A1"),
                                buildButton("BMW", "A2"),
                                buildButton("CHERY", "A3"),
                                buildButton("CHEVROLET", "A4"),
                                buildButton("FIAT", "A5"),
                                buildButton("FORD", "A6")

                        )
                )
        );

        //AUDI
        list.add(
                new QuestionsPoint(MessageResponseEnum.Q5, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.A4_B8, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.Q3, null)
        );

        //BMW
        list.add(
                new QuestionsPoint(MessageResponseEnum.X3, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.X5, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.BMW_320D, null)
        );

//CHERRY
        list.add(
                new QuestionsPoint(MessageResponseEnum.Tiggo_4, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.Tiggo_5, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.Tiggo_7, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.Tiggo_8, null)
        );

//        CHEVROLET

        list.add(
                new QuestionsPoint(MessageResponseEnum.AVEO, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.CAPTIVA, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.LACETTI, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.NUBIRA, null)
        );

//        FIAT

        list.add(
                new QuestionsPoint(MessageResponseEnum.DOBLO, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.DUCATO, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.SCUDO, null)
        );

        // FORD

        list.add(
                new QuestionsPoint(MessageResponseEnum.FIESTA, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.FOCUS, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.FUSION, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.MONDEO, null)
        );




        list.add(
                new QuestionsPoint(MessageResponseEnum.INFORMATOIN_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.MANAGER_MESSAGE, null)
        );


        Arrays.stream(ButtonResponseEnum.values())
                .map(buttonResponseEnum -> new QuestionsPoint(buttonResponseEnum))
                .forEach(questionsPoint -> list.add(questionsPoint));


        return list.stream().collect(Collectors.toMap(
                QuestionsPoint::getActivationKey, Function.identity()));
    }

    private InlineKeyboardButton buildButton(String name, String key) {
        return InlineKeyboardButton.builder()
                .text(name)
                .callbackData(key)
                .build();
    }
}
