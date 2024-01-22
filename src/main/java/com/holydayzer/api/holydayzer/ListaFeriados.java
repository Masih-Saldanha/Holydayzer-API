package com.holydayzer.api.holydayzer;

import java.util.ArrayList;
import java.util.List;

public class ListaFeriados {
    public List<Feriado> feriados = new ArrayList<Feriado>();

    public void returnHolyDays() {
        for (int i = 0; i < this.feriados.size(); i++) {
            System.out.println(this.feriados.get(i).getFullDate());
        }
    }

    public String findHolyDay(String date) {
        String[] format = date.split("-");
        int dayFormat = Integer.parseInt(format[0]);
        int monthFormat = Integer.parseInt(format[1]);

        for (int i = 0; i < this.feriados.size(); i++) {
            int elementDay = this.feriados.get(i).getDay();
            int elementMonth = this.feriados.get(i).getMonth();
            if (dayFormat == elementDay && monthFormat == elementMonth) {
                return this.feriados.get(i).getFullDate();
            }
        }

        return "Não há feriado nessa data!";
    }
}