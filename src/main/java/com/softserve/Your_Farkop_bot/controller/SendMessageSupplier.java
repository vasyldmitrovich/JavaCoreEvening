package com.softserve.Your_Farkop_bot.controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface SendMessageSupplier {

    SendMessage buildSendMessage(Long chatId);
}
