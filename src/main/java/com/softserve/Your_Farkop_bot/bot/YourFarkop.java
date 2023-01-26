package com.softserve.Your_Farkop_bot.bot;


import com.softserve.Your_Farkop_bot.controller.QuestionsPointsFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Optional;

public class YourFarkop extends TelegramLongPollingBot {
    private final QuestionsPointsFactory questions;

    public YourFarkop(QuestionsPointsFactory questions) {
        this.questions = questions;
    }

    @Override
    public String getBotUsername() {
        return "t.me/Tulchin_Farkop_bot";
    }

    @Override
    public String getBotToken() {
        return System.getenv("TG_KEY");
    }


    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasCallbackQuery()) {
            System.out.println("Get some callback!");
            try {
                reactToButton(update);
            } catch (TelegramApiException e) {
                System.out.println(e);
            }
            return;
        }

        if (update.hasMessage()) {

            try {

                System.out.println("Get some update!");

                reactToMessage(update);


            } catch (TelegramApiException e) {
                System.out.println(e);
            }
        }

    }

    private void reactToMessage(Update update) throws TelegramApiException {
        String text = update.getMessage().getText();

        var questionPointMessage = Optional.ofNullable(text)
                .map(questions::getQuestionsPoint)
                .orElse(questions.getQuestionsPoint(null))
                .buildSendMessage(update.getMessage().getChatId());


        super.execute(questionPointMessage);
    }


    private void reactToButton(Update update) throws TelegramApiException {
        String text = update.getCallbackQuery().getData();

        System.out.println(text);
        var replyMessage = Optional.ofNullable(text)
                .map(questions::getQuestionsPoint)
                .orElseThrow();

        try {
            var message = replyMessage.buildSendMessage(update.getCallbackQuery().getMessage().getChatId());
            message.setReplyToMessageId(update.getCallbackQuery().getMessage().getMessageId());
            super.execute(message);
        } catch (TelegramApiException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }
}
