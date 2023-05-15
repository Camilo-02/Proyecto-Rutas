package com.example.CrudSpringBoot.interfaces;
import com.example.CrudSpringBoot.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ICliente extends CrudRepository<Cliente, Integer> {

    Iterable<Cliente> findAll();

    Cliente save(Cliente c);
}
