package com.apps.app.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apps.app.clases.TipoPago;
import com.apps.app.repository.TipoPagoRepository;
import com.apps.app.services.TipoPagoService;

import java.util.List;

@RestController
@RequestMapping("/tipos-pago")
public class TipoPagoController {

    @Autowired
    private TipoPagoService tipoPagoService;

    @GetMapping
    public List<TipoPago> getAll() {
        return tipoPagoService.findAll();
    }

    @GetMapping("/{id}")
    public TipoPago getById(@PathVariable int id) {
        return tipoPagoService.findById(id);
    }

    @PostMapping
    public TipoPago create(@RequestBody TipoPago tipoPago) {
        return tipoPagoService.save(tipoPago);
    }

    @PutMapping("/{id}")
    public TipoPago update(@PathVariable int id, @RequestBody TipoPago tipoPago) {
        tipoPago.setIdTipoPago(id);
        return tipoPagoService.save(tipoPago);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        tipoPagoService.deleteById(id);
    }
}