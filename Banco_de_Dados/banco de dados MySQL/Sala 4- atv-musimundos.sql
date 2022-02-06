-- Sala 4 
-- Rodrigo Lisboa
-- Luis Fernando
-- Steffany Cristina
-- Iraildes Vieira
-- Narayana Brahmajyoti
-- Cristiane Rodrigues

-- 1 - O valor da fatura mais alta cujo a cidade de cobrança é “Oslo”. (MAX)
Select max(valor_total) from faturas where cidade_cobranca = 'Oslo';

-- 2 - O valor da fatura mais baixa de todas. (MIN)
Select min(valor_total) from faturas where cidade_cobranca;

-- 3 - O valor médio das faturas que o país de cobrança é “Canada”. (AVG)
Select avg(valor_total) from faturas where pais_cobranca = 'Canada';

-- 4 - A quantidade de faturas que o país de cobrança é “Canada”. (COUNT)
select count(*) from faturas
where pais_cobranca = 'Canada';

-- 5 - O valor total somado de todas as faturas. (SUM)
select sum(valor_total) from faturas;

-- 6 - Selecione o id, a data e valor das faturas com valor abaixo da média.(Subqueries e AVG)
select id,data_fatura,valor_total from faturas
where valor_total < (select avg(valor_total) from faturas);

-- 7 - A data de nascimento do funcionário mais jovem da empresa (MAX)
Select max(data_nascimento) from empregados;


-- 8 - A data de nascimento do funcionário mais velho da empresa (MIN)
Select min(data_nascimento) from empregados;

-- 9 - Formate a data do nascimento dos funcionários no formato ex: "02 May 2020".(DATE_FORMAT)
select data_nascimento,date_format(data_nascimento, '%d %M %Y') as data_formatada from empregados;

-- 10 - O numero de cancoes que tem como compositor “AC/DC”. (COUNT)
select count(*) from cancoes 
where compositor = 'AC/DC';

-- 11 - A duração média das músicas em milisegundos (AVG)
select avg(duracao_milisegundos) as media_milisegundos from cancoes;

-- 12 - O tamanho médio em bytes das músicas que como compositor “AC/DC”. (AVG)
select avg(bytes) as media_bytes from cancoes;

-- 13 - Quantidade de clientes que moram na cidade de “São Paulo”. (COUNT)
select count(*) from clientes
where cidade = 'São Paulo';

-- 14 - Quantidade de clientes que moram na cidade “Paris”. (COUNT)
select count(*) from clientes
where cidade = 'Paris';

-- 15 - Quantidade de clientes que tenham email do “yahoo”. (COUNT e LIKE)
select count(*) from clientes
where email like '%yahoo%';