package com.reserva.hotel.model;

import com.reserva.hotel.utils.enums.CategoriaQuarto;
import com.reserva.hotel.utils.enums.TipoCama;
import jakarta.persistence.*;

@Entity
@Table(name="quarto")
public class CadastroQuarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuarto;
    private String nome;
    @Enumerated(EnumType.STRING)
    private CategoriaQuarto categoriaQuarto;
    @Enumerated(EnumType.STRING)
    private TipoCama tipoCama;
    private int qtdCamas;
    private boolean fumante;


    public CadastroQuarto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public boolean isFumante() {
        return fumante;
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

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }
}