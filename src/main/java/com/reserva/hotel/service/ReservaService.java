package com.reserva.hotel.service;

import com.reserva.hotel.model.request.CadastraReservaRequest;
import com.reserva.hotel.model.response.ReservaResponse;

import java.util.List;

public interface ReservaService {

    Long cadastroReservaCliente(CadastraReservaRequest request);

    List<ReservaResponse> consultaReserva();

    ReservaResponse consultaReservaCpfOuPassaporte(String documento, String passaporte);


}
