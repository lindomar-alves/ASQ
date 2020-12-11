--liquibase formatted sql
--changeset lindomar:data-01

INSERT INTO procedimento (procedimento) VALUES (1234);
INSERT INTO procedimento (procedimento) VALUES (4567);
INSERT INTO procedimento (procedimento) VALUES (6789);

INSERT INTO sexo (sexo) VALUES ('M');
INSERT INTO sexo (sexo) VALUES ('F');

INSERT INTO idade (idade) VALUES (10);
INSERT INTO idade (idade) VALUES (20);
INSERT INTO idade (idade) VALUES (30);

 INSERT INTO idade_procedimento (idade_id, procedimento_id, sexo_id, executa_procedimento)
 VALUES ((SELECT id from idade WHERE idade = 10), (SELECT id from procedimento WHERE procedimento = 1234), (SELECT id from sexo WHERE sexo = 'M'), 'SIM'),
        ((SELECT id from idade WHERE idade = 20), (SELECT id from procedimento WHERE procedimento = 4567), (SELECT id from sexo WHERE sexo = 'M'), 'SIM'),
        ((SELECT id from idade WHERE idade = 10), (SELECT id from procedimento WHERE procedimento = 6789), (SELECT id from sexo WHERE sexo = 'F'), 'SIM'),
        ((SELECT id from idade WHERE idade = 10), (SELECT id from procedimento WHERE procedimento = 6789), (SELECT id from sexo WHERE sexo = 'M'), 'SIM'),
        ((SELECT id from idade WHERE idade = 20), (SELECT id from procedimento WHERE procedimento = 1234), (SELECT id from sexo WHERE sexo = 'M'), 'SIM'),
        ((SELECT id from idade WHERE idade = 30), (SELECT id from procedimento WHERE procedimento = 4567), (SELECT id from sexo WHERE sexo = 'F'), 'SIM');

