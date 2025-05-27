package com.hidro_safe.restapi.dto;

import java.time.LocalDateTime;

public class DadosMonitoramentoDTO {
    private Long id;
    private Double nivelAgua;
    private Double vazao;
    private Double pressao;
    private LocalDateTime timestamp;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(Double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public Double getVazao() {
        return vazao;
    }

    public void setVazao(Double vazao) {
        this.vazao = vazao;
    }

    public Double getPressao() {
        return pressao;
    }

    public void setPressao(Double pressao) {
        this.pressao = pressao;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}