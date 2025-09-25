package com.reserva.hotel.service.Impl;

import com.reserva.hotel.model.ClienteEntity;
import com.reserva.hotel.model.EnderecoEmbbeded;
import com.reserva.hotel.model.response.CadastroClienteResponse;
import com.reserva.hotel.repository.ClienteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ClienteServiceImplTest {

    @Mock
    ClienteRepository repository;

    @InjectMocks
    ClienteServiceImpl clienteServiceimpl;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void retornarStatus200EIdCliente() {
        //arrange
        EnderecoEmbbeded endereco = new EnderecoEmbbeded(
                "Brasil",           // pais
                "12345-678",        // cep
                "Rua das Flores",   // rua
                100,                // numero
                "Apto 101",         // complemento
                "Centro",           // bairro
                "São Paulo",        // cidade
                "SP"                // estado
        );

        Date dataNascimento = new GregorianCalendar(2000, GregorianCalendar.NOVEMBER, 2).getTime();

        ClienteEntity cliente = new ClienteEntity(
                "Fulano",        // nomeCompleto
                "37031245784",          // documento
                "AB123456",             // passaporte
                dataNascimento,         // dataNascimento
                endereco                // cadastroEndereco
        );

        Long idCliente = 123L;
        cliente.setId(idCliente);

        when(repository.findById(idCliente)).thenReturn(Optional.of(cliente));

        //act
        CadastroClienteResponse responseCliente = clienteServiceimpl.consultarClientePorId(idCliente);

        //assert
        assertEquals("Fulano", responseCliente.getNomeCompleto());

    }
}
