// src/main/java/com/hidro_safe/restapi/service/ControleService.java
package com.hidro_safe.restapi.service;

import com.hidro_safe.restapi.dto.ComandoControleDTO;
import com.hidro_safe.restapi.dto.ControlesSistemaDTO;

public interface ControleService {
    ControlesSistemaDTO obterEstadoAtual();
    ControlesSistemaDTO executarComando(ComandoControleDTO comando);
}