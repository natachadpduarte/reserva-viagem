package com.reserva.hotel.model.request;

import com.reserva.hotel.utils.enums.CategoriaQuarto;
import com.reserva.hotel.utils.enums.NomeQuartoEnum;
import com.reserva.hotel.utils.enums.TipoCama;

public class CadastroQuartoRequest {

    private NomeQuartoEnum nomeQuarto;
    private CategoriaQuarto categoriaQuarto;
    private TipoCama tipoCama;
    private boolean fumante;
    private int qtdCamas;


    public CadastroQuartoRequest() {
    }

    public CadastroQuartoRequest(NomeQuartoEnum nomeQuarto, CategoriaQuarto categoriaQuarto, TipoCama tipoCama, boolean fumante, int qtdCamas) {
        this.nomeQuarto = nomeQuarto;
        this.categoriaQuarto = categoriaQuarto;
        this.tipoCama = tipoCama;
        this.fumante = fumante;
        this.qtdCamas = qtdCamas;
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

    public boolean getFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public boolean isFumante() {
        return fumante;
    }

    public int getQtdCamas() {
        return qtdCamas;
    }

    public void setQtdCamas(int qtdCamas) {
        this.qtdCamas = qtdCamas;
    }
}
