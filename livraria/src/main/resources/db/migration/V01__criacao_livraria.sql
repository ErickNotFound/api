CREATE TABLE categoria (
	id_categoria serial PRIMARY KEY,
	nome_categoria varchar(30) NOT NULL,
	descricao varchar(200)
);

CREATE TABLE livro (
    id_livro serial PRIMARY KEY,
    titulo varchar(40) NOT NULL,
    isbn varchar(20) NOT NULL UNIQUE,
    dataPublicacao date,
    id_categoria bigint,
   	FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE associado (
	id_associado serial PRIMARY KEY,
	nome varchar (50) NOT NULL,
	telefone varchar (15) NOT NULL,
	cpf varchar (11) NOT NULL,
	logradouro varchar (80) NOT NULL,
	numero varchar (10) NOT NULL,
	complemento varchar (30) NOT NULL,
	bairro varchar (50) NOT NULL,
	cidade varchar (50) NOT NULL,
	estado varchar (2) NOT NULL
);

CREATE TABLE autor (
	id_autor serial PRIMARY KEY,
	nome_autor varchar (50) NOT NULL
);

CREATE TABLE livro_autor (
	id_livro bigint,
	id_autor bigint,
	FOREIGN KEY (id_livro) REFERENCES livro(id_livro),
	FOREIGN KEY (id_autor) REFERENCES autor(id_autor)
);

CREATE TABLE emprestimo (
	id_emprestimo serial PRIMARY KEY,
	id_associado bigint not null,
	FOREIGN KEY (id_associado) REFERENCES associado(id_associado),
	dataEmprestimo date NOT null
);

CREATE TABLE emprestimo_livro (
	id_e_l serial PRIMARY KEY,
	id_emprestimo bigint,
	id_livro bigint,
	FOREIGN KEY (id_emprestimo) REFERENCES emprestimo(id_emprestimo),
	FOREIGN KEY (id_livro) REFERENCES livro(id_livro),
	observacoesAtoEmprestimo varchar (200)
);