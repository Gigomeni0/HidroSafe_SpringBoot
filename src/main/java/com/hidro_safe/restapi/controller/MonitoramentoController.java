package com.hidro_safe.restapi.controller;

import com.hidro_safe.restapi.dto.DadosMonitoramentoDTO;
import com.hidro_safe.restapi.service.MonitoramentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/monitoramento")
public class MonitoramentoController {

    @Autowired
    private MonitoramentoService service;

    @GetMapping("/dados-atuais")
    public ResponseEntity<DadosMonitoramentoDTO> obterDadosAtuais() {
        return ResponseEntity.ok(service.obterDadosAtuais());
    }
}