package com.hidro_safe.restapi.controller;

import com.hidro_safe.restapi.dto.EventoDTO;
import com.hidro_safe.restapi.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/historico")
public class EventoController {

    @Autowired
    private EventoService service;

    @GetMapping("/eventos")
    public ResponseEntity<List<EventoDTO>> listarEventos() {
        return ResponseEntity.ok(service.obterHistoricoEventos());
    }

    @PostMapping("/eventos")
    public ResponseEntity<EventoDTO> registrarEvento(@RequestBody EventoDTO eventoDTO) {
        EventoDTO eventoSalvo = service.registrarEvento(eventoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(eventoSalvo);
    }
}