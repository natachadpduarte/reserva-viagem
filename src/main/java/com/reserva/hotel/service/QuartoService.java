package com.reserva.hotel.service;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.model.request.CadastroQuartoRequest;

public interface QuartoService {

    Long cadastrarQuarto(CadastroQuartoRequest request);
}
