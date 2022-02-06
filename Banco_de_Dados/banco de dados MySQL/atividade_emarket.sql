-- EQUIPE: André Luiz , Narayana Brahmajyoti, Luiz Fernado, Cristiane Rodrigues, Wellington Santos.

-- Categorias e Produtos
-- 1) Queremos ter uma lista de todas as categorias.
select * from emarket.categorias;

-- 2) Como as categorias não possuem imagens, você está interessado em obter apenas um Nome e descrição da lista de categorias.
select CategoriaNome,Descricao from emarket.categorias;

-- 3) Obtenha uma lista dos produtos.
select produtonome from emarket.produtos;

-- 4) Existem produtos descontinuados? (Descontinuado = 1).
select * from emarket.produtos
where Descontinuado =1;

-- 5) Na sexta-feira, você deve se reunir com o fornecedor nr. 8. Quais são os produtos que eles fornecem?
select * from emarket.produtos where ProvedorID =8;

-- 6) Queremos saber todos os produtos cujo preço unitário se encontra
-- entre 10 e 22.
select * from emarket.produtos where PrecoUnitario between '10' and '22';

-- 7) Fica definido que um produto deve ser solicitado ao fornecedor se suas unidades em estoque forem inferiores ao nível de reabastecimento. Existem produtos a solicitar?
select * from emarket.produtos where UnidadesEstoque <= NivelReabastecimento;

-- 8) Você quer saber todos os produtos da lista anterior, mas que as unidades pedidas sejam iguais a zero.
select * from emarket.produtos where UnidadesPedidas ='0';

-- Clientes
-- 1) Obtenha uma lista de todos os clientes com contato, empresa, cargo, País. Classifique a lista por país.
select * from emarket.clientes order by Pais;

-- 2) Queremos atender todos os clientes que possuem o título de  “Proprietário". Esse título estará em inglês (Owner).
select * from emarket.clientes where Titulo ='owner';

-- 3) A operadora de telefonia atendeu um cliente e não lembra o nome dele. Sabe apenas que começa com "C". Podemos ajudá-lo a obter uma lista com
-- todos os contatos que começam com a letra C?
select * from emarket.clientes where Contato like 'c%';

-- Faturas
-- 1) Obtenha uma lista de todas as faturas, ordenadas por data da fatura em ordem ascendente.
select * from emarket.faturas order by DataFatura asc;

