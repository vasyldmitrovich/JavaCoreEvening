package com.softserve.Your_Farkop_bot.controller;


import com.softserve.Your_Farkop_bot.enums.ButtonResponseEnum;
import com.softserve.Your_Farkop_bot.enums.MessageResponseEnum;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class QuestionsPoint implements SendMessageSupplier {
    private final String message;
    private final String activationKey;
    private List<InlineKeyboardButton> buttons;

    public QuestionsPoint(String message, String activationKey, List<InlineKeyboardButton> buttons) {
        this.message = message;
        this.activationKey = activationKey;
        this.buttons = buttons;
    }

    public QuestionsPoint(MessageResponseEnum messageResponseEnum, List<InlineKeyboardButton> buttons) {
        this(messageResponseEnum.getMessage(), messageResponseEnum.getKey(), buttons);
    }

    public QuestionsPoint(ButtonResponseEnum buttonResponseEnum) {
        this(buttonResponseEnum.getMessage(), buttonResponseEnum.getKey(), null);
    }

    public String getActivationKey() {
        return activationKey;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public SendMessage buildSendMessage(Long chatId) {
        return SendMessage.builder()
                .text(message)
                .chatId(chatId)
                .replyMarkup(buildReplyKeyboard())
                .build();
    }

    private ReplyKeyboard buildReplyKeyboard() {
        if (buttons == null) {
            return null;
        }
        List<List<InlineKeyboardButton>> buttonsToShow = new ArrayList<>();
        buttons.forEach(button -> buttonsToShow.add(List.of(button)));

        return InlineKeyboardMarkup.builder()
                .keyboard(buttonsToShow)
                .build();
    }
}
