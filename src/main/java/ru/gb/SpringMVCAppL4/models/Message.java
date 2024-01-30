package ru.gb.SpringMVCAppL4.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Класс сообщения
 */
@Data
public class Message {
    /**
     * Имя
     */
    private String name;
    /**
     * Текст сообщения
     */
    private String text;
}
