package com.reserva.hotel.utils.mapper;

import com.reserva.hotel.model.EnderecoEmbbeded;
import com.reserva.hotel.model.request.CadastroEnderecoRequest;
import com.reserva.hotel.model.response.CadastroEnderecoResponse;

public class EnderecoMapper {

    public static EnderecoEmbbeded toEndereco(CadastroEnderecoRequest request){
        if(request == null){
            return null;
        }

        return new EnderecoEmbbeded(
                request.getPais(),
                request.getCep(),
                request.getRua(),
                request.getNumero(),
                request.getComplemento(),
                request.getBairro(),
                request.getCidade(),
                request.getEstado()
        );
    }

    public static CadastroEnderecoResponse toEnderecoResponse(EnderecoEmbbeded endereco){
        if(endereco == null){
            return null;
        }

        CadastroEnderecoResponse enderecoResponse = new CadastroEnderecoResponse();
        enderecoResponse.setPais(endereco.getPais());
        enderecoResponse.setCep(endereco.getCep());
        enderecoResponse.setRua(endereco.getRua());
        enderecoResponse.setNumero(endereco.getNumero());
        enderecoResponse.setCidade(endereco.getCidade());
        enderecoResponse.setComplemento(endereco.getComplemento());
        enderecoResponse.setEstado(endereco.getEstado());
        enderecoResponse.setBairro(endereco.getBairro());
        return enderecoResponse;

    }
}
