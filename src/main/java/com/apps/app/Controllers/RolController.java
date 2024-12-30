package com.apps.app.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apps.app.clases.Rol;
import com.apps.app.repository.RolRepository;
import com.apps.app.services.RolService;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> getAll() {
        return rolService.findAll();
    }

    @GetMapping("/{id}")
    public Rol getById(@PathVariable int id) {
        return rolService.findById(id);
    }

    @PostMapping
    public Rol create(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    @PutMapping("/{id}")
    public Rol update(@PathVariable int id, @RequestBody Rol rol) {
        rol.setIdRol(id);
        return rolService.save(rol);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        rolService.deleteById(id);
    }
}