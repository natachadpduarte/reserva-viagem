package com.reserva.hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "status_quarto")
public class StatusQuarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;

    public StatusQuarto() {
    }
}
