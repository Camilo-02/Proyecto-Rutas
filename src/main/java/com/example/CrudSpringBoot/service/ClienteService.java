package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IClienteService;
import com.example.CrudSpringBoot.interfaces.ICliente;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService implements IClienteService {

    @Autowired
    private ICliente data;

   
}
