package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IClienteService;
import com.example.CrudSpringBoot.interfaces.ICliente;
import com.example.CrudSpringBoot.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ICliente data;


    @Override
    public List<Cliente> listar() {

        return (List<Cliente>) data.findAll();
    }

    @Override
    public Optional<Cliente> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Cliente c) {
        int res = 0;
        Cliente cliente =data.save(c);
        if(!cliente.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
