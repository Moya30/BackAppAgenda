package com.aplicacion01.AppAgenda.servicios;

import com.aplicacion01.AppAgenda.model.Persona;
import com.aplicacion01.AppAgenda.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaService implements  IPersona{

    PersonaRepository personaRepository;
    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository=personaRepository;
    }
    @Override
    public List<Persona> getAllPersona() {
        return personaRepository.findAll();
    }
}
