use heroku_5534e621f769bf1;

create table pacientes(
	id			integer PRIMARY KEY AUTO_INCREMENT,
    nome		varchar(30)		not null,
    sobrenome	varchar(30)		not null,
    data_nasc	date			not null,
    cpf			varchar(14)		not null,
    email		varchar(30)		not null,
    telefone	varchar(15)		not null,
    estado		varchar(2)		not null,
    cidade		varchar(15)		not null,
    bairro		varchar(30)		not null,
    rua			varchar(30)		not null,
    numero		int				not null
    
);

create table psicologos(
	id			integer PRIMARY KEY AUTO_INCREMENT,
    nome		varchar(30)		not null,
    sobrenome	varchar(30)		not null,
    data_nasc	date			not null,
    cpf			varchar(14)		not null,
    email		varchar(30)		not null,
    telefone	varchar(15)		not null,
    estado		varchar(2)		not null,
    cidade		varchar(15)		not null,
    bairro		varchar(30)		not null,
    rua			varchar(30)		not null,
    numero		int				not null
    
    
    
);

