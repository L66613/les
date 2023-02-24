package ru.itgirls.myspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping ("/dayOfWeek")
    public String dayOfWeek(){
        String weekDay = String.valueOf(Week.FRIDAY);
        return String.format("Сегодня %s", weekDay);
    }
}
