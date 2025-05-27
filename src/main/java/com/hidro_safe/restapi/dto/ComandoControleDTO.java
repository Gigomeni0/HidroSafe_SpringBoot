// src/main/java/com/hidro_safe/restapi/dto/ComandoControleDTO.java
package com.hidro_safe.restapi.dto;

public class ComandoControleDTO {
    private String tipo;
    private boolean valor;

    // Getters e Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public boolean isValor() { return valor; }
    public void setValor(boolean valor) { this.valor = valor; }
}