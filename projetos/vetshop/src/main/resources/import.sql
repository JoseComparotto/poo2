INSERT INTO categoria (nome) VALUES ('Medicamentos');
INSERT INTO categoria (nome) VALUES ('Suplementos');
INSERT INTO categoria (nome) VALUES ('Curativos');
INSERT INTO categoria (nome) VALUES ('Rações');
INSERT INTO categoria (nome) VALUES ('Acessórios');

INSERT INTO produto (preco, id_categoria, nome) VALUES (25.0, 1, 'Antibiótico Canino');
INSERT INTO produto (preco, id_categoria, nome) VALUES (30.0, 1, 'Antipulgas Spot-On');
INSERT INTO produto (preco, id_categoria, nome) VALUES (15.0, 1, 'Vermífugo Comprimido');
INSERT INTO produto (preco, id_categoria, nome) VALUES (12.0, 1, 'Anti-inflamatório Gel');
INSERT INTO produto (preco, id_categoria, nome) VALUES (50.0, 1, 'Vacina Antirrábica');

INSERT INTO produto (preco, id_categoria, nome) VALUES (40.0, 2, 'Suplemento Vitamínico Canino');
INSERT INTO produto (preco, id_categoria, nome) VALUES (35.0, 2, 'Suplemento Ômega 3 para Cães');
INSERT INTO produto (preco, id_categoria, nome) VALUES (45.0, 2, 'Suplemento Articular para Cães');
INSERT INTO produto (preco, id_categoria, nome) VALUES (60.0, 2, 'Suplemento Multivitamínico Felino');
INSERT INTO produto (preco, id_categoria, nome) VALUES (50.0, 2, 'Protetor Hepático para Gatos');

INSERT INTO produto (preco, id_categoria, nome) VALUES (10.0, 3, 'Curativo Adesivo para Animais');
INSERT INTO produto (preco, id_categoria, nome) VALUES (15.0, 3, 'Faixa Elástica Curativa');
INSERT INTO produto (preco, id_categoria, nome) VALUES (20.0, 3, 'Spray Antisséptico Veterinário');
INSERT INTO produto (preco, id_categoria, nome) VALUES (12.0, 3, 'Bandagem Autoadesiva para Animais');
INSERT INTO produto (preco, id_categoria, nome) VALUES (18.0, 3, 'Gaze Estéril para Curativos');

INSERT INTO produto (preco, id_categoria, nome) VALUES (90.0, 4, 'Ração Premium para Cães Adultos');
INSERT INTO produto (preco, id_categoria, nome) VALUES (85.0, 4, 'Ração Premium para Filhotes de Gato');
INSERT INTO produto (preco, id_categoria, nome) VALUES (120.0, 4, 'Ração Super Premium para Cães Idosos');
INSERT INTO produto (preco, id_categoria, nome) VALUES (100.0, 4, 'Ração Hipoalergênica para Cães');
INSERT INTO produto (preco, id_categoria, nome) VALUES (75.0, 4, 'Ração Light para Gatos');

INSERT INTO produto (preco, id_categoria, nome) VALUES (30.0, 5, 'Coleira Antipulgas');
INSERT INTO produto (preco, id_categoria, nome) VALUES (25.0, 5, 'Caminha para Cães Pequenos');
INSERT INTO produto (preco, id_categoria, nome) VALUES (45.0, 5, 'Brinquedo Mordedor para Cães');
INSERT INTO produto (preco, id_categoria, nome) VALUES (35.0, 5, 'Arranhador para Gatos');
INSERT INTO produto (preco, id_categoria, nome) VALUES (20.0, 5, 'Comedouro Antiderrapante');

INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('João Silva', '123.456.789-00', 'joao.silva@example.com', '11987654321');
INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('Maria Oliveira', '987.654.321-00', 'maria.oliveira@example.com', '11876543210');
INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('Carlos Pereira', '111.222.333-44', 'carlos.pereira@example.com', '11765432109');
INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('Ana Costa', '222.333.444-55', 'ana.costa@example.com', '11654321098');
INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('Luiz Santos', '333.444.555-66', 'luiz.santos@example.com', '11543210987');

INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Distribuidora XYZ', 'XYZ Pets', '12.345.678/0001-90', 'contato@xyzpets.com', '11987654321');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Fornecedora ABC', 'ABC Rações', '98.765.432/0001-01', 'atendimento@abcracoes.com', '11876543210');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Vet Supply Co.', 'Vet Supplies', '33.444.555/0001-02', 'info@vetsupplyco.com', '11765432109');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Pet Produtos Ltda', 'Produtos Pet', '44.555.666/0001-03', 'vendas@petprodutos.com', '11654321098');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Animal Care', 'Cuidados Animais', '55.666.777/0001-04', 'contato@animalcare.com', '11543210987');

INSERT INTO pedido (nome, id_cliente, id_fornecedor, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 1', 1, 1, CURRENT_DATE, CURRENT_DATE);
INSERT INTO pedido (nome, id_cliente, id_fornecedor, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 2', 2, 2, CURRENT_DATE, CURRENT_DATE);
INSERT INTO pedido (nome, id_cliente, id_fornecedor, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 3', 3, 3, CURRENT_DATE, CURRENT_DATE);
INSERT INTO pedido (nome, id_cliente, id_fornecedor, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 4', 4, 4, CURRENT_DATE, CURRENT_DATE);
INSERT INTO pedido (nome, id_cliente, id_fornecedor, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 5', 5, 5, CURRENT_DATE, CURRENT_DATE);

INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (1, 1);
INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (1, 2);
INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (1, 5);

INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (2, 6);
INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (2, 8);
INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (2, 12);

INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (3, 10);
INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (3, 15);

INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (4, 14);
INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (4, 16);

INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (5, 3);
INSERT INTO pedido_produtos (id_pedido, id_produto) VALUES (5, 4);

