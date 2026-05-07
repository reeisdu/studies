-- Database: oficinaMecânica

-- DROP DATABASE IF EXISTS "oficinaMecânica";

CREATE DATABASE "oficinaMecânica"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;






	create table cliente (
    id_cliente serial primary key,
    nome varchar(100),
    telefone varchar(20)
);

create table veiculo (
    id_veiculo serial primary key,
    placa varchar(10),
    modelo varchar(50),
    id_cliente int references cliente(id_cliente)
);

create table mecanico (
    id_mecanico serial primary key,
    nome varchar(100)
);

create table ordem_servico (
    id_ordem serial primary key,
    data date,
    id_veiculo int references veiculo(id_veiculo),
    id_mecanico int references mecanico(id_mecanico)
);

create table servico (
    id_servico serial primary key,
    descricao varchar(100),
    custo_unitario numeric(10,2)
);

create table peca (
    id_peca serial primary key,
    nome varchar(100),
    preco numeric(10,2)
);

create table item_servico (
    id_ordem int references ordem_servico(id_ordem),
    id_servico int references servico(id_servico),
    aprovado boolean,
    tempo int,
    valor numeric(10,2),
    primary key (id_ordem, id_servico)
);

create table item_peca (
    id_servico int references servico(id_servico),
    id_peca int references peca(id_peca),
    quantidade int,
    primary key (id_servico, id_peca)
);