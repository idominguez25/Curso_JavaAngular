
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	sueldo decimal (8,2)
);

insert into empleado (nombre, apellido, trabajo, sueldo)values('Jose Marin','Director',2000);
insert into empleado (nombre, apellido, trabajo, sueldo)values('Juan Lopez','Ingeniero',1000);
insert into empleado (nombre, apellido, trabajo, sueldo)values('Pedro Guillem','Técnico',1200);
insert into empleado (nombre, apellido, trabajo, sueldo)values('Jordi Martin','Desarollador',1500);
insert into empleado (nombre, apellido, trabajo, sueldo)values('Ingrid Dominguez','Diseñador',1200);