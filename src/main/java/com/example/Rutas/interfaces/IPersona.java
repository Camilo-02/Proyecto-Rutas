package com.example.Rutas.interfaces;

import com.example.Rutas.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Persona, Integer> {
}
