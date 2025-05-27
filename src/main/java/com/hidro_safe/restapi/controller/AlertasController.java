// src/main/java/com/hidro_safe/restapi/controller/AlertasController.java
package com.hidro_safe.restapi.controller;

import com.hidro_safe.restapi.dto.AlertaDTO;
import com.hidro_safe.restapi.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/alertas")
public class AlertasController {

    @Autowired
    private AlertaService service;

    @GetMapping
    public ResponseEntity<List<AlertaDTO>> listarAlertas() {
        return ResponseEntity.ok(service.obterAlertasAtivos());
    }
}