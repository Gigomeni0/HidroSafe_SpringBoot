// src/main/java/com/hidro_safe/restapi/service/impl/AlertaServiceImpl.java
package com.hidro_safe.restapi.service.impl;

import com.hidro_safe.restapi.dto.AlertaDTO;
import com.hidro_safe.restapi.model.Alerta;
import com.hidro_safe.restapi.repository.AlertaRepository;
import com.hidro_safe.restapi.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.time.Instant;
import java.util.UUID;

@Service
public class AlertaServiceImpl implements AlertaService {

    @Autowired
    private AlertaRepository repository;

    @Override
    public List<AlertaDTO> obterAlertasAtivos() {
        List<Alerta> alertas = repository.findByResolvidoFalse();
        return alertas.stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }
    @Override
    public AlertaDTO salvarAlerta(AlertaDTO alertaDTO) {
        // Criar uma nova entidade, deixando o ID ser gerado pelo Hibernate
        Alerta alerta = new Alerta();
        alerta.setTipo(alertaDTO.getTipo());
        alerta.setTitulo(alertaDTO.getTitulo());
        alerta.setDescricao(alertaDTO.getDescricao());
        alerta.setResolvido(alertaDTO.isResolvido());

        // Usar timestamp fornecido ou gerar um novo
        alerta.setTimestamp(alertaDTO.getTimestamp() != null ?
                alertaDTO.getTimestamp() : Instant.now());

        // Salvar a nova entidade
        alerta = repository.save(alerta);
        return converterParaDTO(alerta);
    }
    private AlertaDTO converterParaDTO(Alerta alerta) {
        AlertaDTO dto = new AlertaDTO();
        dto.setId(alerta.getId());
        dto.setTipo(alerta.getTipo());
        dto.setTitulo(alerta.getTitulo());
        dto.setDescricao(alerta.getDescricao());
        dto.setTimestamp(alerta.getTimestamp());
        dto.setResolvido(alerta.isResolvido());
        return dto;
    }
}