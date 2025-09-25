package com.reserva.hotel.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String documento;
    private String passaporte;
    private Date dataNascimento;
    private EnderecoEmbbeded enderecoEmbbeded;
    @OneToMany(mappedBy = "cliente")
    private List<ReservaEntity> reservaEntities = new ArrayList<>();

    public ClienteEntity() {
    }

    public ClienteEntity(String nomeCompleto, String documento, String passaporte, Date dataNascimento, EnderecoEmbbeded enderecoEmbbeded) {
        this.nomeCompleto = nomeCompleto;
        this.documento = documento;
        this.passaporte = passaporte;
        this.dataNascimento = dataNascimento;
        this.enderecoEmbbeded = enderecoEmbbeded;
    }

    public ClienteEntity(String documento, String passaporte) {
        this.documento = documento;
        this.passaporte = passaporte;
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

    public EnderecoEmbbeded getEndereco() {
        return enderecoEmbbeded;
    }

    public void setEndereco(EnderecoEmbbeded enderecoEmbbeded) {
        this.enderecoEmbbeded = enderecoEmbbeded;
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

    public EnderecoEmbbeded getCadastroEndereco() {
        return enderecoEmbbeded;
    }

    public void setCadastroEndereco(EnderecoEmbbeded enderecoEmbbeded) {
        this.enderecoEmbbeded = enderecoEmbbeded;
    }

    public EnderecoEmbbeded getEnderecoEmbbeded() {
        return enderecoEmbbeded;
    }

    public void setEnderecoEmbbeded(EnderecoEmbbeded enderecoEmbbeded) {
        this.enderecoEmbbeded = enderecoEmbbeded;
    }

    public List<ReservaEntity> getReservas() {
        return reservaEntities;
    }

    public void setReservas(List<ReservaEntity> reservaEntities) {
        this.reservaEntities = reservaEntities;
    }
}
