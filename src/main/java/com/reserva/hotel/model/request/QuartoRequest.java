package com.reserva.hotel.model.request;

import com.reserva.hotel.utils.enums.CategoriaQuarto;
import com.reserva.hotel.utils.enums.StatusQuarto;
import com.reserva.hotel.utils.enums.TipoCama;
import com.reserva.hotel.utils.enums.TipoQuarto;

public class QuartoRequest {

    private String nome;
    private CategoriaQuarto categoriaQuarto;
    private TipoCama tipoCama;
    private boolean fumante;


    public QuartoRequest() {
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

    public boolean getFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

}
