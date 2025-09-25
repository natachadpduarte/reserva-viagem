package com.reserva.hotel.utils.mapper;

import com.reserva.hotel.model.QuartoEntity;
import com.reserva.hotel.model.request.CadastroQuartoRequest;
import com.reserva.hotel.model.response.CadastroQuartoResponse;

public class QuartoMapper {

    public static QuartoEntity mapperQuartoRequest(CadastroQuartoRequest request){
        if(request == null){
            return null;
        }

        QuartoEntity quarto = new QuartoEntity();
        quarto.setNomeQuarto(request.getNomeQuarto());
        quarto.setCategoriaQuarto(request.getCategoriaQuarto());
        quarto.setTipoCama(request.getTipoCama());
        quarto.setFumante(request.getFumante());

        return quarto;
    }

    public static CadastroQuartoResponse mapperQuartoResponse(QuartoEntity response){
        if(response == null){
            return null;
        }
        CadastroQuartoResponse resposeQuarto = new CadastroQuartoResponse();
        resposeQuarto.setNomeQuarto(response.getNomeQuarto());
        resposeQuarto.setCategoriaQuarto(response.getCategoriaQuarto());
        resposeQuarto.setTipoCama(response.getTipoCama());
        resposeQuarto.setFumante(response.isFumante());

        return resposeQuarto;
    }
}
