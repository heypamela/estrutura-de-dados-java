CREATE DATABASE ecommerce;

USE ecommerce;

CREATE TABLE produtos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100),
  categoria VARCHAR(50),
  preco DECIMAL(10, 2),
  estoque INT,
  data_cadastro DATE
);

INSERT INTO produtos(nome, categoria, preco, estoque, data_cadastro) 
VALUES 
('Smartphone Samsung A21s', 'Celulares', 1800.00, 25, '2024-07-05'), 
('Mouse Logitech', 'Periféricos', 80.00, 100, '2022-11-08'),
('Teclado Mecânico Redragon', 'Periféricos', 250.00, 230, '2024-01-20'),
('Monitor LG 24"', 'Informática', 600.00, 15, '2023-08-14'),
('Roteador TP-Link Archer C6', 'Redes', 550.00, 130, '2023-09-25'),
('Pen Drive SanDisk 64GB', 'Armazenamento', 59.90, 100, '2024-01-03'),
('Tablet Samsung Galaxy', 'Informática', 1200.00, 12, '2024-02-28'),
('Fone de Ouvido JBL', 'Áudio', 400.00, 40, '2024-12-02');

SELECT * FROM produtos WHERE preco > 500;

SELECT * FROM produtos WHERE preco < 500;

UPDATE produtos SET preco = 100.00 WHERE nome = 'Mouse Logitech';

SELECT nome, preco from produtos;
