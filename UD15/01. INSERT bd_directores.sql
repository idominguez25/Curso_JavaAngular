DROP DATABASE IF EXISTS bd_directores;
CREATE DATABASE bd_directores;
USE bd_directores;

CREATE TABLE despachos(
	numero int,
    capacidad int,
    PRIMARY KEY (numero)
);

CREATE TABLE directores(
	DNI varchar(8),
    nomApels varchar(255),
    DNIJefe varchar(8),
    despacho int,
    PRIMARY KEY (DNI),
    FOREIGN KEY (DNIJefe) REFERENCES directores (DNI)
    ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (despacho) REFERENCES despachos (numero)
    ON UPDATE CASCADE ON DELETE CASCADE
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

insert into DIRECTORES(DNI, nomApels, despacho) values
('48653178', 'Alba Alonso', 10),
('12345678', 'Benito Buenafuente', 15),
('78974565', 'Cecilia Castro', 10),
('98765432', 'Diego Devito', 20),
('10236211', 'Enrique Egarritxea', 25),
('46548632', 'Francisca Fernandez', 30),
('89798535', 'Gemma Gallego', 35),
('41564684', 'Hector Hernandez', 40),
('35454882', 'Indira Iovaisha', 45),
('54521201', 'Jacinto Jaramillo', 55);

update DIRECTORES
set DNIJefe = '46548632'
where DNI = '48653178';

update DIRECTORES
set DNIJefe = '46548632'
where DNI = '12345678';

update DIRECTORES
set DNIJefe = '46548632'
where DNI = '78974565';

update DIRECTORES
set DNIJefe = '46548632'
where DNI = '10236211';

update DIRECTORES
set DNIJefe = '46548632'
where DNI = '89798535';

update DIRECTORES
set DNIJefe = '46548632'
where DNI = '41564684';

update DIRECTORES
set DNIJefe = '35454882'
where DNI = '98765432';

update DIRECTORES
set DNIJefe = '35454882'
where DNI = '54521201';

