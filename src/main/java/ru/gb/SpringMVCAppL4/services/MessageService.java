package ru.gb.SpringMVCAppL4.services;

import org.springframework.stereotype.Service;
import ru.gb.SpringMVCAppL4.models.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис работы с сообщениями
 */
@Service
public class MessageService {
    /**
     * База сообщений
     */
    private List<Message> messages = new ArrayList<>();

    /**
     * Метод добавляющий сообщение в базу
     * @param message Сообщение
     */
    public void addMessage(Message message){
        messages.add(message);
    }

    /**
     * Метод получающий все сообщения
     * @return возвращает все сообщения базы
     */
    public List<Message> getAllMessages(){
        return messages;
    }
}
