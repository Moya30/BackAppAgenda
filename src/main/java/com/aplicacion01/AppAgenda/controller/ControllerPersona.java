package com.aplicacion01.AppAgenda.controller;

import com.aplicacion01.AppAgenda.model.Persona;
import com.aplicacion01.AppAgenda.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.sql.ResultSet;
import java.util.List;


public class ControllerPersona  {

  private AgendaRepository agendarepository;

  public List<Persona> getAllPersons(){

    return AgendaRepository.getAll();
  }



}
