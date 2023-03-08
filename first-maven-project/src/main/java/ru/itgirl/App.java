package ru.itgirl;

import ru.itgirl.controller.Controller;

import java.time.LocalDate;

public class App {
    public static void main(String[] args){

        Controller n = new Controller();
        n.getDayOfWeek(LocalDate.now());
    }
}
