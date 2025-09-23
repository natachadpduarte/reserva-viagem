package com.reserva.hotel.service;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.model.request.CadastroQuartoRequest;
import com.reserva.hotel.model.response.CadastroQuartoResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuartoService {

    Long cadastrarQuarto(CadastroQuartoRequest request);

    List<CadastroQuartoResponse> consultarQuartos();

    CadastroQuartoResponse consultarIdQuarto(Long idQuarto);
}
