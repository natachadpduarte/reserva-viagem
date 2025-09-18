package com.reserva.hotel.controller;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.model.request.CadastroQuartoRequest;
import com.reserva.hotel.model.response.CadastroQuartoResponse;
import com.reserva.hotel.repository.QuartoRepository;
import com.reserva.hotel.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quarto")
public class CadastroQuartoController {

    @Autowired
    public QuartoRepository repository;

    @Autowired
    private QuartoService service;

    @PostMapping
    public void cadastroQuarto(@RequestBody CadastroQuartoRequest cadastroQuartoRequest){
        CadastroQuarto cadastroQuarto = service.mapToEntity(cadastroQuartoRequest);
        repository.save(cadastroQuarto);
    }

    @GetMapping("/consultarQuarto")
        public ResponseEntity<List<CadastroQuartoResponse>> consultarQuartos(){
            return ResponseEntity.ok(service.consultarQuartos());

    }
}
