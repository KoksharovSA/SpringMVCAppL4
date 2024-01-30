package ru.gb.SpringMVCAppL4.services;

import org.springframework.stereotype.Service;
import ru.gb.SpringMVCAppL4.models.Message;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private List<Message> messages = new ArrayList<>();
    public void addMessage(Message message){
        messages.add(message);
    }

    public List<Message> getAllMessages(){
        return messages;
    }
}
