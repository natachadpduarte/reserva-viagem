package com.reserva.hotel.controller;

import com.reserva.hotel.model.Cliente;
import com.reserva.hotel.model.request.ClienteRequest;
import com.reserva.hotel.model.response.ClienteResponse;
import com.reserva.hotel.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void cadastroCliente(@RequestBody ClienteRequest clienteRequest){
        Cliente cliente = clienteRequest.toCliente();
        repository.save(cliente);
    }

    @GetMapping("/id")
    public String retornarOla(){
        return "Olá";
    }

}
