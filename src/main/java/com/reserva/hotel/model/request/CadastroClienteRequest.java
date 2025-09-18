package com.reserva.hotel.model.request;

import java.util.Date;

public class CadastroClienteRequest {
    private String nomeCompleto;
    private String documento;
    private String passaporte;
    private Date dataNascimento;
    private CadastroEnderecoRequest endereco;

    public CadastroClienteRequest(String nomeCompleto, String documento, String passaporte, Date dataNascimento, CadastroEnderecoRequest endereco) {
        this.nomeCompleto = nomeCompleto;
        this.documento = documento;
        this.passaporte = passaporte;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public CadastroClienteRequest(){
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public CadastroEnderecoRequest getEndereco() {
        return endereco;
    }

    public void setEndereco(CadastroEnderecoRequest endereco) {
        this.endereco = endereco;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
}
