-- Database: db_convenio

-- DROP DATABASE IF EXISTS db_convenio;

CREATE DATABASE db_convenio
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;




	--DDL  Bank's Structure
	--Create table Command

	create table peoples 
	(
		id_pep		serial,
		name_pep	varchar(100) not null,
		age_pep		int check (age_pep >= 18),
		city_pep	varchar, --without the delimitation of characters, the programm'll use the maximum capacity
		constraint pl_id_pep primary key (id_pep)
	);

	--
	-- FOREIGN KEY CANNOT BE A SERIAL! ONLY THE PRIMARY KEY	
	create table dependents 
	(
		id_dep		int,
		name_dep	varchar(100) not null,
		id_pep		int,
		constraint pk_id_dep primary key (id_dep),
		constraint fk_id_pep foreign key (id_pep) references peoples (id_pep)
	);
	
	--Creating the DML, by the way, INSERT DATAS
	
	insert into peoples (name_pep, age_pep, city_pep) 
	values ('Reis', 20, 'Bauneário Camboriú');
	--
	select * from peoples;
	--
	insert into dependents 
	values (1,'Ana', 3);
	--
	select * from dependents;
	
	--Insert 5 registers in the table peoples, using just a command insert
	insert into peoples (name_pep, age_pep, city_pep)
	values
		('Jose', 50, 'SP'),
		('Paulo', 32, 'RJ'),
		('Manuel', 28, 'RJ'),
		('Jose', 50, 'SP'),
		('Paulo', 32, 'RJ'),
		('Manuel', 28, 'RJ');
	select * from peoples;

	--Deleting the datas using clause WHERE (condition)
	delete from peoples where name_pep = 'Jose';
	delete from peoples --Don't use this command, cuz it'll delete EVERYTHING

	--My code has some error. That is the why it's not running on the right way, but the knowledges are the same





	--UPDATE -modify datas
	update 	dependents
	set	name_dep = 'Morgan'	
	where name_dep = 'Ana';
	select * from dependents;
	
	--if i don't put the "where", it'll modify EVERYTHING

	update peoples
	set name_pep = 'Romário';
	select * from peoples;
	--without restriction, it'll change everything
	





	