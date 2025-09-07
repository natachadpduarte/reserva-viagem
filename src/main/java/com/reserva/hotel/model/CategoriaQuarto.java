package com.reserva.hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria_quarto")
public class CategoriaQuarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    public CategoriaQuarto(Long id) {
    }
}
