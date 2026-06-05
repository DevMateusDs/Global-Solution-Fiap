package br.com.fiap.missaoespacial.repository;

import br.com.fiap.missaoespacial.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository
        extends JpaRepository<Alerta, Long> {
}
