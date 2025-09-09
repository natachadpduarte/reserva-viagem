
-- 1. Tabelas de ENUM (id manual, sem AUTO_INCREMENT)


CREATE TABLE status_quarto (
    id BIGINT PRIMARY KEY,
    status VARCHAR(255) NOT NULL
);

CREATE TABLE tipo_pagamento (
    id BIGINT PRIMARY KEY,
    tipo VARCHAR(255) NOT NULL
);

-- 2. Tabela CLIENTE (com composição de endereço)
CREATE TABLE cliente (
    idReserva BIGINT PRIMARY KEY AUTO_INCREMENT,
    nomeCompleto VARCHAR(255) NOT NULL,
    documento VARCHAR(100) NOT NULL,
    dataNascimento DATE NOT NULL,
    -- Campos de endereço embutidos
    endereco_pais VARCHAR(100),
    endereco_cep VARCHAR(20),
    endereco_rua VARCHAR(255),
    endereco_numero INT,
    endereco_complemento VARCHAR(255),
    endereco_bairro VARCHAR(100),
    endereco_cidade VARCHAR(100),
    endereco_estado VARCHAR(100)
);

-- 3. Tabela QUARTO (relacionando com enums)
CREATE TABLE quarto (
    idQuarto BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    categoriaQuarto_id BIGINT NOT NULL,
    tipoQuarto_id BIGINT NOT NULL,
    tipoCama_id BIGINT NOT NULL,
    fumante BOOLEAN NOT NULL,
    statusQuarto_id BIGINT NOT NULL,
    FOREIGN KEY (statusQuarto_id) REFERENCES status_quarto(id)
);

-- 4. Tabela RESERVA
CREATE TABLE reserva (
    idReserva BIGINT PRIMARY KEY AUTO_INCREMENT,
    idCliente BIGINT NOT NULL,
    idQuarto BIGINT NOT NULL,
    codigoReserva BIGINT NOT NULL,
    checkin DATETIME NOT NULL,
    checkout DATETIME NOT NULL,
    valor DECIMAL(15,2) NOT NULL,
    tipoPagamento_id BIGINT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES cliente(idReserva),
    FOREIGN KEY (idQuarto) REFERENCES quarto(idQuarto),
    FOREIGN KEY (tipoPagamento_id) REFERENCES tipo_pagamento(id)
);