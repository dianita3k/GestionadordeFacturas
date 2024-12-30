package com.apps.app.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apps.app.clases.Factura;
import com.apps.app.repository.FacturaRepository;
import com.apps.app.services.FacturaService;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<Factura> getAll() {
        return facturaService.findAll();
    }

    @GetMapping("/{id}")
    public Factura getById(@PathVariable int id) {
        return facturaService.findById(id);
    }

    @PostMapping
    public Factura create(@RequestBody Factura factura) {
        return facturaService.save(factura);
    }

    @PutMapping("/{id}")
    public Factura update(@PathVariable int id, @RequestBody Factura factura) {
        factura.setIdFactura(id);
        return facturaService.save(factura);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        facturaService.deleteById(id);
    }
}