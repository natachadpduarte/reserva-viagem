package com.reserva.hotel.model.request;


public class CadastroEnderecoRequest {

    private String pais;
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String bairro;

    public CadastroEnderecoRequest(String pais, String cep, String rua, Integer numero, String complemento, String bairro, String estado, String cidade) {
        this.pais = pais;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
    }

//    public Endereco toEndereco(){
//        return new Endereco(pais,cep, rua, numero, complemento, bairro, estado, cidade );
//    }


    public String getPais() {
        return pais;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getBairro() {
        return bairro;
    }
}

