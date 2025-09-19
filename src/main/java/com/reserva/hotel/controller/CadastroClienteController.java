package com.reserva.hotel.controller;

import com.reserva.hotel.model.request.CadastroClienteRequest;
import com.reserva.hotel.model.response.CadastroClienteResponse;
import com.reserva.hotel.repository.ClienteRepository;
import com.reserva.hotel.service.Impl.ClienteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class CadastroClienteController {

    private final ClienteServiceImpl clienteServiceImpl;

    public CadastroClienteController(ClienteRepository repository, ClienteServiceImpl clienteServiceImpl) {
        this.clienteServiceImpl = clienteServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Void> cadastroCliente(@RequestBody CadastroClienteRequest cadastroClienteRequest,
                                                UriComponentsBuilder uriBuilder){

        Long idCliente = clienteServiceImpl.cadastrarCliente(cadastroClienteRequest);
        URI locaton = URI.create("/idCliente/" + idCliente);
        return ResponseEntity.created(locaton).build();
    }

    @GetMapping
    public ResponseEntity<List<CadastroClienteResponse>> listaTodosOsCliente(){
        List<CadastroClienteResponse> response = clienteServiceImpl.consultarTodosOsClientes();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/idCliente/{idCliente}")
    public ResponseEntity<CadastroClienteResponse> buscaClietePorId(@PathVariable Long idCliente){
        CadastroClienteResponse response = clienteServiceImpl.consultarClientePorId(idCliente);
        return ResponseEntity.ok(response);

    }

    @DeleteMapping("idCliente/{idCliente}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long idCliente){
        clienteServiceImpl.deletarCliente(idCliente);
        return ResponseEntity.noContent().build();
    }
}
