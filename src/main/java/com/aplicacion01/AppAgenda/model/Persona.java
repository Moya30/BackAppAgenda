package com.aplicacion01.AppAgenda.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name="Contactos")

public class Persona {
    @Id
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="number")
    private String number;

}
