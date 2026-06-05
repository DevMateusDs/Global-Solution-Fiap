package br.com.fiap.missaoespacial.controller;


import br.com.fiap.missaoespacial.model.SensorEspacial;
import br.com.fiap.missaoespacial.service.SensorEspacialService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sensores")
@CrossOrigin("*")
public class SensorEspacialController {
    private final SensorEspacialService service;

    public SensorEspacialController(SensorEspacialService service) {
        this.service = service;
    }

    @PostMapping
    public SensorEspacial criar(@RequestBody SensorEspacial sensor) {
        return service.salvar(sensor);
    }

    @GetMapping
    public List<SensorEspacial> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<SensorEspacial> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("{id}")
    public SensorEspacial atualizar(@PathVariable Long id,
                                    @RequestBody SensorEspacial sensor) {
        return service.atualizar(id, sensor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

}
