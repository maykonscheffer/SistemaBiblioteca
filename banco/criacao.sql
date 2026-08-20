CREATE TABLE item (
                      id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                      codigo INTEGER NOT NULL,
                      titulo VARCHAR(200) NOT NULL,
                      tipo VARCHAR(20) NOT NULL CHECK (tipo IN ('livro', 'revista')),
                      autor VARCHAR(150),
                      edicao INTEGER,
                      disponivel BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE usuario (
                         id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         nome VARCHAR(150) NOT NULL,
                         tipo VARCHAR(20) NOT NULL CHECK (tipo IN ('aluno', 'professor')),
                         limite_itens INTEGER NOT NULL
);

CREATE TABLE emprestimo (
                            id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                            item_id INTEGER NOT NULL REFERENCES item(id),
                            usuario_id INTEGER NOT NULL REFERENCES usuario(id),
                            data_retirada DATE NOT NULL,
                            data_devolucao_prevista DATE NOT NULL,
                            data_devolucao DATE,
                            valor_multa NUMERIC(10, 2) NOT NULL DEFAULT 0.00
);