package com.hidro_safe.restapi.service.impl;

import com.hidro_safe.restapi.service.ControleService;
import com.hidro_safe.restapi.dto.ComandoControleDTO;
import com.hidro_safe.restapi.dto.ControlesSistemaDTO;
import org.springframework.stereotype.Service;

@Service
public class ControleServiceImpl implements ControleService {

    // Estado simulado do sistema
    private boolean bombasDrenagem = false;
    private boolean comportasAbertas = false;
    private boolean alertasAtivos = true;

    @Override
    public ControlesSistemaDTO obterEstadoAtual() {
        ControlesSistemaDTO estado = new ControlesSistemaDTO();
        estado.setBombasDrenagem(bombasDrenagem);
        estado.setComportasAbertas(comportasAbertas);
        estado.setAlertasAtivos(alertasAtivos);
        return estado;
    }

    @Override
    public ControlesSistemaDTO executarComando(ComandoControleDTO comando) {
        switch (comando.getTipo()) {
            case "bombas":
                bombasDrenagem = comando.isValor();
                break;
            case "comportas":
                comportasAbertas = comando.isValor();
                break;
            case "alertas":
                alertasAtivos = comando.isValor();
                break;
        }

        return obterEstadoAtual();
    }
}