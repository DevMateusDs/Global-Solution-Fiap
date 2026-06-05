package br.com.fiap.missaoespacial.repository;

import br.com.fiap.missaoespacial.model.SensorEspacial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorEspacialRepository
    extends JpaRepository<SensorEspacial, Long> {
}
