package com.example.CrudSpringBoot.modelo;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String destino;
    private String telefono;
    private String boleto;
    private String metodo;

    public Cliente(){

    }
}


