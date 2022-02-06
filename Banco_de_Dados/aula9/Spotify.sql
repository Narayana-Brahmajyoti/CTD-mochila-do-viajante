CREATE SCHEMA IF NOT exists SPOTIFY;
USE SPOTIFY;

-- criando primeira tabela comentário 
create table usuario (
IdUsuario INT NOT NULL ,
nomeusuario varchar(45),
data_nasc date, 
sexo varchar(1),
email varchar(150),
senha varchar(45),
primary key (IdUsuario)  
);

create table artista(
idArtista int not null auto_increment,
nome varchar(45),
sobrenome varchar(100),
primary key(idArtista)
);

create table genero(
Idgenero int not null auto_increment,
genero varchar(45),
primary key(Idgenero)
);

-- alter table usuario add column apelido varchar(45);
-- alter table usuario drop column apelido;
-- alter table usuario modify column IdUsuario INT NOT NULL auto_increment;

create table playlist(
idPlaylist int not null auto_increment,
idusuario int,
titulo varchar (45),
qtdcancoes int,
datacriacao datetime,
constraint PK_playlist primary key(idPlaylist),
constraint FK_usuario foreign key(idusuario) references usuario(IdUsuario)
);

create table album (
IdAlbum int not null auto_increment,
titulo varchar(45),
IdArtista int not null, -- Obrigatoriamente tenho um artista associado
primary key(IdAlbum),
constraint FK_artista foreign key(IdArtista) references artista(idArtista) 
);

create table cancao(
IdCancao int not null auto_increment,
titulo varchar(45),
duracao double,
qtdereproducao int,
qtdlikes int,
IdAlbum int, 
primary key(IdCancao),
constraint FK_Album foreign key(IdAlbum) references album(IdAlbum)
);

-- caso não tenho tenha usado constraint 
-- alter table cancao drop constraint cancao_ibfk_1;
-- alter table cancao add constraint FK_Album foreign key(IdAlbum) references album(IdAlbum);

create table playlist_cancao (
idPlaylist_cancao int not null auto_increment,
IdCancao int,
idPlaylist int,
primary key (idPlaylist_cancao),
constraint FK_cancao foreign key(IdCancao) references cancao(IdCancao),
constraint FK_playlist foreign key(idPlaylist) references playlist(idPlaylist)
);

create table generocancao(
Idgenerocancao int not null auto_increment,
idcancao int ,
idgenero int,
primary key(Idgenerocancao),
constraint FK_generocancao foreign key(idcancao) references cancao(IdCancao),
constraint FK_genero foreign key(idgenero) references genero(Idgenero)
) ;

select * from usuario;

insert into usuario (nomeusuario, data_nasc, sexo, email, senha)
values ('João','1990-10-02','M','joao@dh.com','1234'),
	  ('Ana','1990-09-01','F','ANA@dh.com','1234'),
      ('Valdir','1985-09-26','M','Valdir@dh.com','1234');
select * from artista;

insert into artista (nome, sobrenome) value ('Pablo','Vittar');
insert into artista (nome, sobrenome) value ('Gustavo','Lima');
select * from album;

insert into album( titulo, IdArtista) values ('Open bar',1),
('PablovittareAnitta',1),('Festa',2) ;

select * from cancao;

insert into cancao ( titulo, duracao, qtdereproducao, qtdlikes, IdAlbum)
values ('Bem sua cara','3','100000','1888','2'), ('Meteoro da paixao','5','105000','2888','3'),
('funkpablo','4','115000','2889','1');


















