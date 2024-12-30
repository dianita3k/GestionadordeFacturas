package com.apps.app.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apps.app.clases.Competencia;
import com.apps.app.repository.CompetenciaRepository;
import com.apps.app.services.CompetenciaService;

import java.util.List;



@RestController
@RequestMapping("/competencias")
public class CompetenciaController {

    @Autowired
    private CompetenciaService competenciaService;

    @GetMapping
    public List<Competencia> getAll() {
        return competenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Competencia getById(@PathVariable int id) {
        return competenciaService.findById(id);
    }

    @PostMapping
    public Competencia create(@RequestBody Competencia competencia) {
        return competenciaService.save(competencia);
    }

    @PutMapping("/{id}")
    public Competencia update(@PathVariable int id, @RequestBody Competencia competencia) {
        competencia.setIdCompetencia(id);
        return competenciaService.save(competencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        competenciaService.deleteById(id);
    }
}