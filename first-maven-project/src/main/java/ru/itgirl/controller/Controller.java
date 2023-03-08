package ru.itgirl.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class Controller {
    public String getDayOfWeek (LocalDate date){

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        Locale localeRu = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
        System.out.println("Сегодня " + dayOfWeek.getDisplayName(TextStyle.FULL, localeRu));
        return dayOfWeek.getDisplayName(TextStyle.FULL, localeRu);
    }
}
