package com.eventosapp.controllers;

import com.eventosapp.models.Evento;
import com.eventosapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @RequestMapping(value ="/cadastrarEvento", method = RequestMethod.GET)
    public String form(){
        return "evento/formEvento";
    }

    @RequestMapping(value ="/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento){

        eventoRepository.save(evento);

        return "redirect:/";
    }
}
