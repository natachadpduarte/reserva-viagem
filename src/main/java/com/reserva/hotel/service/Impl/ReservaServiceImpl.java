package com.reserva.hotel.service.Impl;

import com.reserva.hotel.model.ClienteEntity;
import com.reserva.hotel.model.QuartoEntity;
import com.reserva.hotel.model.ReservaEntity;
import com.reserva.hotel.model.request.CadastraReservaRequest;
import com.reserva.hotel.model.response.ReservaResponse;
import com.reserva.hotel.repository.ClienteRepository;
import com.reserva.hotel.repository.QuartoRepository;
import com.reserva.hotel.repository.ReservaRepository;
import com.reserva.hotel.service.ReservaService;
import com.reserva.hotel.utils.enums.NomeQuartoEnum;
import com.reserva.hotel.utils.mapper.ReservaMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository repository;
    private final ClienteRepository clienteRepository;
    private final QuartoRepository quartoRepository;

    public ReservaServiceImpl(ReservaRepository repository, ClienteRepository clienteRepository, QuartoRepository quartoRepository) {
        this.repository = repository;
        this.clienteRepository = clienteRepository;
        this.quartoRepository = quartoRepository;
    }

    @Override
    public Long  cadastroReservaCliente(CadastraReservaRequest request){

        ClienteEntity cliente = clienteRepository.findByDocumentoOrPassaporte(request.getDocumento(), request.getPassaporte())
                .orElseThrow(() -> new RuntimeException("documento nao encontrado"));
        QuartoEntity quarto = quartoRepository.findByNomeQuarto(request.getNomeQuarto());

        ReservaEntity reserva = ReservaMapper.toReservaRequest(request, cliente, quarto);
        quarto.setReserva(reserva);
        repository.save(reserva);

        return reserva.getIdReserva();
    }

    @Override
    public List<ReservaResponse> consultaReserva(){
        List<ReservaEntity> response = repository.findAll();
        return response.stream()
                .map(ReservaMapper::toReservaResponse)
                .collect(Collectors.toList());

    }

    @Override
    public ReservaResponse consultaReservaCpfOuPassaporte(String documento, String passaporte){
        ReservaEntity entity = repository.findByClienteDocumentoOrClientePassaporte(documento, passaporte)
                .orElseThrow(()-> new RuntimeException("Cliente não encontrado"));
        return ReservaMapper.toReservaResponse(entity);

    }
}
