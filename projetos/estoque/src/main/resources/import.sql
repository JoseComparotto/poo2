INSERT INTO CLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao) VALUES (1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Carnes');
INSERT INTO CLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao) VALUES (2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Bebidas');
INSERT INTO CLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao) VALUES (3, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Laticínios');
INSERT INTO CLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao) VALUES (4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Biscoitos');
INSERT INTO CLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao) VALUES (5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Limpeza');

INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Carnes Bovinas', 1);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Carnes Suínas', 1);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (3, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Refrigerantes', 2);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Sucos', 2);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Queijos', 3);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (6, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Leite', 3);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Biscoitos Doces', 4);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (8, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Biscoitos Salgados', 4);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (9, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Detergentes', 5);
INSERT INTO SUBCLASSE_PRODUTO (id, data_inclusao, data_alteracao, descricao, id_classe) VALUES (10, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Sabão em Pó', 5);

INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Picanha', 1, 79.90);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Peito de Frango', 2, 19.90);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (3, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Costela Suína', 3, 29.90);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Vodka', 4, 49.90);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Cerveja Pilsen', 5, 4.99);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (6, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Leite Integral', 6, 3.49);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Queijo Muçarela', 7, 24.90);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (8, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Biscoito Recheado', 8, 2.99);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (9, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Água Sanitária', 9, 5.99);
INSERT INTO PRODUTO (id, data_inclusao, data_alteracao, descricao, id_subclasse, valor) VALUES (10, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Sabão em Pó', 10, 12.90);

INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Carne Prime Distribuidora', 'Rua das Carnes, 123', 'São Paulo', 'SP', '01001-000', '(11) 1234-5678', 'contato@carneprime.com.br', '12.345.678/0001-90');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'FrangoFácil Ltda', 'Avenida dos Aves, 456', 'Rio de Janeiro', 'RJ', '20001-000', '(21) 9876-5432', 'vendas@frangofacil.com.br', '23.456.789/0001-12');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (3, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Suínos e Cia', 'Travessa dos Suínos, 789', 'Belo Horizonte', 'MG', '30100-000', '(31) 3322-1100', 'suinos@suecia.com.br', '34.567.890/0001-34');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Bebidas Premium', 'Rua das Bebidas, 101', 'Curitiba', 'PR', '80010-000', '(41) 2222-3344', 'sac@bebidaspremium.com.br', '45.678.901/0001-56');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Laticínios do Sul', 'Estrada dos Laticínios, 202', 'Porto Alegre', 'RS', '90010-000', '(51) 4455-6677', 'contato@laticiniossul.com.br', '56.789.012/0001-78');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (6, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Biscoitos Belos', 'Avenida dos Biscoitos, 303', 'Fortaleza', 'CE', '60010-000', '(85) 7788-9900', 'sac@biscoitosbelos.com.br', '67.890.123/0001-90');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Limpeza Total', 'Rua dos Produtos de Limpeza, 404', 'Salvador', 'BA', '40010-000', '(71) 8899-0011', 'atendimento@limpezatotal.com.br', '78.901.234/0001-01');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (8, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Álcool & Companhia', 'Estrada das Destilarias, 505', 'Brasília', 'DF', '70010-000', '(61) 1122-3344', 'alcool@alcoolcia.com.br', '89.012.345/0001-23');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (9, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Queijos Finos', 'Alameda dos Queijos, 606', 'Recife', 'PE', '50010-000', '(81) 5566-7788', 'vendas@queijosfinos.com.br', '90.123.456/0001-34');
INSERT INTO FORNECEDOR (id, data_inclusao, data_alteracao, nome, endereco, cidade, estado, cep, telefone, email, cnpj) VALUES (10, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Produtos Higienix', 'Rodovia dos Produtos de Limpeza, 707', 'Manaus', 'AM', '69010-000', '(92) 6677-8899', 'sac@higienix.com.br', '01.234.567/0001-45');
