-- Inserção dos itens
INSERT INTO item (codigo, titulo, tipo, autor, edicao, disponivel)
VALUES
    (1, 'Java para Iniciantes', 'livro', 'Herbert Schildt', 1, FALSE),
    (2, 'Banco de Dados', 'livro', 'Abraham Silberschatz', 2, TRUE),
    (3, 'Programacao Orientada a Objetos', 'livro', 'Deitel', 3, TRUE),
    (4, 'Revista de Tecnologia', 'revista', NULL, 10, TRUE);


-- Inserção dos usuários
INSERT INTO usuario (nome, tipo, limite_itens)
VALUES
    ('Joao da Silva', 'aluno', 3),
    ('Carlos Souza', 'professor', 5);


-- Inserção dos empréstimos
INSERT INTO emprestimo (
    item_id,
    usuario_id,
    data_retirada,
    data_devolucao_prevista,
    data_devolucao,
    valor_multa
)
VALUES
    (1, 1, '2026-08-10', '2026-08-24', NULL, 0.00),
    (2, 2, '2026-07-20', '2026-08-03', '2026-08-02', 5.00);