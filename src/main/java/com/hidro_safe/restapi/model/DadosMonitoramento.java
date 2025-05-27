package com.hidro_safe.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class DadosMonitoramento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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