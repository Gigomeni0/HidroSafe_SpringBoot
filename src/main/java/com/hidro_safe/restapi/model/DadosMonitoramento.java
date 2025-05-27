// src/main/java/com/hidro_safe/restapi/model/DadosMonitoramento.java
package com.hidro_safe.restapi.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "dados_monitoramento")
public class DadosMonitoramento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double nivelRio;
    private double precipitacao;
    private double temperatura;
    private String risco;
    private Instant timestamp;
    private String localizacao;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getNivelRio() { return nivelRio; }
    public void setNivelRio(double nivelRio) { this.nivelRio = nivelRio; }

    public double getPrecipitacao() { return precipitacao; }
    public void setPrecipitacao(double precipitacao) { this.precipitacao = precipitacao; }

    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    public String getRisco() { return risco; }
    public void setRisco(String risco) { this.risco = risco; }

    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}