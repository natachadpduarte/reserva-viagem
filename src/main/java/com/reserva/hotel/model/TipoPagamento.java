package com.reserva.hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_pagamento")
public class TipoPagamento {

    @Id
    private Long id;
    private String tipo;

    public TipoPagamento() {
    }
}
