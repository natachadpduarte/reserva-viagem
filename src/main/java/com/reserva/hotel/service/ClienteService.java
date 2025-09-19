package com.reserva.hotel.service;

import com.reserva.hotel.model.request.CadastroClienteRequest;
import com.reserva.hotel.model.response.CadastroClienteResponse;

import java.util.List;

public interface ClienteService {

    Long cadastrarCliente(CadastroClienteRequest cadastroClienteRequest);
    List<CadastroClienteResponse> consultarTodosOsClientes();
    CadastroClienteResponse consultarClientePorId(Long idCliente);
    void deletarCliente(Long idCliente);
}
