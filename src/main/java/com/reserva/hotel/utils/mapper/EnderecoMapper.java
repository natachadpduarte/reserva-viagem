package com.reserva.hotel.utils.mapper;

import com.reserva.hotel.model.CadastroEndereco;
import com.reserva.hotel.model.request.CadastroEnderecoRequest;
import com.reserva.hotel.model.response.CadastroEnderecoResponse;

public class EnderecoMapper {

    public static CadastroEndereco toEndereco(CadastroEnderecoRequest request){
        if(request == null){
            return null;
        }

        return new CadastroEndereco(
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

    public static CadastroEnderecoResponse toEnderecoResponse(CadastroEndereco endereco){
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
