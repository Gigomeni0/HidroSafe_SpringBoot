// src/main/java/com/hidro_safe/restapi/service/impl/EventoServiceImpl.java
package com.hidro_safe.restapi.service.impl;

import com.hidro_safe.restapi.dto.EventoDTO;
import com.hidro_safe.restapi.service.EventoService;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EventoServiceImpl implements EventoService {

    @Override
    public List<EventoDTO> listarHistorico() {
        // Dados simulados para o protótipo
        List<EventoDTO> eventos = new ArrayList<>();

        EventoDTO evento1 = new EventoDTO();
        evento1.setId(UUID.randomUUID());
        evento1.setTipo("ALERTA");
        evento1.setDescricao("Nível do rio aumentou rapidamente");
        evento1.setTimestamp(Instant.now().minusSeconds(3600));
        evento1.setValor("3.2m");

        EventoDTO evento2 = new EventoDTO();
        evento2.setId(UUID.randomUUID());
        evento2.setTipo("MEDICAO");
        evento2.setDescricao("Leitura regular de precipitação");
        evento2.setTimestamp(Instant.now().minusSeconds(7200));
        evento2.setValor("8.5mm/h");

        eventos.add(evento1);
        eventos.add(evento2);

        return eventos;
    }
}