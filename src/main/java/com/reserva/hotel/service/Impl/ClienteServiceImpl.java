package com.reserva.hotel.service.Impl;

import com.reserva.hotel.model.CadastroCliente;
import com.reserva.hotel.model.request.CadastroClienteRequest;
import com.reserva.hotel.model.response.CadastroClienteResponse;
import com.reserva.hotel.repository.ClienteRepository;
import com.reserva.hotel.service.ClienteService;
import com.reserva.hotel.utils.mapper.ClienteMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;

    private ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long cadastrarCliente(CadastroClienteRequest cadastroClienteRequest){

        CadastroCliente cadastroCliente = ClienteMapper.toCliente(cadastroClienteRequest);
        CadastroCliente salvo = repository.save(cadastroCliente);
        return salvo.getId();
    }

    @Override
    public List<CadastroClienteResponse> consultarTodosOsClientes(){

        List<CadastroCliente> buscarClientes = repository.findAll();
        return buscarClientes.stream()
                .map(ClienteMapper::toClienteResponse)
                .collect(Collectors.toList());
    }

    @Override
    public CadastroClienteResponse consultarClientePorId(Long idCliente){

        CadastroCliente cliente = repository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("IdCliente não encontrado"));
        CadastroClienteResponse response = ClienteMapper.toClienteResponse(cliente);

        return response;
    }
}
