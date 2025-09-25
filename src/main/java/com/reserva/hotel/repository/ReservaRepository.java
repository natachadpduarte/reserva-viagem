package com.reserva.hotel.repository;

import com.reserva.hotel.model.ReservaEntity;
import com.reserva.hotel.model.response.ReservaResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaEntity, Long> {

    Optional<ReservaEntity> findByClienteDocumentoOrClientePassaporte(String documento, String passaporte);
}
