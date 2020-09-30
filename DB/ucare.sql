use heroku_5534e621f769bf1;

create table pacientes(
	id			integer PRIMARY KEY AUTO_INCREMENT,
    nome		varchar(30),
    sobrenome	varchar(30),
    data_nasc	date,
    cpf			varchar(14),
    email		varchar(30),
    telefone	varchar(15),
    estado		varchar(2),
    cidade		varchar(15),
    bairro		varchar(30),
    rua			varchar(30),
    numero		int
    
);

create table psicologos(
	id			integer PRIMARY KEY AUTO_INCREMENT,
    nome		varchar(30),
    sobrenome	varchar(30),
    data_nasc	date,
    cpf			varchar(14),
    email		varchar(30),
    telefone	varchar(15),
    estado		varchar(2),
    cidade		varchar(15),
    bairro		varchar(30),
    rua			varchar(30),
    numero		int
    
    
    
);

create table consultas(
    id           integer PRIMARY KEY AUTO_INCREMENT,
    nomepac      varchar(30),
    nomepsic     varchar(30),
    data_cons    date,
    horario      date_format(data, '%h:%m')
    plataforma   varchar(30)


);




insert into psicologos(nome,sobrenome,data_nasc,cpf,email,telefone,estado,cidade,bairro,rua,numero) values ('DR. Joaquim','Lopes Ferreira','1984-07-09','474.518.998-29','joaquim.lopes@hotmail.com','15996302175','SP','Sorocaba','Wanel Ville','Valmir vitório segura','100');

insert into pacientes(nome,sobrenome,data_nasc,cpf,email,telefone,estado,cidade,bairro,rua,numero) values ('Joaquim','Lopes Ferreira','1984-07-09','474.518.998-29','joaquim.lopes@hotmail.com','15996302175','SP','Sorocaba','Wanel Ville','Valmir vitório segura','100');

insert into consultas(nomepac,nomepsic,data_cons,horario,plataforma) values ('Joaquim','DR.Joaquim','2020-08-09','15:30','Discord');

select * from psicologos;
select * from pacientes;
select * from consultas;
