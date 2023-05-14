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
    private int boleto;

    public Cliente(){

    }
    public Cliente(int id, String name, String destino, String telefono, int boleto) {
        this.id = id;
        this.name = name;
        this.destino = destino;
        this.telefono = telefono;
        this.boleto = boleto;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDestino() {return destino;}

    public void setDestino(String destino) {this.destino = destino;}

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public int getBoleto() {return boleto;}

    public void setBoleto(int boleto) {this.boleto = boleto;}

}


