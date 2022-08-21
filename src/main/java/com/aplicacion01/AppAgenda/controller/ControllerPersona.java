package com.aplicacion01.AppAgenda.controller;

import com.aplicacion01.AppAgenda.model.Persona;
import com.aplicacion01.AppAgenda.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/personas")
public class ControllerPersona {
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping
    public List<Persona> getAllPersona() {

        return personaRepository.findAll();
    }

    @PostMapping
    public Persona create(@RequestBody Persona person) {
        return personaRepository.save(person);
    }

}
