package com.aplicacion01.AppAgenda.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Getter
@Setter
@Entity
@Table(name="contactos")

public class Persona implements Serializable {
    private  static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="number")
    private String number;

}
