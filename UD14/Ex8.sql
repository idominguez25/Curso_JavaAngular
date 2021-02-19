drop database if exists PIEZAS_PROVEEDORES;
create database PIEZAS_PROVEEDORES;
use PIEZAS_PROVEEDORES;
create table PIEZAS (
Codigo int auto_increment primary key,
Nombre varchar(255) not null
);
create table PROVEEDORES (
ID char(4) primary key,
Nombre varchar(255) not null
);
create table SUMINISTRA (
Codigo_pieza char(4) references PIEZAS (Codigo),
ID_Proveedor int references PROVEEDORES (ID),
Precio int,
primary key (Codigo_pieza, ID_Proveedor)
)