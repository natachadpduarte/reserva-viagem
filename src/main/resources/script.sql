-- Tabela de Endereço
CREATE TABLE ENDERECO (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    pais VARCHAR(100),
    cep VARCHAR(20),
    rua VARCHAR(100),
    numero VARCHAR(20),
    bairro VARCHAR(50),
    estado VARCHAR(50),
    cidade VARCHAR(50)
);

-- Tabela de Cliente
CREATE TABLE CLIENTE (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nomeCompleto VARCHAR(100),
    cpf VARCHAR(20),
    passaporte VARCHAR(20),
    dataNascimento DATE,
    endereco BIGINT,
    FOREIGN KEY (endereco) REFERENCES ENDERECO(id)
);

-- Tabela de Quarto
CREATE TABLE QUARTO (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    categoriaQuarto VARCHAR(20),
    tipoQuarto VARCHAR(20),
    tipoCama VARCHAR(20),
    fumante BOOLEAN,
    statusQuarto VARCHAR(20)
);

-- Tabela de Reserva
CREATE TABLE RESERVA (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    idCliente BIGINT,
    idQuarto BIGINT,
    codigoReserva VARCHAR(50),
    checkin TIMESTAMP,
    checkout TIMESTAMP,
    valorTotal DECIMAL(10,2),
    tipoPagamento VARCHAR(20),
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(id),
    FOREIGN KEY (idQuarto) REFERENCES QUARTO(id)
);

-- 1. Tabela de Enum: CATEGORIA_QUARTO
CREATE TABLE CATEGORIA_QUARTO (
    id INT PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(20) NOT NULL UNIQUE,
    nome VARCHAR(50) NOT NULL
);

-- 2. Inserindo valores do enum
INSERT INTO CATEGORIA_QUARTO (id, nome) VALUES
    ('PREMIUM', 'Premium'),
    ('LUXO', 'Luxo'),
    ('STANDARD', 'Standard');

-- 3. Tabela Principal: QUARTO
CREATE TABLE QUARTO (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    categoria_quarto_id INT NOT NULL,
    -- outros campos...
    FOREIGN KEY (categoria_quarto_id) REFERENCES CATEGORIA_QUARTO(id)
);

-- 4. Exemplo de INSERT em QUARTO
INSERT INTO QUARTO (nome, categoria_quarto_id) VALUES
    ('Quarto 101', 1), -- 1 = PREMIUM
    ('Quarto 102', 2); -- 2 = LUXO
