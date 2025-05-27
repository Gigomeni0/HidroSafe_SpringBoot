package com.hidro_safe.restapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "configuracao_sistema")
public class ConfiguracaoSistema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean bombasDrenagem;
    private boolean comportasAbertas;
    private boolean alertasAtivos;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public boolean isBombasDrenagem() { return bombasDrenagem; }
    public void setBombasDrenagem(boolean bombasDrenagem) { this.bombasDrenagem = bombasDrenagem; }

    public boolean isComportasAbertas() { return comportasAbertas; }
    public void setComportasAbertas(boolean comportasAbertas) { this.comportasAbertas = comportasAbertas; }

    public boolean isAlertasAtivos() { return alertasAtivos; }
    public void setAlertasAtivos(boolean alertasAtivos) { this.alertasAtivos = alertasAtivos; }
}