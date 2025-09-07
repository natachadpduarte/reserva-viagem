package com.reserva.hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_cama")
public class TipoCama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    public TipoCama() {
    }
}
