package com.apps.app.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apps.app.clases.Persona;
import com.apps.app.repository.PersonaRepository;
import com.apps.app.services.PersonaService;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getAll() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public Persona getById(@PathVariable int id) {
        return personaService.findById(id);
    }

    @PostMapping
    public Persona create(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @PutMapping("/{id}")
    public Persona update(@PathVariable int id, @RequestBody Persona persona) {
        persona.setIdPersona(id);
        return personaService.save(persona);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        personaService.deleteById(id);
    }
}