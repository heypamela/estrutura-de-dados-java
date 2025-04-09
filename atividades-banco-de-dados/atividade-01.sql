CREATE DATABASE rh_gen;

USE rh_gen;

CREATE TABLE colaboradores (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(255),
	cargo VARCHAR(50),
	departamento VARCHAR(50),
	salario DECIMAL(10, 2),
	data_admissao DATE
);

INSERT INTO colaboradores(nome, cargo, departamento, salario, data_admissao) 
VALUES
('Shawn Spencer', 'Estagiário de RH', 'Recursos Humanos', 1400.00, '2024-03-15'),
('Burter Guster', 'Desenvolvedor', 'TI', 5800.00, '2023-01-10'),
('Juliet Ohara', 'Estagiária de Desenvolvimento', 'TI', 1600.00, '2024-08-01'),
('Carlton Lassiter', 'Auxiliar Administrativo', 'Administrativo', 4700.00, '2024-02-20'),
('Karen Vick', 'Coordenadora de RH', 'Recursos Humanos', 3900.00, '2020-05-12');

SELECT * FROM colaboradores WHERE salario > 2000;

SELECT * FROM colaboradores WHERE salario < 2000;

UPDATE colaboradores SET salario = 7800.00 WHERE nome = 'Burter Guster';

SELECT nome, salario from colaboradores;
