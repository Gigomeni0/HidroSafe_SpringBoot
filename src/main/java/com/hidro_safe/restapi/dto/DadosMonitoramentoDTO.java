// src/main/java/com/hidro_safe/restapi/dto/DadosMonitoramentoDTO.java
package com.hidro_safe.restapi.dto;

import java.time.Instant;

public class DadosMonitoramentoDTO {
    private double nivelRio;
    private double precipitacao;
    private double temperatura;
    private String risco;
    private Instant ultimaAtualizacao;
    private String localizacao;

    // Construtores
    public DadosMonitoramentoDTO() {}

    public DadosMonitoramentoDTO(double nivelRio, double precipitacao, double temperatura,
                                 String risco, Instant ultimaAtualizacao, String localizacao) {
        this.nivelRio = nivelRio;
        this.precipitacao = precipitacao;
        this.temperatura = temperatura;
        this.risco = risco;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.localizacao = localizacao;
    }

    // Getters e Setters
    public double getNivelRio() { return nivelRio; }
    public void setNivelRio(double nivelRio) { this.nivelRio = nivelRio; }

    public double getPrecipitacao() { return precipitacao; }
    public void setPrecipitacao(double precipitacao) { this.precipitacao = precipitacao; }

    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    public String getRisco() { return risco; }
    public void setRisco(String risco) { this.risco = risco; }

    public Instant getUltimaAtualizacao() { return ultimaAtualizacao; }
    public void setUltimaAtualizacao(Instant ultimaAtualizacao) { this.ultimaAtualizacao = ultimaAtualizacao; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}