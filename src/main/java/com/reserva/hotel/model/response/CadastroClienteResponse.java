package com.reserva.hotel.model.response;

import java.time.LocalDateTime;
import java.util.Date;

public class CadastroClienteResponse {
    private String nomeCompleto;
    private String documento;
    private String passaporte;
    private Date dataNascimento;
    private CadastroEnderecoResponse endereco;

    public CadastroClienteResponse() {
    }

    public CadastroClienteResponse(String documento, String nomeCompleto, String passaporte, Date dataNascimento, CadastroEnderecoResponse endereco) {
        this.documento = documento;
        this.nomeCompleto = nomeCompleto;
        this.passaporte = passaporte;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    public CadastroEnderecoResponse getEndereco() {
        return endereco;
    }

    public void setEndereco(CadastroEnderecoResponse endereco) {
        this.endereco = endereco;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
}
