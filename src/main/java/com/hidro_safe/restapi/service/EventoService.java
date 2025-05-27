package com.hidro_safe.restapi.service;

import com.hidro_safe.restapi.dto.EventoDTO;
import java.util.List;

public interface EventoService {
    List<EventoDTO> obterHistoricoEventos();
    EventoDTO registrarEvento(EventoDTO eventoDTO);
}