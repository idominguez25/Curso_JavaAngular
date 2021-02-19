drop database if exists DIRECTORES;
create database DIRECTORES;
use DIRECTORES;
create table DESPACHOS (
Numero int primary key,
Capacidad int
);
create table DIRECTORES (
DNI varchar(9) primary key,
NomApels varchar(255),
DNI_jefe varchar(8) references DIRECTORES (DNI),
Num_despacho int references DESPACHOS (Numero)
);
insert into DESPACHOS values
(10, 50),
(15, 50),
(20, 100),
(25, 150),
(30, 100),
(35, 70),
(40, 55),
(45, 90),
(50, 100),
(55, 210);
insert into DIRECTORES values
('48653178A', '', '12345678X', 10),
('12345678X', '', '', 15),
('78974565B', '', '12345678X', 10),
('98765432Y', '', '', 20),
('10236211C', '', '98765432Y', 25),
('46548632D', '', '12345678X', 30),
('89798535E', '', '', 35),
('41564684F', '', '98765432Y', 40),
('35454882G', '', '', 45),
('54521201H', '', '98765432Y', 55);