package com.reserva.hotel.utils.mapper;

import com.reserva.hotel.model.ClienteEntity;
import com.reserva.hotel.model.QuartoEntity;
import com.reserva.hotel.model.ReservaEntity;
import com.reserva.hotel.model.request.CadastraReservaRequest;
import com.reserva.hotel.model.response.ReservaResponse;

public class ReservaMapper {

    public static ReservaEntity toReservaRequest(CadastraReservaRequest request,
                                                 ClienteEntity cliente, QuartoEntity quarto){
        if(request == null || cliente == null){
            return  null;
        }

        ReservaEntity reservaEntity = new ReservaEntity();
        reservaEntity.setCliente(cliente);
        reservaEntity.setQuartos(quarto);
        reservaEntity.setCheckin(request.getCheckin());
        reservaEntity.setCheckout(request.getCheckout());

        quarto.setReserva(reservaEntity);

        return reservaEntity;
    }

    public static ReservaResponse toReservaResponse(ReservaEntity reserva){
        if(reserva == null){
            return null;
        }

        ReservaResponse response = new ReservaResponse();
        response.setDocumento(reserva.getCliente().getDocumento());
        response.setPassaporte(reserva.getCliente().getPassaporte());
        response.setNomeQuarto(reserva.getQuartos().getNomeQuarto());
        response.setChekin(reserva.getCheckin());
        response.setCheckout(reserva.getCheckout());

        return response;
    }
}
