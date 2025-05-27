// src/main/java/com/hidro_safe/restapi/dto/ControlesSistemaDTO.java
package com.hidro_safe.restapi.dto;

public class ControlesSistemaDTO {
    private boolean bombasDrenagem;
    private boolean comportasAbertas;
    private boolean alertasAtivos;

    // Getters e Setters
    public boolean isBombasDrenagem() { return bombasDrenagem; }
    public void setBombasDrenagem(boolean bombasDrenagem) { this.bombasDrenagem = bombasDrenagem; }

    public boolean isComportasAbertas() { return comportasAbertas; }
    public void setComportasAbertas(boolean comportasAbertas) { this.comportasAbertas = comportasAbertas; }

    public boolean isAlertasAtivos() { return alertasAtivos; }
    public void setAlertasAtivos(boolean alertasAtivos) { this.alertasAtivos = alertasAtivos; }
}