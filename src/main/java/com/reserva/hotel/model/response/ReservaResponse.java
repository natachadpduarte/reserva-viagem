package com.reserva.hotel.model.response;

import com.reserva.hotel.utils.enums.NomeQuartoEnum;

import java.time.LocalDateTime;

public class ReservaResponse {

    private String documento;
    private String passaporte;
    private NomeQuartoEnum nomeQuarto;
    private LocalDateTime chekin;
    private LocalDateTime checkout;

    public ReservaResponse() {
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

    public LocalDateTime getChekin() {
        return chekin;
    }

    public void setChekin(LocalDateTime chekin) {
        this.chekin = chekin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }
}
