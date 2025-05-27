package com.hidro_safe.restapi.repository;

import com.hidro_safe.restapi.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, UUID> {
    List<Evento> findAllByOrderByTimestampDesc();
}