INSERT INTO estado (id, sigla, nome) values (1, 'SP', 'São Paulo');
INSERT INTO estado (id, sigla, nome) values (2, 'RJ', 'Rio de Janeiro');
INSERT INTO estado (id, sigla, nome) values (3, 'MG', 'Minas Gerais');
INSERT INTO estado (id, sigla, nome) values (4, 'ES', 'Espírito Santo');

INSERT INTO cidade (id, nome, estado_id) values (1, 'São Paulo', 1);
INSERT INTO cidade (id, nome, estado_id) values (2, 'Atibaia', 1);
INSERT INTO cidade (id, nome, estado_id) values (3, 'Campos do Jordão', 1);
INSERT INTO cidade (id, nome, estado_id) values (4, 'Rio de Janeiro', 2);
INSERT INTO cidade (id, nome, estado_id) values (5, 'Angra dos Reis', 2);

INSERT INTO destino (id, data_inclusao, descricao, nome, valor, cidade_id) VALUES (1, '2020-05-10', 'Lugar bem legal!', 'Praia', 450.00, 5);

INSERT INTO destino (id, data_inclusao, descricao, nome, valor, cidade_id) VALUES (2, '2021-04-21', 'Lugar bem legal!', 'Montanha', 1000.00, 3);

INSERT INTO destino (id, data_inclusao, descricao, nome, valor, cidade_id) VALUES (3, '2021-04-21', 'Lugar bem legal!', 'Praia', 1000.00, 4);

INSERT INTO destino (id, data_inclusao, descricao, nome, valor, cidade_id) VALUES (4, '2021-04-21', 'Lugar bem legal!', 'Campo', 1000.00, 2);

INSERT INTO destino (id, data_inclusao, descricao, nome, valor, cidade_id) VALUES (5, '2021-04-21', 'Lugar bem legal!', 'Negócios', 1000.00, 1);

INSERT INTO foto (id, url, foto_capa, destino_id) VALUES (1, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Frecife2.jpg?alt=media&token=f2754adc-cf09-4b76-941c-a287fd3d4433', true, 1)
INSERT INTO foto (id, url, foto_capa, destino_id) VALUES (2, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fsampa1.jpg?alt=media&token=0a37b5bc-7ec4-4de0-901f-b553e91969ba', true, 5)
INSERT INTO foto (id, url, foto_capa, destino_id) VALUES (3, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fsampa2.jpg?alt=media&token=e2c88689-1b61-444c-b4ac-c898858f3930', false, 2)
INSERT INTO foto (id, url, foto_capa, destino_id) VALUES (4, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fgramado.jpg?alt=media&token=29ac3d4c-6514-4c9d-9812-62783601f2b3', true, 2)
