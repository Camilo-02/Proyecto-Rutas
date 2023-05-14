package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Persona, Integer> {
    Iterable<Persona> findAll();

    Persona save(Persona p);
}
