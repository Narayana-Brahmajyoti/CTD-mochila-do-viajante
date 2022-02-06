use musimundos;

select pais_cobranca, count(*) from faturas
group by pais_cobranca;

select pais_cobranca, count(*) as total_faturas, sum(valor_total) as Valor_total_suma
, avg(valor_total) as media_valor_total, max(valor_total) as max_valor_total, min(valor_total)
as min_valor_total from faturas
group by pais_cobranca;

select id_cliente,pais_cobranca, count(*) as total_faturas, sum(valor_total) as Valor_total_suma
, avg(valor_total) as media_valor_total, max(valor_total) as max_valor_total, min(valor_total)
as min_valor_total from faturas
where pais_cobranca<>'Hungary'
group by id_cliente, pais_cobranca
having max(valor_total)>20 and max(valor_total)<22
order by pais_cobranca ;



select * from faturas
where  pais_cobranca='Argentina' ;
select * from artistas
where id=1;
select * from albuns
where id_artista=1;


select artistas.id, artistas.nome, albuns.titulo from artistas inner join 
albuns on albuns.id_artista = artistas.id
order by artistas.nome;

select * from clientes;
select * from faturas;

select clientes.nome, faturas.id from faturas inner join clientes 
on clientes.id=faturas.id_cliente
where faturas.valor_total>5
order by valor_total desc; 

-- 3 Selecione o nome das cancoes (tabela cancoes) e o tipo de arquivo (tabela tipos_de_arquivos) e 
-- exiba o nome da canção e o tipo ordenado pelo id da canção.
select * from cancoes;
select  * from tipos_de_arquivo;

select cancoes.nome, tipos_de_arquivo.nome from cancoes inner join tipos_de_arquivo
on tipos_de_arquivo.id= cancoes.id_tipo_de_arquivo
order by cancoes.id;