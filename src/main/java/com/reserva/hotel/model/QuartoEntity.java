package com.reserva.hotel.model;

import com.reserva.hotel.utils.enums.CategoriaQuarto;
import com.reserva.hotel.utils.enums.NomeQuartoEnum;
import com.reserva.hotel.utils.enums.TipoCama;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="quarto")
public class QuartoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuarto;
    @Enumerated(EnumType.STRING)
    private NomeQuartoEnum nomeQuarto;
    @Enumerated(EnumType.STRING)
    private CategoriaQuarto categoriaQuarto;
    @Enumerated(EnumType.STRING)
    private TipoCama tipoCama;
    private int qtdCamas;
    private boolean fumante;
    @OneToOne(mappedBy = "quartos")
    private ReservaEntity reserva;


    public QuartoEntity() {
    }

    public QuartoEntity(NomeQuartoEnum nomeQuarto, CategoriaQuarto categoriaQuarto, int qtdCamas, TipoCama tipoCama, boolean fumante, ReservaEntity reserva) {
        this.nomeQuarto = nomeQuarto;
        this.categoriaQuarto = categoriaQuarto;
        this.qtdCamas = qtdCamas;
        this.tipoCama = tipoCama;
        this.fumante = fumante;
        this.reserva = reserva;
    }

    public NomeQuartoEnum getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(NomeQuartoEnum nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public ReservaEntity getReserva() {
        return reserva;
    }

    public void setReserva(ReservaEntity reserva) {
        this.reserva = reserva;
    }

    public CategoriaQuarto getCategoriaQuarto() {
        return categoriaQuarto;
    }

    public void setCategoriaQuarto(CategoriaQuarto categoriaQuarto) {
        this.categoriaQuarto = categoriaQuarto;
    }

    public TipoCama getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(TipoCama tipoCama) {
        this.tipoCama = tipoCama;
    }

    public Long getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Long idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getQtdCamas() {
        return qtdCamas;
    }

    public void setQtdCamas(int qtdCamas) {
        this.qtdCamas = qtdCamas;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }


}