package com.reserva.hotel.controller;

import com.reserva.hotel.model.request.CadastraReservaRequest;
import com.reserva.hotel.model.response.ReservaResponse;
import com.reserva.hotel.service.ReservaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {


    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Void> cadastrarReserva(@RequestBody CadastraReservaRequest request,
                                                 UriComponentsBuilder uri){

        Long idReserva = service.cadastroReservaCliente(request);
        URI location = URI.create("idReserva/" + idReserva);

        return ResponseEntity.created(location).build();

    }

    @GetMapping
    public ResponseEntity<List<ReservaResponse>> consultaReserva(){
        List<ReservaResponse> reserva = service.consultaReserva();
        return ResponseEntity.ok(reserva);
    }

    @GetMapping("/buscaCliente")
    public ResponseEntity<ReservaResponse> consultaReservaCliente(
            @RequestParam(required = false) String documento,
            @RequestParam(required = false) String passaporte
    ){

        ReservaResponse response = service.consultaReservaCpfOuPassaporte(documento, passaporte);

        return ResponseEntity.ok(response);

    }
}
