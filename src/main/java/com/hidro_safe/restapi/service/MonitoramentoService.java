// src/main/java/com/hidro_safe/restapi/service/MonitoramentoService.java
package com.hidro_safe.restapi.service;

import com.hidro_safe.restapi.dto.DadosMonitoramentoDTO;

public interface MonitoramentoService {
    DadosMonitoramentoDTO obterDadosAtuais();
}