package ru.gb.SpringMVCAppL4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Контроллер страницы складывающей переданные числа в параметрах Задание 2
 */
@Controller
public class SumController {

    /**
     * @param number1 Первое слагаемое
     * @param number2 Второе слагаемое
     * @param model
     * @return Возвращает страницу sum.html с суммой чисел переданных в параметрх запроса
     */
    @GetMapping("/sum/{number1}/{number2}")
    public String getSum(@PathVariable("number1") int number1, @PathVariable("number2") int number2,Model model){
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("sum", (number1 + number2));
        return "sum";
    }


    /**
     * @param number1 Первое слагаемое
     * @param number2 Второе слагаемое
     * @param model
     * @return Возвращает страницу sum.html с суммой чисел переданных в параметрх запроса
     */
    @GetMapping("/sum")
    public String getSum(@RequestParam("n1") Integer number1, @RequestParam("n2") Integer number2, Model model){
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("sum", (number1 + number2));
        return "sum";
    }
}
