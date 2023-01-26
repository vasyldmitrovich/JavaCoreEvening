package com.softserve.Your_Farkop_bot;


import com.softserve.Your_Farkop_bot.bot.YourFarkop;
import com.softserve.Your_Farkop_bot.controller.QuestionsPointsFactory;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class App {
    public static void main(String[] args) throws TelegramApiException {

        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new YourFarkop(new QuestionsPointsFactory()));
    }
}
