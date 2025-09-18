package com.reserva.hotel.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="cliente")
public class CadastroCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String documento;
    private String passaporte;
    private Date dataNascimento;
    private CadastroEndereco cadastroEndereco;

    public CadastroCliente() {
    }

    public CadastroCliente(String nomeCompleto, String documento, String passaporte, Date dataNascimento, CadastroEndereco cadastroEndereco) {
        this.nomeCompleto = nomeCompleto;
        this.documento = documento;
        this.passaporte = passaporte;
        this.dataNascimento = dataNascimento;
        this.cadastroEndereco = cadastroEndereco;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public CadastroEndereco getEndereco() {
        return cadastroEndereco;
    }

    public void setEndereco(CadastroEndereco cadastroEndereco) {
        this.cadastroEndereco = cadastroEndereco;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CadastroEndereco getCadastroEndereco() {
        return cadastroEndereco;
    }

    public void setCadastroEndereco(CadastroEndereco cadastroEndereco) {
        this.cadastroEndereco = cadastroEndereco;
    }
}
