-- contar número de linhas
select count(*) from artista
where imagem ='imagem em falta';

-- max bai retornar o valor maximo, min retorna o minimo
select max(importe) as max_importe, min(importe) as min_importe from pagos;

-- sum 
select sum(duracao) from cancao
where idAlbum=1;

-- avg
select sum(duracao) as soma , avg(duracao) as media from cancao
where idAlbum=1;

select importe as max_importe from pagos
order by importe asc;

-- date_format formatação da data
select datacriacao,date_format(datacriacao,'%d %M %Y') as date_formatada from playlist;

-- subqueries

select * from cancao
where qtdlikes > (select avg(qtdlikes)from cancao);

