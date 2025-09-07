package com.reserva.hotel.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    private String nomeCompleto;
    private String documento;
    private Date dataNascimento;
    private Endereco endereco;

    public Cliente(Long idReserva) {
    }

    public Cliente(String nomeCompleto, String documento, Date dataNascimento, Endereco endereco) {
        this.nomeCompleto = nomeCompleto;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
