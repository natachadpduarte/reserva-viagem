package com.reserva.hotel.service;

import com.reserva.hotel.model.request.CadastroClienteRequest;
import com.reserva.hotel.model.response.CadastroClienteResponse;

import java.util.List;

public interface ClienteService {

    public Long cadastrarCliente(CadastroClienteRequest cadastroClienteRequest);
    public List<CadastroClienteResponse> consultarTodosOsClientes();
    public CadastroClienteResponse consultarClientePorId(Long idCliente);
}
