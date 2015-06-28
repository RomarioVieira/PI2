create table usuario(
	cod serial primary key,
	nome varchar,
	
	email varchar,
	cidade varchar,
	estado char(2),
	pais varchar,
	data_cadastro timestamp
	);

create table login(
	cod int references usuario (cod),
	user_ varchar,
	senha varchar,
	hora_login timestamp
);

create table post(
	cod int references usuario(cod),
	post varchar(141)
);
	
alter table 