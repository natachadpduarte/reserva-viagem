package com.reserva.hotel.repository;

import com.reserva.hotel.model.CadastroCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<CadastroCliente, Long> {
}
