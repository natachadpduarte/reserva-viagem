package com.reserva.hotel.service.Impl;

import com.reserva.hotel.model.CadastroQuarto;
import com.reserva.hotel.model.request.CadastroQuartoRequest;
import com.reserva.hotel.repository.QuartoRepository;
import com.reserva.hotel.service.QuartoService;
import com.reserva.hotel.utils.mapper.QuartoMapper;
import org.springframework.stereotype.Service;

@Service
public class QuartoServiceImpl implements QuartoService {

    public final QuartoRepository repository;

    public QuartoServiceImpl(QuartoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long cadastrarQuarto(CadastroQuartoRequest request) {
        CadastroQuarto quarto = QuartoMapper.toQuartoEntity(request);
        CadastroQuarto salvo = repository.save(quarto);
        return salvo.getIdQuarto();
    }
}
