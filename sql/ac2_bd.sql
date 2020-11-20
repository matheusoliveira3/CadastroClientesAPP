
create table cadastroclientes (
	id			int					auto_increment primary key,
    nome		varchar(30)			not null,
    cpf			varchar(30),
    sexo		varchar(15),
    endereco	varchar(120),
    cidade		varchar(60),
    estado		varchar(5) 
);

alter table cadastroclientes modify estado varchar(30);

create table cadastroprodutos (
	id 			int 				auto_increment primary key,
    categoria 	varchar(30),
    nome		varchar(60),
    estoque		int					default 0,
    custo		decimal(8,2),
    preco		decimal(8,2)
);

use bd_loja;
create table cadastropedidos (
	id				int				auto_increment primary key,
    id_cliente 		int,
    id_produto		int,
    quantidade		int,
    
    foreign key (id_cliente) references cadastroclientes(id),    
    foreign key (id_produto) references cadastroprodutos(id)
);

delimiter $
create trigger reduz_estoque after insert on cadastropedidos
	for each row
	begin        
		update cadastroprodutos
        set estoque = estoque - new.quantidade
        where id = new.id_produto;
	end$
delimiter ;