package com.reserva.hotel.service.Impl;

import com.reserva.hotel.model.QuartoEntity;
import com.reserva.hotel.model.request.CadastroQuartoRequest;
import com.reserva.hotel.model.response.CadastroQuartoResponse;
import com.reserva.hotel.repository.QuartoRepository;
import com.reserva.hotel.service.QuartoService;
import com.reserva.hotel.utils.mapper.QuartoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuartoServiceImpl implements QuartoService {

    public final QuartoRepository repository;

    public QuartoServiceImpl(QuartoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long cadastrarQuarto(CadastroQuartoRequest request) {
        QuartoEntity quarto = QuartoMapper.mapperQuartoRequest(request);
        QuartoEntity salvo = repository.save(quarto);
        return salvo.getIdQuarto();
    }

    @Override
    public List<CadastroQuartoResponse> consultarQuartos(){
        List<QuartoEntity> quarto = repository.findAll();
        return quarto.stream()
                .map(QuartoMapper::mapperQuartoResponse)
                .collect(Collectors.toList());
    }

    @Override
    public CadastroQuartoResponse consultarIdQuarto(Long idQuarto){
        QuartoEntity response = repository.findById(idQuarto)
                .orElseThrow(() -> new RuntimeException("IdQuarto não encontrado"));
        CadastroQuartoResponse quartoResponse = QuartoMapper.mapperQuartoResponse(response);
        return quartoResponse;
    }

    @Override
    public void deletarQuarto(Long idQuarto){
        repository.deleteById(idQuarto);
    }
}
