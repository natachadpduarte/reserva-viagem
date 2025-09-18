package com.reserva.hotel.model.response;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.utils.enums.CategoriaQuarto;
import com.reserva.hotel.utils.enums.TipoCama;

public class CadastroQuartoResponse {

        private String nome;
        private CategoriaQuarto categoriaQuarto;
        private TipoCama tipoCama;
        private boolean fumante;

    public CadastroQuartoResponse(CadastroQuarto cadastroQuarto) {
        this.nome = cadastroQuarto.getNome();
        this.categoriaQuarto = cadastroQuarto.getCategoriaQuarto();
        this.tipoCama = cadastroQuarto.getTipoCama();
        this.fumante = cadastroQuarto.isFumante();
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

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }
}
