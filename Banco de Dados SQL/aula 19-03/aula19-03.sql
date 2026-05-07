-- Database: aula19-03

-- DROP DATABASE IF EXISTS "aula19-03";

CREATE DATABASE "aula19-03"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

	--CREATING CHANGES WITHOUT RESTRICTIONS

	create table patient (
		id_pat		int,
		name_pat	varchar(100),
		phone_pat	numeric(10),
		born_pat	date
	);

	create table doctor (
		id_doc		int,
		name_doc	varchar(100),
		specialty_doc	varchar(100)
	);

	create table consultation (
		id_cons		int,
		data_cons	date,
		value_cons		numeric(7,2),
		id_doc		int,
		id_pat		int
	);

	--CREATING CHANGES
	--We'll create primary key and foreign key restrictions

	alter table patient add constraint pk_id_pat primary key (id_pat);

	--Creating restrictions for null fields (Obrigatory Field - THIS FIELD NEED TO BE FILLED)
	alter table patient alter column name_pat set not null;

	--Creating primary key of TABLE DOCTOR
	alter table doctor add constraint pk_id_doc primary key (id_doc);

	--Foreign key in TABLE CONSULTATION
	alter table consultation add constraint fk_id_doc foreign key (id_doc) references doctor (id_doc);
	alter table consultation add constraint fk_id_pat foreign key (id_pat) references patient (id_pat);

	--We'll rename the table's name of patient to patients
	alter table patient rename to patients;

	select * from patients;

	--This command is not recommended (EXCLUSION), 'cuz when you use it, there's no way to go back
	--Column exclusion
	alter table patients drop column phone_pat;
	select * from patients;
	
	--Restriction exclusion
	alter table consultation drop constraint fk_id_doc;
	select * from doctor;

	--Table exclusion (The worse) = the program don't let we exclude, 'cuz this command is very careful
	drop table patients cascade; 
	drop table doctor, consultation cascade;
	
	
	--Instead this command, we use the FLAGS, cuz with this, we just put "native" or "inative", without commit the code

	

	
	










	