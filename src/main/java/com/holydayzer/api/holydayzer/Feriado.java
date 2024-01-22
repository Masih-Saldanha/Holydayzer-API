package com.holydayzer.api.holydayzer;

public class Feriado {
    private int day;
    private int month;
    private int year;
    private String name;

    public Feriado(int day, int month, int year, String name) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public String getFullDate() {
        String dayFormated;
        if (this.day < 10) {
            dayFormated = "0" + this.day + "/";
        } else {
            dayFormated = this.day + "/";
        }

        String monthFormated;
        if (this.month < 10) {
            monthFormated = "0" + this.month + "/";
        } else {
            monthFormated = this.month + "/";
        }

        String fullDate = dayFormated + monthFormated + this.year;
        return fullDate + " => " + this.name;
    }
}