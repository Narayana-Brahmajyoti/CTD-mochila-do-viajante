-- 1) Queremos ter uma lista de todas as categorias.
SELECT * FROM EMARKET.CATEGORIAS;

-- 2) Como as categorias não possuem imagens, você está interessado em obter apenas um Nome e descrição da lista de categorias.

SELECT CATEGORIANOME,DESCRICAO FROM EMARKET.CATEGORIAS;

Select CategoriaNome,Descricao from emarket.categorias
Where CategoriaNome,Descricao Like 'L%';

-- 3) Obtenha uma lista dos produtos.
SELECT

-- 3) A operadora de telefonia atendeu um cliente e não lembra o nome dele. Sabe
-- apenas que começa com "C". Podemos ajudá-lo a obter uma lista com
-- todos os contatos que começam com a letra C?

select * from emarket.Clientes
where Contato like 'C%';

-- 4) Você deseja visualizar todas as faturas dos funcionários 2, 3, 5, 8 e 9.

select * from emarket.faturas
where EmpregadoID =3 or empregadoID =3;...

select * from emarket.faturas
where EmpregadoID in (2, 3, 5, 8, 9);

select * from emarket.faturas
where RegiaoEnvio in ('NK','Ak') 
limit 10
offset 4;

between
select * from emarket.faturas
where DataEnvio between '1996-10-01' and '1996-10-31';

select * from emarket.faturas
where DataEnvio >= '1996-10-01' or Dataenvio <= '1996-10-31';

alias

select * from CidadeEnvio as cidade,
EnderecoEnvio as endereco from emarket.faturas
where DataEnvio >= '1996-10-01' or Dataenvio <= '1996-10-31';
