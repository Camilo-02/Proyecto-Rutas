package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IClienteService;
import com.example.CrudSpringBoot.interfaces.ICliente;
import com.example.CrudSpringBoot.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteService implements IClienteService {

    @Autowired
    private ICliente data;


    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public Optional<Cliente> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Cliente c) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
