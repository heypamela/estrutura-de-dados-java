CREATE DATABASE escola;

USE escola;

CREATE TABLE estudantes (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(255),
	idade INT,
	serie VARCHAR(20),
	nota_final DECIMAL(4, 2),
	data_matricula DATE
);

INSERT INTO estudantes(nome, idade, serie, nota_final, data_matricula) 
VALUES
('Alice Martins', 13, '9º ano', 5.5, '2024-04-10'),
('Bruno Oliveira', 14, '8º ano', 8.3, '2024-02-01'),
('Eduarda Lima', 12, '7º ano', 6.8, '2024-06-01'),
('Felipe Rocha', 11, '5º ano', 4.8, '2024-02-20'),
('Nathan Silva', 8, '2º ano', 7.5, '2024-04-01'),
('Olívia Menezes', 10, '4º ano', 9.0, '2024-03-12'),
('Gabriela Torres', 08, '3º ano', 7.0, '2024-02-15');

SELECT * FROM estudantes WHERE nota_final > 7.0;

SELECT * FROM estudantes WHERE nota_final < 7.0;

UPDATE estudantes SET nota_final = 6.5 WHERE nome = 'Felipe Rocha';

SELECT nome, nota_final FROM estudantes;