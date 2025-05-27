// src/main/java/com/hidro_safe/restapi/service/EventoService.java
package com.hidro_safe.restapi.service;

import com.hidro_safe.restapi.dto.EventoDTO;
import java.util.List;

public interface EventoService {
    List<EventoDTO> listarHistorico();
}