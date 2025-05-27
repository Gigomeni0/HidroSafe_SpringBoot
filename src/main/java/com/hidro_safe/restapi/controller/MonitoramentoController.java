package com.hidro_safe.restapi.controller;

import com.hidro_safe.restapi.dto.DadosMonitoramentoDTO;
import com.hidro_safe.restapi.service.MonitoramentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/monitoramento")
public class MonitoramentoController {

    @Autowired
    private MonitoramentoService service;

    @GetMapping("/dados-atuais")
    public ResponseEntity<DadosMonitoramentoDTO> obterDadosAtuais() {
        return ResponseEntity.ok(service.obterDadosAtuais());
    }

    @PostMapping("/dados-atuais")
    public ResponseEntity<DadosMonitoramentoDTO> salvarDadosAtuais(
            @RequestBody DadosMonitoramentoDTO dto) {
        DadosMonitoramentoDTO salvo = service.salvarDadosMonitoramento(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }
}