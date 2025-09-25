package com.reserva.hotel.repository;

import com.reserva.hotel.model.QuartoEntity;
import com.reserva.hotel.utils.enums.NomeQuartoEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuartoRepository extends JpaRepository<QuartoEntity, Long> {

    QuartoEntity findByNomeQuarto (NomeQuartoEnum nomeQuarto);
}
