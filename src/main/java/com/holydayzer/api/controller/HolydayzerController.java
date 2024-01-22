package com.holydayzer.api.controller;

import com.holydayzer.api.holydayzer.Feriado;
import com.holydayzer.api.holydayzer.ListaFeriados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HolydayzerController {
    private final ListaFeriados listaFeriados;

    public HolydayzerController() {
        listaFeriados = new ListaFeriados();
        initializeFeriados();
    }

    @GetMapping("/holidays")
    public List<Feriado> getAllHolidays() {
        return listaFeriados.feriados;
    }

    @GetMapping("/holidays/{date}")
    public String isHoliday(@PathVariable String date) {
        return listaFeriados.findHolyDay(date);
    }

    private void initializeFeriados() {
        listaFeriados.feriados.add(new Feriado(1, 1, 2024, "Confraternização Mundial"));
        listaFeriados.feriados.add(new Feriado(12, 2, 2024, "Carnaval"));
        listaFeriados.feriados.add(new Feriado(17, 4, 2024, "Páscoa"));
        listaFeriados.feriados.add(new Feriado(21, 4, 2024, "Tiradentes"));
        listaFeriados.feriados.add(new Feriado(1, 5, 2024, "Dia do trabalho"));
        listaFeriados.feriados.add(new Feriado(8, 6, 2024, "Corpus Christi"));
        listaFeriados.feriados.add(new Feriado(7, 9, 2024, "Independência do Brasil"));
        listaFeriados.feriados.add(new Feriado(21, 2, 2024, "Nossa Senhora Aparecida"));
        listaFeriados.feriados.add(new Feriado(2, 11, 2024, "Finados"));
        listaFeriados.feriados.add(new Feriado(15, 11, 2024, "Proclamação da República"));
        listaFeriados.feriados.add(new Feriado(25, 12, 2024, "Natal"));
    }
}
