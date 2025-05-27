// src/main/java/com/hidro_safe/restapi/repository/AlertaRepository.java
package com.hidro_safe.restapi.repository;

import com.hidro_safe.restapi.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.List;

@Repository
public interface AlertaRepository extends JpaRepository<Alerta, UUID> {
    List<Alerta> findByResolvidoFalse();
}