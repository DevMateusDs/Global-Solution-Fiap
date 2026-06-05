package br.com.fiap.missaoespacial.service;

import br.com.fiap.missaoespacial.model.SensorEspacial;
import br.com.fiap.missaoespacial.repository.SensorEspacialRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorEspacialService {
    private final SensorEspacialRepository repository;

    public SensorEspacialService(SensorEspacialRepository repository) {
        this.repository = repository;
    }

    public SensorEspacial salvar(SensorEspacial sensor) {
        return repository.save(sensor);
    }

    public List<SensorEspacial> listarTodos() {
        return repository.findAll();
    }

    public Optional<SensorEspacial> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public SensorEspacial atualizar(Long id, SensorEspacial sensor) {
        sensor.setId(id);
        return repository.save(sensor);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
