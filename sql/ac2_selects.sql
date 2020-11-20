select * from cadastroclientes;

select * from cadastroprodutos;

select * from cadastropedidos;


select pe.id, c.cpf, c.nome, pr.nome, pr.categoria, pe.quantidade from cadastroclientes c
inner join (cadastropedidos pe
inner join cadastroprodutos pr
on pr.id = pe.id_produto)
on c.id = pe.id_cliente
;
