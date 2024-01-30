package ru.gb.SpringMVCAppL4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HWController {
    @RequestMapping(value = "/hw", method = RequestMethod.GET)
    @ResponseBody
    public String getHW(){
        return "<h1>Привет мир!</h1>";
    }
}
