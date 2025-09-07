package com.reserva.hotel.model.request;

import com.reserva.hotel.model.Cliente;

import java.util.Date;

public class ClienteRequest {
    private String nomeCompleto;
    private String documento;
    private Date dataNascimento;
    private EnderecoRequest endereco;

    public ClienteRequest(String nomeCompleto, String documento, Date dataNascimento, EnderecoRequest endereco) {
        this.nomeCompleto = nomeCompleto;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Cliente toCliente(){
        Cliente cliente = new Cliente(nomeCompleto, documento, dataNascimento, endereco.toEndereco());
        return cliente;
    }
}
