package com.example.Rutas.interfaceService;

import com.example.Rutas.modelo.Persona;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.Armerillo"})
public interface IPersonaService {

    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save (Persona p);
    public void delete(int id);

}
