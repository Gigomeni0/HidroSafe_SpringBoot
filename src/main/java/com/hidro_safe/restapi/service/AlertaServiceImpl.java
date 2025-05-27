// src/main/java/com/hidro_safe/restapi/service/impl/AlertaServiceImpl.java
package com.hidro_safe.restapi.service.impl;

import com.hidro_safe.restapi.dto.AlertaDTO;
import com.hidro_safe.restapi.service.AlertaService;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AlertaServiceImpl implements AlertaService {

    @Override
    public List<AlertaDTO> obterAlertasAtivos() {
        // Dados simulados para o protótipo
        List<AlertaDTO> alertas = new ArrayList<>();

        AlertaDTO alerta = new AlertaDTO();
        alerta.setId(UUID.randomUUID());
        alerta.setTipo("aviso");
        alerta.setTitulo("Chuva acima da média");
        alerta.setDescricao("Precipitação acima de 10mm/h nas últimas 2 horas");
        alerta.setTimestamp(Instant.now().minusSeconds(1800));
        alerta.setResolvido(false);

        alertas.add(alerta);

        return alertas;
    }
}