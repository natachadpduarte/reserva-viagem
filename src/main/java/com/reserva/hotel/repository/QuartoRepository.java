package com.reserva.hotel.repository;

import com.reserva.hotel.model.CadastroQuarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoRepository extends JpaRepository<CadastroQuarto, Long> {

}
