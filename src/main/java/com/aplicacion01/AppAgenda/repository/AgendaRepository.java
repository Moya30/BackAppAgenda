package com.aplicacion01.AppAgenda.repository;

import com.aplicacion01.AppAgenda.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AgendaRepository extends JpaRepository<Persona,Integer> {

     


}
