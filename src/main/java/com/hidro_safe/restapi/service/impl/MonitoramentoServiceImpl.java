package com.hidro_safe.restapi.service.impl;

import com.hidro_safe.restapi.dto.DadosMonitoramentoDTO;
import com.hidro_safe.restapi.service.MonitoramentoService;
import org.springframework.stereotype.Service;
import java.time.Instant;

@Service
public class MonitoramentoServiceImpl implements MonitoramentoService {

    @Override
    public DadosMonitoramentoDTO obterDadosAtuais() {
        // Dados simulados para o protótipo
        return new DadosMonitoramentoDTO(
                3.5,        // nivelRio
                10.2,       // precipitacao
                25.7,       // temperatura
                "medio",    // risco
                Instant.now(), // ultimaAtualizacao
                "Região Central"  // localizacao
        );
    }
}