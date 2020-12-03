select * from cadastroclientes;

select * from cadastroprodutos;

select * from cadastropedidos;


select pe.id, c.cpf, c.nome, pr.nome, pr.categoria, pe.quantidade, pe.quantidade * pr.preco as valor from cadastroclientes c
inner join (cadastropedidos pe
inner join cadastroprodutos pr
on pr.id = pe.id_produto)
on c.id = pe.id_cliente
;

-- SET FOREIGN_KEY_CHECKS=0;
