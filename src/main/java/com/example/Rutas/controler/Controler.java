package com.example.Rutas.controler;



import com.example.Rutas.interfaceService.IPersonaService;
import com.example.Rutas.modelo.Persona;
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
    private IPersonaService service;

    @GetMapping("/inicio")
    public String agregar(Model model){
        return "major";
    }

    @GetMapping("/rutaUno")
    public String agregar1(Model model){
        return "rutaUno";
    }
    @GetMapping("/rutaDos")
    public String agregar2(Model model){
        return "rutaDos";
    }
    @GetMapping("/rutaTres")
    public String agregar3(Model model){
        return "rutaTres";
    }

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas= service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
    @GetMapping("/formulario")
    public String agregar7(Model model){
        model.addAttribute("persona", new Persona());
        return "formulario";

    }@GetMapping("/modifica")
    public String agregar8(Model model){
        model.addAttribute("persona", new Persona());
        return "editador";
    }

    @PostMapping("/save")
    public String save(@Validated Persona p){
        service.save(p);
        return "redirect:/inicio";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "editador";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
    //Eliminar 

    @DeleteMapping("/eliminarTodo/")
    public String deleteAll(@PathVariable int id){
        service.deleteAll(id);
        return "redirect:/listar";
    }
}
