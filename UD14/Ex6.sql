drop database if exists PELÍCULAS_SALAS;
create database PELÍCULAS_SALAS;
use PELÍCULAS_SALAS;
create table PELICULAS (
Codigo int auto_increment primary key,
Nombre varchar(255) not null,
CalificacionEdad int not null
);
create table SALAS (
Codigo INT auto_increment primary key, 
Nombre varchar(255) not null,
Codigo_pelicula int,
foreign key (Codigo_pelicula) references PELICULAS(Codigo)
on delete cascade on update cascade
);