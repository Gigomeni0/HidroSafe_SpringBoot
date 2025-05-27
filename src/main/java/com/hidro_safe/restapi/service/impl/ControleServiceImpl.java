package com.hidro_safe.restapi.service.impl;

import com.hidro_safe.restapi.dto.ComandoControleDTO;
import com.hidro_safe.restapi.dto.ControlesSistemaDTO;
import com.hidro_safe.restapi.model.ConfiguracaoSistema;
import com.hidro_safe.restapi.repository.ConfiguracaoSistemaRepository;
import com.hidro_safe.restapi.service.ControleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControleServiceImpl implements ControleService {

    @Autowired
    private ConfiguracaoSistemaRepository repository;

    @Override
    public ControlesSistemaDTO obterEstadoAtual() {
        ConfiguracaoSistema config = repository.findTopByOrderByIdDesc();
        return converterParaDTO(config);
    }

    @Override
    public ControlesSistemaDTO executarComando(ComandoControleDTO comando) {
        ConfiguracaoSistema config = repository.findTopByOrderByIdDesc();

        // Aplicar comando com base no tipo
        switch (comando.getTipo().toUpperCase()) {
            case "BOMBAS":
                config.setBombasDrenagem(comando.isValor());
                break;
            case "COMPORTAS":
                config.setComportasAbertas(comando.isValor());
                break;
            case "ALERTAS":
                config.setAlertasAtivos(comando.isValor());
                break;
        }

        repository.save(config);
        return converterParaDTO(config);
    }

    private ControlesSistemaDTO converterParaDTO(ConfiguracaoSistema config) {
        ControlesSistemaDTO dto = new ControlesSistemaDTO();
        dto.setBombasDrenagem(config.isBombasDrenagem());
        dto.setComportasAbertas(config.isComportasAbertas());
        dto.setAlertasAtivos(config.isAlertasAtivos());
        return dto;
    }
}