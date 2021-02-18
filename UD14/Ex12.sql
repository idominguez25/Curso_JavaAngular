drop database if exists ACADEMIA;
create database ACADEMIA;
use ACADEMIA;
create table ALUMNOS (
Nombre varchar(255) not null,
Apellido1 varchar(255) not null,
Apellido2 varchar(255) null,
DNI char(9) primary key,
Direccion varchar(255),
Sexo char(1) CHECK (Sexo = 'H' || 'M'),
Fecha_nacimiento date,
curso int not null
);
create table PROFESORES (
Nombre varchar(255) unique,
Apellido1 varchar(255) not null,
Apellido2 varchar(255) null,
DNI char(9) primary key,
Direccion varchar(255),
Titulo varchar(255),
Gana int not null
);
create table CURSOS (
Nombre_curso varchar(255) unique,
Cod_curso int auto_increment primary key,
DNI_profesor char(9) references PROFESORES (DNI),
Maximo_alumnos int,
fecha_inicio date,
fecha_fin date CHECK (fecha_fin>fecha_inicio),
num_horas int not null
);