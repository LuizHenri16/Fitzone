CREATE DATABASE FITZONE_DB;
USE FITZONE_DB;

CREATE TABLE tipo_matricula (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    tipo_matricula VARCHAR(255),
    valor_matricula DECIMAL(10, 2)
);

insert into tipo_matricula(tipo_matricula,  valor_matricula) values
("Mensal", 80.00), ("Quinzenal", 40.00);

CREATE TABLE Cliente_Cadastro (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(255),
    cpf VARCHAR(255) UNIQUE NOT NULL,
    data_nascimento DATE NOT NULL,
    email VARCHAR(255) NOT NULL,
    id_tipoMatricula int,
    status VARCHAR(10),
    
    FOREIGN KEY (id_tipoMatricula) REFERENCES tipo_matricula(ID)
);

CREATE TABLE info_complementar (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    peso FLOAT,
    altura FLOAT,
    historico_saude TEXT,
    FOREIGN KEY (id_cliente) REFERENCES Cliente_Cadastro(ID)
    ON DELETE CASCADE
);

CREATE TABLE Contato_aluno (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    contato VARCHAR(255),
    contatoEmergencia VARCHAR(255),
    FOREIGN KEY (id_cliente) REFERENCES Cliente_Cadastro(ID)
    ON DELETE CASCADE
);

CREATE TABLE Endereco_aluno (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    endereco TEXT,
    FOREIGN KEY (id_cliente) REFERENCES Cliente_Cadastro(ID)
    ON DELETE CASCADE
);

CREATE TABLE Pagamento (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    id_tipo_matricula INT,
    data_ultimo_pagamento DATE,
    FOREIGN KEY (id_cliente) REFERENCES Cliente_Cadastro(ID) ON DELETE CASCADE,
    FOREIGN KEY (id_tipo_matricula) REFERENCES tipo_matricula(ID) ON DELETE CASCADE
);

CREATE TABLE ADM_ACESSO (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    usuario_adm VARCHAR(255),
    senha varchar(255),
    nivel_acesso VARCHAR(50)
);

CREATE TABLE Despesa (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255),
    valor decimal(10,2),
    data_despesa DATE
);

insert into ADM_ACESSO(usuario_adm, senha, nivel_acesso) values("ADM", sha2("ADM", 256), "Total");
insert into ADM_ACESSO(usuario_adm, senha, nivel_acesso) values("ADM1", sha2("ADM1", 256), "Parcial");

INSERT INTO Cliente_Cadastro (nome_cliente, cpf, data_nascimento, email, id_tipoMatricula, status) VALUES
('João Silva', '123.456.789-00', '1990-05-10', 'joao.silva@email.com', 1, 'Ativo'),
('Maria Oliveira', '987.654.321-00', '1985-09-22', 'maria.oliveira@email.com', 2, 'Ativo'),
('Carlos Souza', '321.654.987-00', '1995-12-15', 'carlos.souza@email.com', 2, 'Inativo'),
('Ana Martins', '456.123.789-00', '1992-07-30', 'ana.martins@email.com', 1, 'Ativo'),
('Felipe Ramos', '741.852.963-00', '1988-11-02', 'felipe.ramos@email.com', 2, 'Ativo'),
('Larissa Ferreira', '159.753.486-00', '2000-03-25', 'larissa.ferreira@email.com', 2, 'Inativo');

INSERT INTO info_complementar (id_cliente, peso, altura, historico_saude) VALUES
(1, 75.5, 1.78, 'Sem histórico relevante'),
(2, 62.0, 1.65, 'Asma controlada'),
(3, 85.3, 1.82, 'Hipertensão'),
(4, 68.0, 1.70, 'Nenhum'),
(5, 90.2, 1.85, 'Cirurgia no joelho em 2020'),
(6, 54.7, 1.60, 'Alergia a medicamentos');

INSERT INTO Contato_aluno (id_cliente, contato, contatoEmergencia) VALUES
(1, '(71) 91234-5678', '(71) 99876-5432'),
(2, '(71) 93456-7890', '(71) 98765-4321'),
(3, '(71) 94567-1234', '(71) 97654-3210'),
(4, '(71) 91234-0001', '(71) 99876-0002'),
(5, '(71) 92345-1111', '(71) 98765-1112'),
(6, '(71) 93456-2222', '(71) 97654-2223');

INSERT INTO Endereco_aluno (id_cliente, endereco) VALUES
(1, 'Rua das Palmeiras, 123 - Salvador - BA'),
(2, 'Av. Atlântica, 456 - Salvador - BA'),
(3, 'Rua das Flores, 789 - Salvador - BA'),
(4, 'Rua do Sol, 101 - Salvador - BA'),
(5, 'Av. Central, 202 - Salvador - BA'),
(6, 'Rua Primavera, 303 - Salvador - BA');

INSERT INTO Pagamento (id_cliente, id_tipo_matricula, data_ultimo_pagamento) VALUES
(1, 1, '2025-04-01'),
(2, 2, '2025-03-15'),
(3, 2, '2025-01-10'),
(4, 1, '2025-04-05'),
(5, 2, '2025-03-28'),
(6, 2, '2025-02-12');

