package com.example.CrudSpringBoot.controler;

import com.example.CrudSpringBoot.interfaceService.IClienteService;
import com.example.CrudSpringBoot.modelo.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controler {


    @Autowired
    private IClienteService service;

    @GetMapping("/inicio")
    public String agregar(Model model) {
        return "interface";
    }
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Cliente> cliente = service.listar();
        model.addAttribute("cliente", cliente);
        return "index";
    }

    @GetMapping("/rutaDos")
    public String agregar2(Model model) {
        return "rutaDos";
    }
    @GetMapping("/rutaTres")
    public String agregar3(Model model) {
        return "rutaTres";
    }

    @GetMapping("/rutaUno")
    public String ver(Model model) {
        return "rutaUno";
    }



    @GetMapping("/VentaBoleto")
    public String agregar1(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "ventaBoleto";
    }

    @PostMapping("/save")
    public String save(@Validated Cliente c) {
        service.save(c);
        return "redirect:/inicio";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Cliente> cliente = service.listarId(id);
         model.addAttribute("cliente", cliente);
        return "ventaBoleto";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "redirect:/listar";
    }


}
