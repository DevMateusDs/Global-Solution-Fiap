package br.com.fiap.missaoespacial.service;

import br.com.fiap.missaoespacial.model.EventoOperacional;
import br.com.fiap.missaoespacial.repository.EventoOperacionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoOperacionalService {

    private final EventoOperacionalRepository repository;

    public EventoOperacionalService(EventoOperacionalRepository repository) {
        this.repository = repository;
    }

    public EventoOperacional salvar(EventoOperacional evento) {
        return repository.save(evento);
    }

    public List<EventoOperacional> listarTodos() {
        return repository.findAll();
    }

    public Optional<EventoOperacional> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public EventoOperacional atualizar(Long id, EventoOperacional evento) {
        evento.setId(id);
        return repository.save(evento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}