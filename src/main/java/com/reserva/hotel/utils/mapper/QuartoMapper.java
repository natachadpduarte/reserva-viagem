package com.reserva.hotel.utils.mapper;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.model.request.CadastroQuartoRequest;

public class QuartoMapper {

    public static CadastroQuarto toQuartoEntity(CadastroQuartoRequest request){
        if(request == null){
            return null;
        }

        CadastroQuarto quarto = new CadastroQuarto();
        quarto.setNome(request.getNome());
        quarto.setCategoriaQuarto(request.getCategoriaQuarto());
        quarto.setTipoCama(request.getTipoCama());
        quarto.setFumante(request.getFumante());

        return quarto;
    }
}
