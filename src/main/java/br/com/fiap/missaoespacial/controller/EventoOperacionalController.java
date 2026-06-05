package br.com.fiap.missaoespacial.controller;

import br.com.fiap.missaoespacial.model.EventoOperacional;
import br.com.fiap.missaoespacial.service.EventoOperacionalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eventos")
@CrossOrigin("*")
public class EventoOperacionalController {

    private final EventoOperacionalService service;

    public EventoOperacionalController(EventoOperacionalService service) {
        this.service = service;
    }

    @PostMapping
    public EventoOperacional criar(@RequestBody EventoOperacional evento) {
        return service.salvar(evento);
    }

    @GetMapping
    public List<EventoOperacional> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoOperacional> buscar(@PathVariable Long id) {

        Optional<EventoOperacional> evento =
                service.buscarPorId(id);

        if (evento.isPresent()) {
            return ResponseEntity.ok(evento.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventoOperacional> atualizar(
            @PathVariable Long id,
            @RequestBody EventoOperacional evento) {

        if (service.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(
                service.atualizar(id, evento)
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