package com.hidro_safe.restapi.controller;

import com.hidro_safe.restapi.dto.ComandoControleDTO;
import com.hidro_safe.restapi.dto.ControlesSistemaDTO;
import com.hidro_safe.restapi.service.ControleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/controles")
public class ControleController {

    @Autowired
    private ControleService service;

    @GetMapping("/estado")
    public ResponseEntity<ControlesSistemaDTO> obterEstadoAtual() {
        return ResponseEntity.ok(service.obterEstadoAtual());
    }

    @PostMapping("/comando")
    public ResponseEntity<ControlesSistemaDTO> executarComando(@RequestBody ComandoControleDTO comando) {
        return ResponseEntity.ok(service.executarComando(comando));
    }
}