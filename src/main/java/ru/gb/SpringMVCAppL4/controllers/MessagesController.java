package ru.gb.SpringMVCAppL4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.SpringMVCAppL4.models.Message;
import ru.gb.SpringMVCAppL4.services.MessageService;

@Controller
@AllArgsConstructor
public class MessagesController {
    private final MessageService messageService;
    @GetMapping("/mes")
    public String getAllMessages(Model model){
        model.addAttribute("messages", messageService.getAllMessages());
        return "mes";
    }

    @PostMapping("/mes")
    public String addMessage(Message message, Model model){
        messageService.addMessage(message);
        model.addAttribute("messages", messageService.getAllMessages());
        return "mes";
    }
}
