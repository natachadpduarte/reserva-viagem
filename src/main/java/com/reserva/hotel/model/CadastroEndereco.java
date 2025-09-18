package com.reserva.hotel.model;

import jakarta.persistence.*;

@Embeddable
public class CadastroEndereco {

    private String pais;
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String bairro;

    public CadastroEndereco(String pais, String cep, String rua, Integer numero, String complemento, String bairro, String cidade, String estado) {
        this.pais = pais;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public CadastroEndereco() {
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPais() {
        return pais;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getBairro() {
        return bairro;
    }
}
