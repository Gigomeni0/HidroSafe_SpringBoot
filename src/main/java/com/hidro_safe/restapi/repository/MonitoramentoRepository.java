package com.hidro_safe.restapi.repository;

import com.hidro_safe.restapi.model.DadosMonitoramento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MonitoramentoRepository extends JpaRepository<DadosMonitoramento, Long> {
    Optional<DadosMonitoramento> findTopByOrderByTimestampDesc();
}