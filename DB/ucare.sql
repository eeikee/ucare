drop database if exists heroku_5534e621f769bf1;
create database heroku_5534e621f769bf1;
use heroku_5534e621f769bf1;

create table pacientes(
	id			integer PRIMARY KEY AUTO_INCREMENT,
    nome		varchar(30),
    idade		int,
    cpf			varchar(14),
    cep			varchar(10),
    email		varchar(30),
    estado		varchar(2),
    cidade		varchar(15),
    bairro		varchar(30),
    rua			varchar(30),
    numero		int
);

create table psicologos(
	id			integer PRIMARY KEY AUTO_INCREMENT,
    nome		varchar(30),
    idade		int,
    cpf			varchar(14),
    cep			varchar(10),
    email		varchar(30),
    estado		varchar(2),
    cidade		varchar(15),
    bairro		varchar(30),
    rua			varchar(30),
    numero		int
    
    
    
);

create table consultas(
    id           integer PRIMARY KEY AUTO_INCREMENT,
    paciente      varchar(30),
    psicologo     varchar(30),
    data_cons     date,
    horario       time,
    plataforma    varchar(30)


);




insert into psicologos(nome,idade,cpf,cep,email,estado,cidade,bairro,rua,numero) values ('DR. Eike','19','xxx.xxx.xxx-xx','xxxxx-xxx','eike@hotmail.com','SP','Sorocaba','São bento','xxxxx','xxxx');

insert into pacientes(nome,idade,cpf,cep,email,estado,cidade,bairro,rua,numero) values ('Luiz Eduardo','19','474.518.998-29','18053-525','luiz.eduardo.200@hotmail.com','SP','Sorocaba','Wanel Ville','Valmir vitório segura','100');
insert into pacientes(nome,idade,cpf,cep,email,estado,cidade,bairro,rua,numero) values ('Angelina','19','xxx.xxx.xxx-xx','xxxxx-xxx','angelina@hotmail.com','SP','Sorocaba','Jd.São Guilherme','XXXXXX','xxxx');

insert into consultas(paciente,psicologo,data_cons,horario,plataforma) values ('Luiz Eduardo','DR. Eike','2020-08-09','15:30','Discord');
insert into consultas(paciente,psicologo,data_cons,horario,plataforma) values ('Angelina','DR. Eike','2020-09-10','14:20','Zoom');
select * from psicologos;
select * from pacientes;
select * from consultas;
