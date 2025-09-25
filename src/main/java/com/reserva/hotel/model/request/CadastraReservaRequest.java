package com.reserva.hotel.model.request;

import com.reserva.hotel.utils.enums.NomeQuartoEnum;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastraReservaRequest {

    private String documento;
    private String passaporte;
    private NomeQuartoEnum nomeQuarto;
    private LocalDateTime checkin;
    private LocalDateTime checkout;

    public CadastraReservaRequest() {
    }

    public CadastraReservaRequest(String documento, String passaporte, NomeQuartoEnum nomeQuarto, LocalDateTime checkin, LocalDateTime checkout) {
        this.documento = documento;
        this.passaporte = passaporte;
        this.nomeQuarto = nomeQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void setNomeQuarto(NomeQuartoEnum nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public NomeQuartoEnum getNomeQuarto() {
        return nomeQuarto;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

}
