package com.hidro_safe.restapi.dto;

import java.time.Instant;
import java.util.UUID;

public class EventoDTO {
    private UUID id;
    private String tipo;
    private String descricao;
    private String valor;
    private Instant timestamp;

    // Getters e Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }

    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
}