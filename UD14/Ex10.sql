drop database if exists GRANDES_ALMACENES;
create database GRANDES_ALMACENES;
use GRANDES_ALMACENES;
create table PRODUCTOS (
Codigo int auto_increment primary key,
Nombre varchar(255) not null,
Precio int
);
create table CAJEROS (
Codigo int auto_increment primary key,
NomApels varchar(255)
);
create table MAQUINAS_REGISTRADORAS (
Codigo int auto_increment primary key,
Piso int
);
create table VENTA (
Cod_cajero int references CAJEROS (Codigo),
Cod_maquina int references MAQUINAS_REGISTRADORAS (Codigo),
Cod_producto int references PRODUCTOS (Codigo),
primary key (Cod_cajero, Cod_maquina, Cod_producto)
);