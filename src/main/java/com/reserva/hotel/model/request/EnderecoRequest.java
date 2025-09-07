package com.reserva.hotel.model.request;

import com.reserva.hotel.model.Endereco;


public class EnderecoRequest {

    private String pais;
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String bairro;

    public EnderecoRequest(String pais, String cep, String rua, Integer numero, String complemento, String bairro, String estado, String cidade) {
        this.pais = pais;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
    }

    public Endereco toEndereco(){
        return new Endereco(pais,cep, rua, numero, complemento, bairro, estado, cidade );
    }
}

