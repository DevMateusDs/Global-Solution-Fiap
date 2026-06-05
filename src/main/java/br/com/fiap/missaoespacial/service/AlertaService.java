package br.com.fiap.missaoespacial.service;

import br.com.fiap.missaoespacial.model.Alerta;
import br.com.fiap.missaoespacial.repository.AlertaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertaService {

    private final AlertaRepository repository;

    public AlertaService(AlertaRepository repository) {
        this.repository = repository;
    }

    public Alerta salvar(Alerta alerta) {
        return repository.save(alerta);
    }

    public List<Alerta> listarTodos() {
        return repository.findAll();
    }

    public Optional<Alerta> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Alerta atualizar(Long id, Alerta alerta) {
        alerta.setId(id);
        return repository.save(alerta);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}


