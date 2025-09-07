package com.reserva.hotel.model;

import com.reserva.hotel.utils.enums.TipoPagamento;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="reserva")
public class Reserva {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    private Long idCliente;
    private Long idQuarto;
    private Long codigoReserva;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private BigDecimal valor;
    private TipoPagamento tipoPagamento;
}
