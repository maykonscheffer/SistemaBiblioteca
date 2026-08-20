-- 1. Listar todo o acervo
SELECT
    codigo,
    titulo,
    tipo,
    disponivel
FROM item;


-- 2. Listar os empréstimos em aberto
SELECT
    usuario.nome,
    item.titulo
FROM emprestimo
         JOIN usuario ON emprestimo.usuario_id = usuario.id
         JOIN item ON emprestimo.item_id = item.id
WHERE emprestimo.data_devolucao IS NULL;


-- 3. Calcular o total de multas acumuladas por usuário
SELECT
    usuario.nome,
    SUM(emprestimo.valor_multa) AS total_multas
FROM usuario
         JOIN emprestimo ON emprestimo.usuario_id = usuario.id
GROUP BY usuario.id, usuario.nome;


-- 4. Listar os itens que nunca foram emprestados
SELECT
    item.codigo,
    item.titulo
FROM item
         LEFT JOIN emprestimo ON emprestimo.item_id = item.id
WHERE emprestimo.id IS NULL;