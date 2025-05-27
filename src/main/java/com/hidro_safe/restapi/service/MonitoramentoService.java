package com.hidro_safe.restapi.service;

import com.hidro_safe.restapi.dto.DadosMonitoramentoDTO;

public interface MonitoramentoService {
    DadosMonitoramentoDTO obterDadosAtuais();
    DadosMonitoramentoDTO salvarDadosMonitoramento(DadosMonitoramentoDTO dto);
}