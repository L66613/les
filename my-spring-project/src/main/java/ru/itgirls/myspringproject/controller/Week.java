package ru.itgirls.myspringproject.controller;

public enum Week {

    MONDAY ("понедельник"),
    TUESDAY ("вторник"),
    WEDNESDAY ("среда"),
    THURSDAY ("четверг"),
    FRIDAY ("пятница"),
    SATURDAY ("суббота"),
    SUNDAY ("воскресенье");

    private String russianTitle;

    Week(String russianTitle) {
        this.russianTitle = russianTitle;
    }

    @Override
    public String toString() {
        return  russianTitle;
    }
}

