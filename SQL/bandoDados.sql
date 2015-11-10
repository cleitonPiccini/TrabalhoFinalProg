SET NAMES 'utf8';
SET CHARSET 'utf8';

CREATE DATABASE IF NOT EXISTS bancodados
	DEFAULT CHARACTER SET 'utf8';

CREATE TABLE bancodados.cliente (

	cpf_cliente int NOT NULL,
	nome_cliente varchar(40) NOT NULL,
	dtnasc_cliente varchar(30) NOT NULL,
	ender_cliente varchar(50) NOT NULL,
	cidade_cliente varchar (30) NOT NULL,
	uf_cliente varchar(3) NOT NULL,
	fone_cliente int NOT NULL,
	CONSTRAINT cliente_pk PRIMARY KEY (cpf_cliente)
    
) DEFAULT CHARSET=utf8;
    
CREATE TABLE bancoDados.fornecedor (
	
    cnpj int NOT NULL,
    nome_fornecedor varchar (45) NOT NULL,
    nome_representante varchar (45) NOT NULL,
    CONSTRAINT fornecedor_pk PRIMARY KEY (cnpj)
    
)DEFAULT CHARSET=utf8;

CREATE TABLE bancoDados.produto (

	cod_produto int NOT NULL AUTO_INCREMENT,
    cnpj_fornecedor int NOT NULL,
    nome_produto varchar (45) NOT NULL,
    marca_produto varchar (45) NOT NULL,
    categoria_produto varchar (45) NOT NULL,
    descricao_produto varchar (45) NOT NULL,
    valor_produto int NOT NULL,
    quant_produto int NOT NULL,
    CONSTRAINT produto_pk PRIMARY KEY (cod_produto),
    CONSTRAINT produto_fk FOREIGN KEY (cnpj_fornecedor) REFERENCES bancoDados.fornecedor(cnpj)

)DEFAULT CHARSET=utf8;

CREATE TABLE bancoDados.venda (

	cpf int NOT NULL,
    cod int NOT NULL,
    dt_venda varchar (45) NOT NULL,
    CONSTRAINT venda_pk PRIMARY KEY (cpf, cod),
    CONSTRAINT vendacliente_fk FOREIGN KEY (cpf) REFERENCES bancoDados.cliente (cpf_cliente),
    CONSTRAINT vendaproduto_fk FOREIGN KEY (cod) REFERENCES bancoDados.produto (cod_produto)

)DEFAULT CHARSET=utf8;