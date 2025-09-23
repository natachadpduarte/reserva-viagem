package com.reserva.hotel.utils.mapper;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.model.request.CadastroQuartoRequest;
import com.reserva.hotel.model.response.CadastroQuartoResponse;

public class QuartoMapper {

    public static CadastroQuarto mapperQuartoRequest(CadastroQuartoRequest request){
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

    public static CadastroQuartoResponse mapperQuartoResponse(CadastroQuarto response){
        if(response == null){
            return null;
        }
        CadastroQuartoResponse resposeQuarto = new CadastroQuartoResponse();
        resposeQuarto.setNome(response.getNome());
        resposeQuarto.setCategoriaQuarto(response.getCategoriaQuarto());
        resposeQuarto.setTipoCama(response.getTipoCama());
        resposeQuarto.setFumante(response.isFumante());

        return resposeQuarto;
    }
}
