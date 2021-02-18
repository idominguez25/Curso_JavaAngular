DROP DATABASE IF EXISTS EMPLEADOS;
CREATE DATABASE EMPLEADOS;
USE EMPLEADOS;
CREATE TABLE DEPARTAMENTOS (
Código INT PRIMARY KEY,
Nombre varchar(255) NOT NULL,
Presupuesto INT
);
CREATE TABLE EMPLEADOS (
DNI varchar(8) PRIMARY KEY,
Nombre varchar(255) NOT NULL,
Apellidos varchar(255),
Departamento INT,
foreign key (Departamento) references DEPARTAMENTOS (Código)
on delete cascade on update cascade
);