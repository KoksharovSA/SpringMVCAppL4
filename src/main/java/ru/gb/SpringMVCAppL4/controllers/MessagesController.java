package ru.gb.SpringMVCAppL4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.SpringMVCAppL4.models.Message;
import ru.gb.SpringMVCAppL4.services.MessageService;

/**
 * Контроллер страницы сообщений Задание 3
 */
@Controller
@AllArgsConstructor
public class MessagesController {

    private final MessageService messageService;

    /**
     * @param model
     * @return Возвращает страницу со всеми сообщениями
     */
    @GetMapping("/mes")
    public String getAllMessages(Model model){
        model.addAttribute("messages", messageService.getAllMessages());
        return "mes";
    }

    /**
     * @param message Сообщение из формы
     * @param model
     * @return Добавляет сообщение в базу и перезагружает страницу
     */
    @PostMapping("/mes")
    public String addMessage(Message message, Model model){
        messageService.addMessage(message);
        model.addAttribute("messages", messageService.getAllMessages());
        return "mes";
    }
}
