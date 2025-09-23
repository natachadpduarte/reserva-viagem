package com.reserva.hotel.controller;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.model.request.CadastroQuartoRequest;
import com.reserva.hotel.model.response.CadastroQuartoResponse;
import com.reserva.hotel.repository.QuartoRepository;
import com.reserva.hotel.service.QuartoService;
import com.reserva.hotel.utils.mapper.QuartoMapper;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/quarto")
public class CadastroQuartoController {

    @Autowired
    public QuartoRepository repository;

    @Autowired
    private QuartoService service;

    @PostMapping
    public ResponseEntity<Void> cadastroQuarto(@RequestBody CadastroQuartoRequest cadastroQuartoRequest,
                                   UriComponentsBuilder uri){
        Long idQuarto = service.cadastrarQuarto(cadastroQuartoRequest);
        URI location = URI.create("quarto/" + idQuarto);
        return  ResponseEntity.created(location).build();
    }

    @GetMapping("/consulta-quartos")
    public ResponseEntity<List<CadastroQuartoResponse>> consultaQuartos(){
        List<CadastroQuartoResponse> consultaQuartos = service.consultarQuartos();
        return ResponseEntity.ok(consultaQuartos);
    }

    @GetMapping("/idQuarto/{idQuarto}")
    public ResponseEntity<CadastroQuartoResponse> buscaQuartoId(@PathVariable Long idQuarto){
        CadastroQuartoResponse response = service.consultarIdQuarto(idQuarto);
        return ResponseEntity.ok(response);
    }
}
