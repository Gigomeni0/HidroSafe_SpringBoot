// src/main/java/com/hidro_safe/restapi/service/impl/MonitoramentoServiceImpl.java
package com.hidro_safe.restapi.service.impl;

import com.hidro_safe.restapi.dto.DadosMonitoramentoDTO;
import com.hidro_safe.restapi.model.DadosMonitoramento;
import com.hidro_safe.restapi.repository.MonitoramentoRepository;
import com.hidro_safe.restapi.service.MonitoramentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class MonitoramentoServiceImpl implements MonitoramentoService {

    @Autowired
    private MonitoramentoRepository repository;

    @Override
    public DadosMonitoramentoDTO obterDadosAtuais() {
        Optional<DadosMonitoramento> dadosOpt = repository.findTopByOrderByTimestampDesc();
        return dadosOpt.map(this::converterParaDTO)
                .orElse(criarDadosPadrao());
    }

    @Override
    public DadosMonitoramentoDTO salvarDadosMonitoramento(DadosMonitoramentoDTO dto) {
        DadosMonitoramento entity = new DadosMonitoramento();
        entity.setNivelAgua(dto.getNivelAgua());
        entity.setVazao(dto.getVazao());
        entity.setPressao(dto.getPressao());
        entity.setTimestamp(dto.getTimestamp() != null
                ? dto.getTimestamp()
                : LocalDateTime.now());
        DadosMonitoramento salvo = repository.save(entity);
        return converterParaDTO(salvo);
    }

    private DadosMonitoramentoDTO converterParaDTO(DadosMonitoramento dados) {
        DadosMonitoramentoDTO dto = new DadosMonitoramentoDTO();
        dto.setId(dados.getId());
        dto.setNivelAgua(dados.getNivelAgua());
        dto.setVazao(dados.getVazao());
        dto.setPressao(dados.getPressao());
        dto.setTimestamp(dados.getTimestamp());
        return dto;
    }

    private DadosMonitoramentoDTO criarDadosPadrao() {
        DadosMonitoramentoDTO dto = new DadosMonitoramentoDTO();
        dto.setId(0L);
        dto.setNivelAgua(0.0);
        dto.setVazao(0.0);
        dto.setPressao(0.0);
        dto.setTimestamp(LocalDateTime.now());
        return dto;
    }
}