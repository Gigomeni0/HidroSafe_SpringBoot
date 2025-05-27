// src/main/java/com/hidro_safe/restapi/repository/DadosMonitoramentoRepository.java
package com.hidro_safe.restapi.repository;

import com.hidro_safe.restapi.model.DadosMonitoramento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosMonitoramentoRepository extends JpaRepository<DadosMonitoramento, Long> {
    DadosMonitoramento findTopByOrderByTimestampDesc();
}