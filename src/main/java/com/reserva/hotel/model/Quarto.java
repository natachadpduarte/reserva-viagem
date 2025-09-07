package com.reserva.hotel.model;

import com.reserva.hotel.utils.enums.CategoriaQuarto;
import com.reserva.hotel.utils.enums.StatusQuarto;
import com.reserva.hotel.utils.enums.TipoCama;
import com.reserva.hotel.utils.enums.TipoQuarto;
import jakarta.persistence.*;

@Entity
@Table(name="quarto")
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuarto;
    private String nome;
    private CategoriaQuarto categoriaQuarto;
    private TipoQuarto tipoQuarto;
    private TipoCama tipoCama;
    private boolean fumante;
    private StatusQuarto statusQuarto;
}
