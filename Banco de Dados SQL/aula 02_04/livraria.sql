-- Database: livraria

-- DROP DATABASE IF EXISTS livraria;

CREATE DATABASE livraria
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
    email varchar(100)
);

create table funcionario (
    id_funcionario serial primary key,
    nome varchar(100)
);

create table editora (
    id_editora serial primary key,
    nome varchar(100)
);

create table livro (
    id_livro serial primary key,
    titulo varchar(150),
    preco numeric(10,2),
    estoque int,
    id_editora int references editora(id_editora)
);

create table pedido (
    id_pedido serial primary key,
    data date,
    status varchar(20),
    id_cliente int references cliente(id_cliente)
);

create table item_pedido (
    id_pedido int references pedido(id_pedido),
    id_livro int references livro(id_livro),
    quantidade int,
    primary key (id_pedido, id_livro)
);