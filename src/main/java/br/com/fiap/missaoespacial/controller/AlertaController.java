package br.com.fiap.missaoespacial.controller;

import br.com.fiap.missaoespacial.model.Alerta;
import br.com.fiap.missaoespacial.service.AlertaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alertas")
@CrossOrigin("*")
public class AlertaController {

    private final AlertaService service;

    public AlertaController(AlertaService service) {
        this.service = service;
    }

    @PostMapping
    public Alerta criar(@RequestBody Alerta alerta) {
        return service.salvar(alerta);
    }

    @GetMapping
    public List<Alerta> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alerta> buscar(@PathVariable Long id) {
        Optional<Alerta> alerta = service.buscarPorId(id);

        if(alerta.isPresent()) {
            return ResponseEntity.ok(alerta.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alerta> atualizar(
            @PathVariable Long id,
            @RequestBody Alerta alerta) {

        if (service.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(
                service.atualizar(id, alerta)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {

        if (service.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        service.deletar(id);

        return ResponseEntity.noContent().build();
    }
}
