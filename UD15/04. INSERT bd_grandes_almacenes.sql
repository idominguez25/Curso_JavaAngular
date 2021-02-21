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

insert into PRODUCTOS  (Codigo,nombre,precio)  values

	(DEFAULT,'carteras',15),
    (DEFAULT,'zapatos',45),
    (DEFAULT,'camisetas',15),
    (DEFAULT,'pantalones',25),
    (DEFAULT,'gorras',35),
    (DEFAULT,'chanclas',15),
    (DEFAULT,'collares',50),
    (DEFAULT,'gafas',53),
    (DEFAULT,'calcetines',12),
    (DEFAULT,'cinturones',14);
    
    
insert into CAJEROS  (Codigo,NomApels) values

	(DEFAULT,'Alberto Zambrano'),
    (DEFAULT,'Luis Perez'),
    (DEFAULT,'Ana Fernandez'),
    (DEFAULT,'Raul Farfan'),
    (DEFAULT,'Jose Lito'),
    (DEFAULT,'Carlos Latre'),
    (DEFAULT,'Kimberly Alvarez'),
    (DEFAULT,'Ismael Gonzalez'),
    (DEFAULT,'Marco Rostagno'),
    (DEFAULT,'Kiko Caballero');
    
    
insert into MAQUINAS_REGISTRADORAS  (Codigo,Piso) values

	(DEFAULT,1),
    (DEFAULT,2),
    (DEFAULT,3),
    (DEFAULT,4),
    (DEFAULT,5),
    (DEFAULT,6),
    (DEFAULT,7),
    (DEFAULT,8),
    (DEFAULT,9),
    (DEFAULT,10);