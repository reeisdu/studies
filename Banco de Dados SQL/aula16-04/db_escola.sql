/*-- Database: db_Escola

-- DROP DATABASE IF EXISTS "db_Escola";

CREATE DATABASE "db_Escola"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
*/

--criação de tabelas
create table cursos 
(
	id_cur 		serial primary key,
	nome_cur	varchar(100)	not null,
	duracao_cur int
);

create table alunos 
(
	rgm_alu		numeric(11) primary key,
	nome_alu 	varchar(100),
	id_cur		int references cursos(id_cur)
);


--inserção de dados nas tabelas
insert into cursos(nome_cur, duracao_cur) values ('TADS', 4), ('CCP', 8);
insert into alunos (rgm_alu, nome_alu, id_cur) values 
('1212121212','Arthur Morgan', 1), 
('1313131313', 'Mary Edgar', 2),
('1414141414', 'Emy Logan', 1);


--selecionar os dados
--selecione todos os nomes dos cursos cadastrados em ordem decrescente
select nome_cur as curso
from cursos
order by nome_cur desc; 

--selecione o codigo do curso chamado ccp
select id_cur
from cursos
where nome_cur = 'ccp' or nome_cur = 'CCP';
--outra forma
select id_cur
from cursos
where nome_cur in('ccp', 'CCP');


--selecione todos os cursos que estão com duração entre 2 e 4
select * from cursos where duracao_cur >= 2 and duracao_cur <= 4;
--outra forma
select *
from cursos
where duracao_cur between 2 and 4;


--selecione o nome dos alunos que cursam TADS em ordem crescente (usamos o ORDER BY)
--integridade referencial = quanod verificamos se a primary key é = a foreign key
select nome_alu
from alunos
where id_cur = 1
order by nome_alu asc;


--selecione o nome do aluno qu etem a letra N no final do nome
select nome_alu
from alunos
where nome_alu
ilike '%n';


--selecione o nome do aluno que tem Mary ou Emy no nome
select	nome_alu, rgm_alu
from	alunos
where	nome_alu ilike '%mar_%'


--selecione o nome dos alunos que possuem a letra A no início do nome
select	nome_alu
from	alunos
where	nome_alu ilike 'a%'


--selecione o nome do curso que possui a aluna chamada 'Ana Paula' "PEGADINHA DE PROVA"
select	nome_cur
from	cursos, alunos
where	nome_alu = 'Ana Paula' and cursos.id_cur = alunos.id_cur
	