package com.reserva.hotel.controller;

import com.reserva.hotel.model.request.CadastroClienteRequest;
import com.reserva.hotel.model.response.CadastroClienteResponse;
import com.reserva.hotel.model.response.CadastroEnderecoResponse;
import com.reserva.hotel.service.Impl.ClienteServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ClienteControllerTest {

    //Quando devo mockar dependências em testes unitários?
    //Regra geral:
    //Sim, sempre que sua classe depende de outra (service, repository, etc.) e você está escrevendo um teste unitário, você deve mockar essas dependências.

    @Mock
    private ClienteServiceImpl clienteServiceImpl;

    @InjectMocks
    private ClienteController clienteController;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void cadastraCliente_DeveRetornarCreatedComLocation(){
        CadastroClienteRequest request = new CadastroClienteRequest();
        Long idCliente = 123L;
        when(clienteServiceImpl.cadastrarCliente(any(CadastroClienteRequest.class))).thenReturn(idCliente);
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance();

        ResponseEntity<Void> response = clienteController.cadastroCliente(request, uriBuilder);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getHeaders().getLocation());
        assertEquals(URI.create("/idCliente/" + idCliente), response.getHeaders().getLocation());
        verify(clienteServiceImpl, times(1)).cadastrarCliente(request);
    }

    @Test
    void listaTodosOsClientes_DeveRetornarListaDeClientes() throws ParseException {
        //arrange
        CadastroEnderecoResponse endereco = new CadastroEnderecoResponse(
                "Brasil",
                "12345-678",
                "Rua das Flores",
                100,
                "São Paulo",
                "Apto 101",
                "SP",
                "Centro"
        );

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date dataNascimento = sdf.parse("2000-11-02");

        CadastroClienteResponse cliente1 = new CadastroClienteResponse(
                "37031245784",
                "teste teste teste",
                "12457847854",
                dataNascimento,
                endereco
        );

        CadastroClienteResponse cliente2 = new CadastroClienteResponse(
                "37031245784",
                "teste teste teste",
                "12457847854",
                dataNascimento,
                endereco
        );

        List<CadastroClienteResponse> listMock = Arrays.asList(cliente1, cliente2);

        //act
        when(clienteServiceImpl.consultarTodosOsClientes()).thenReturn(listMock);

        ResponseEntity<List<CadastroClienteResponse>> response = clienteController.listaTodosOsCliente();

        //assert
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(listMock, response.getBody());
        verify(clienteServiceImpl, times(1)).consultarTodosOsClientes();

    }
}