package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Cliente;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IClienteService {


   public List<Cliente> listar();

    public Optional<Cliente>listarId(int id);

    public int save(Cliente c);

    public void delete(int id);
}