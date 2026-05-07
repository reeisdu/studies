-- Database: db_Empresas

-- DROP DATABASE IF EXISTS "db_Empresas";

CREATE DATABASE "db_Empresas"
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
	CREATE TABLE EMPREGADOS (CODIGO INT, NOME VARCHAR(100), EMAIL TEXT);

	create table DEPTOS (CODIGO INT, NOME VARCHAR(100));

	create table CARGOS 
	(
		CODIGO INT,
		NOME TEXT,
		SALARIO NUMERIC(7,2)---99999,99
	);

	--Seleção de Dados
	select * from EMPREGADOS;
	select * from DEPTOS;
	select * from CARGOS;

	--INSERIR DADOS
	insert into EMPREGADOS values (1, 'Reis', 'SanAndreas007@Cj.com');
	insert into DEPTOS values (1, 'TI');
	insert into CARGOS values (1, 'Cybersecurity', 15500.25);



	

	

	