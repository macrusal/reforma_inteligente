INSERT INTO `area`(AREA_TOTAL, NOME) VALUES(50, "SALA PRINCIPAL");

INSERT INTO `parede`(ALTURA, LARGURA, DESCRICAO, `area_id`) VALUES(2, 5, "FRENTE", 1);
INSERT INTO `parede`(ALTURA, LARGURA, DESCRICAO, `area_id`) VALUES(2, 10, "LADO DIREITO", 1);
INSERT INTO `parede`(ALTURA, LARGURA, DESCRICAO, `area_id`) VALUES(2, 10, "LADO ESQUERDO", 1);

INSERT INTO `produto`(ID, DESCRICAO, LITROS) VALUES(1, "TINTA QUALIDADE X012", 10);
INSERT INTO `produto`(ID, DESCRICAO, LITROS) VALUES(2, "TINTA QUALIDADE X018", 15);
INSERT INTO `produto`(ID, DESCRICAO, LITROS) VALUES(3, "TINTA QUALIDADE X026", 20);
INSERT INTO `produto`(ID, DESCRICAO, LITROS) VALUES(4, "TINTA QUALIDADE X032", 25);
