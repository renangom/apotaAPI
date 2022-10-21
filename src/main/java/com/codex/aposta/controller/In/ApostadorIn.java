package com.codex.aposta.controller.In;

import com.codex.aposta.model.Apostador;

public class ApostadorIn {
    private String nome;
    private String email;

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public Apostador toConvert() {
        return new Apostador(nome, email);
    }
}
