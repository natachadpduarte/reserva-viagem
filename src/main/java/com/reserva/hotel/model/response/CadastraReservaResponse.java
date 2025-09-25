package com.reserva.hotel.model.response;

import com.reserva.hotel.utils.enums.NomeQuartoEnum;

import java.time.LocalDateTime;

public class CadastraReservaResponse {

    private String documento;
    private String passaporte;
    private NomeQuartoEnum nomeQuarto;
    private LocalDateTime checkin;
    private LocalDateTime checkout;

    public CadastraReservaResponse() {
    }

    public CadastraReservaResponse(String documento, String passaporte, NomeQuartoEnum nomeQuarto, LocalDateTime checkin, LocalDateTime checkout) {
        this.documento = documento;
        this.passaporte = passaporte;
        this.nomeQuarto = nomeQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
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

    public NomeQuartoEnum getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(NomeQuartoEnum nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
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

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }
}
