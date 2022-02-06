-- countar número de linhas
select count(*) from artista
where  imagem ='Imagem em falta';

-- max vai retornar o valor maximo, min retorna o minimo 

select importe as max_importe from pagos
order by importe asc;

select max(importe) as max_importe, min(importe) as min_importe from pagos;

-- SUM retorna o valor total da soma do conjunto de dados.
SELECT SUM(duracao) from cancao
where IdAlbum=1;

SELECT * from cancao
where IdAlbum=1;

-- AVG retorna a media.
SELECT SUM(duracao) AS SOMA , AVG(duracao) AS MEDIA from cancao
where IdAlbum=1;


-- DATE_FORMAT Formatação da data
select Datacriacao,DATE_FORMAT(Datacriacao, '%d %M %Y') as DATA_FORMATADA from playlist;

-- subqueries
select * from cancao
where qtdlikes <( select avg(qtdlikes)from cancao);