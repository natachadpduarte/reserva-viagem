package com.reserva.hotel.utils.mapper;

import com.reserva.hotel.model.ClienteEntity;
import com.reserva.hotel.model.request.CadastroClienteRequest;
import com.reserva.hotel.model.response.CadastroClienteResponse;

public class ClienteMapper {

    public static ClienteEntity toCliente(CadastroClienteRequest request){
        if(request == null){
            return null;
        }

        return new ClienteEntity(
                request.getNomeCompleto(),
                request.getDocumento(),
                request.getPassaporte(),
                request.getDataNascimento(),
                EnderecoMapper.toEndereco(request.getEndereco())

        );
    }

    public static CadastroClienteResponse toClienteResponse(ClienteEntity cliente){
         if(cliente == null){
             return null;
         }
         CadastroClienteResponse response = new CadastroClienteResponse();
         response.setNomeCompleto(cliente.getNomeCompleto());
         response.setDocumento(cliente.getDocumento());
         response.setPassaporte(cliente.getPassaporte());
         response.setDataNascimento(cliente.getDataNascimento());
         response.setEndereco(EnderecoMapper.toEnderecoResponse(cliente.getEndereco()));

         return response;
        }
}
