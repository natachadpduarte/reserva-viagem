package com.reserva.hotel.model;

import com.reserva.hotel.utils.enums.TipoPagamento;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="reserva")
public class ReservaEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = true)
    private ClienteEntity cliente;
    @OneToOne
    @JoinColumn(name = "idQuarto")
    private QuartoEntity quartos;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private BigDecimal valor;
    private TipoPagamento tipoPagamento;

    public ReservaEntity() {
    }

    public ReservaEntity(LocalDateTime checkin, LocalDateTime checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public QuartoEntity getQuartos() {
        return quartos;
    }

    public void setQuartos(QuartoEntity quartos) {
        this.quartos = quartos;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }


}
