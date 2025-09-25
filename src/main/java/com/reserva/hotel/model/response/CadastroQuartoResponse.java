package com.reserva.hotel.model.response;

import com.reserva.hotel.utils.enums.CategoriaQuarto;
import com.reserva.hotel.utils.enums.NomeQuartoEnum;
import com.reserva.hotel.utils.enums.TipoCama;

public class CadastroQuartoResponse {

        private NomeQuartoEnum nomeQuarto;
        private CategoriaQuarto categoriaQuarto;
        private TipoCama tipoCama;
        private boolean fumante;

    public CadastroQuartoResponse() {
    }

    public CadastroQuartoResponse(NomeQuartoEnum nomeQuarto, CategoriaQuarto categoriaQuarto, TipoCama tipoCama, boolean fumante) {
        this.nomeQuarto = nomeQuarto;
        this.categoriaQuarto = categoriaQuarto;
        this.tipoCama = tipoCama;
        this.fumante = fumante;
    }

    public NomeQuartoEnum getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(NomeQuartoEnum nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
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
