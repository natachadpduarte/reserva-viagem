package com.reserva.hotel.service;

import com.reserva.hotel.model.Quarto;
import com.reserva.hotel.model.request.QuartoRequest;
import com.reserva.hotel.model.response.QuartoResponse;
import com.reserva.hotel.repository.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuartoService {

    @Autowired
    private QuartoRepository repository;

    public Quarto salvar(QuartoRequest request){
        Quarto quarto = mapToEntity(request);
        return quarto;
    }

    public Quarto mapToEntity(QuartoRequest request){
        Quarto quarto = new Quarto();
        quarto.setNome(request.getNome());
        quarto.setCategoriaQuarto(request.getCategoriaQuarto());
        quarto.setTipoCama(request.getTipoCama());
        quarto.setFumante(request.getFumante());
        return quarto;
    }

    public List<QuartoResponse> consultarQuartos(){
        List<Quarto> quartos = repository.findAll();
        return quartos.stream()
                .map(QuartoResponse::new)
                .collect(Collectors.toList());
    }
}
