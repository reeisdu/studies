-- Database: db_studio

-- DROP DATABASE IF EXISTS db_studio;

CREATE DATABASE db_studio
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;




--Criação de Tabelas

create table artista 
(
	id_art   int not null, --id pertence á tabela artista.
	nome_art varchar(50) not null,
	telefone_art numeric(9),
	email_art varchar(50),
	cpf_art numeric(11),
	constraint pk_id_art primary key (id_art), --RESTRIÇÃO nome_restrição, tipo_restrição(coluna restrição).
	constraint uk_cpf_art unique (cpf_art)
);
--TRIGRAMAÇÃO = Retiro 3 letras do objeto petercente (seria o "_art") - Não aceita espaço entre o nome da coluna.


--Criação de Tabela de GÊNERO

create table genero 
(
	id_gen int not null,
	nome_gen varchar(50) not null,
	constraint pk_id_gen primary key (id_gen)
);

create table gravacoes --Não é aconselhado colocar not null na chave estrangeira, pq torna-se obrigatório preencher, logo, quando for apagada, dará erro.
(
	id_gra int not null,
	id_art int,
	id_gen int,
	valor_gra numeric(7,2),
	constraint pk_id_gra primary key (id_gra),
	constraint fk_id_art foreign key (id_art) references artista (id_art),
	constraint fk_id_gen foreign key (id_gen) references genero (id_gen)
);

--Inserção de dados

insert into artista values (100, 'Paulo', 119847363, 'paulo@gmail.com', 11111111111);
insert into genero values (1000,'samba');
insert into gravacoes values (2,101,1000,100.99);

--seleção de dados
select * from artista;
select * from genero;
select * from gravacoes;






	