


CREATE DATABASE IF NOT EXISTE bancoDados;

CREATE TABLE cliente (

	cpfCliente int NOT NULL,
	nomeCliente varchar(40) NOT NULL,
	dtNascCliente varchar(30) NOT NULL,
	enderCliente varchar(50) NOT NULL,
	cidadeCliente varchar (30) NOT NULL,
	ufCliente varchar(3) NOT NULL,
	tel1 varchar(15) NOT NULL,
	tel2 varchar(15),
	CONSTRAINT cliente_pk PRIMARY KEY (cpfCliente)
	) DEFAULT CHARSET=utf8;




)



