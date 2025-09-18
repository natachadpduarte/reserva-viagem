package com.reserva.hotel.service;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.model.request.CadastroQuartoRequest;
import com.reserva.hotel.model.response.CadastroQuartoResponse;
import com.reserva.hotel.repository.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuartoService {

    @Autowired
    private QuartoRepository repository;

    public CadastroQuarto salvar(CadastroQuartoRequest request){
        CadastroQuarto cadastroQuarto = mapToEntity(request);
        return cadastroQuarto;
    }

    public CadastroQuarto mapToEntity(CadastroQuartoRequest request){
        CadastroQuarto cadastroQuarto = new CadastroQuarto();
        cadastroQuarto.setNome(request.getNome());
        cadastroQuarto.setCategoriaQuarto(request.getCategoriaQuarto());
        cadastroQuarto.setTipoCama(request.getTipoCama());
        cadastroQuarto.setFumante(request.getFumante());
        return cadastroQuarto;
    }

    public List<CadastroQuartoResponse> consultarQuartos(){
        List<CadastroQuarto> cadastroQuartos = repository.findAll();
        return cadastroQuartos.stream()
                .map(CadastroQuartoResponse::new)
                .collect(Collectors.toList());
    }
}
