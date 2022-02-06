CREATE TABLE usuario (
id_usuario int(11) primary key auto_increment,
nome_usuario varchar(45),
data_nascimento date,
sexo varchar(1),
email varchar(150) not null,
senha varchar(45) not null
)



