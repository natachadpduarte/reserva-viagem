package com.reserva.hotel.model;

import jakarta.persistence.*;

@Embeddable
public class Endereco {

    private String pais;
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String bairro;

    public Endereco(String pais, String cep, String rua, Integer numero, String complemento, String bairro, String cidade, String estado) {
        this.pais = pais;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {
    }
}
