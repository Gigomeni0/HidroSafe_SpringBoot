package com.hidro_safe.restapi.repository;

import com.hidro_safe.restapi.model.ConfiguracaoSistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracaoSistemaRepository extends JpaRepository<ConfiguracaoSistema, Long> {
    ConfiguracaoSistema findTopByOrderByIdDesc();
}