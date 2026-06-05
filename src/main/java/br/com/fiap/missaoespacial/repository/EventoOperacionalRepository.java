package br.com.fiap.missaoespacial.repository;

import br.com.fiap.missaoespacial.model.EventoOperacional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoOperacionalRepository
        extends JpaRepository<EventoOperacional, Long> {
}