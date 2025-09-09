package com.reserva.hotel.controller;

import com.reserva.hotel.model.Quarto;
import com.reserva.hotel.model.request.QuartoRequest;
import com.reserva.hotel.model.response.QuartoResponse;
import com.reserva.hotel.repository.QuartoRepository;
import com.reserva.hotel.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quarto")
public class QuartoController {

    @Autowired
    public QuartoRepository repository;

    @Autowired
    private QuartoService service;

    @PostMapping
    public void cadastroQuarto(@RequestBody QuartoRequest quartoRequest){
        Quarto quarto = service.mapToEntity(quartoRequest);
        repository.save(quarto);
    }

    @GetMapping("/consultarQuarto")
        public ResponseEntity<List<QuartoResponse>> consultarQuartos(){
            return ResponseEntity.ok(service.consultarQuartos());

    }
}
