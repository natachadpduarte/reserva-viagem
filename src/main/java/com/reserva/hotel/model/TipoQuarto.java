package com.reserva.hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_quarto")
public class TipoQuarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    public TipoQuarto() {
    }
}
