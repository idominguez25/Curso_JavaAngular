DROP DATABASE IF EXISTS bd_investigadores;
CREATE DATABASE bd_investigadores;
USE bd_investigadores;

CREATE TABLE facultad(
	codigo INT,
    nombre NVARCHAR(100),
    PRIMARY KEY (codigo)
);

CREATE TABLE investigadores(
	DNI VARCHAR(8),
    nomApels NVARCHAR(255),
    facultad INT,
    PRIMARY KEY (DNI),
    FOREIGN KEY (facultad) REFERENCES facultad (codigo)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE equipos(
	numSerie CHAR(4),
    nombre NVARCHAR(100),
    facultad INT,
    PRIMARY KEY (numSerie),
    FOREIGN KEY (facultad) REFERENCES facultad (codigo)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE reserva(
	DNI VARCHAR(8),
    numSerie CHAR(4),
    comienzo DATETIME,
    fin DATETIME,
    PRIMARY KEY (DNI, numSerie),
    FOREIGN KEY (DNI) REFERENCES investigadores (DNI)
    ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (numSerie) REFERENCES equipos (numSerie)
    ON DELETE CASCADE ON UPDATE CASCADE
);

insert into facultad values
(1, 'Facultad de Agronomía'),
(2, 'Facultad de Arquitectura'),
(3, 'Facultad de Ciencias de la Educación'),
(4, 'Facultad de Ciencias Económicas'),
(5, 'Facultad de Química'),
(6, 'Facultad de Ciencias Sociales'),
(7, 'Facultad de Derecho'),
(8, 'Facultad de Educación Física'),
(9, 'Facultad de Filosofía'),
(10, 'Facultad de Humanidades ');

insert into investigadores values
('85648262', 'Jose Manuel Medrano', 1),
('54647823', 'Jose Antonio Pelaez', 2),
('46543225', 'Elsa Rus', 8),
('68826015', 'Lara Osorio', 4),
('46865330', 'Armando Mohamed', 2),
('45643205', 'Mireia Novo', 3),
('46481887', 'Ander Alcala', 5),
('46304124', 'Aroa Avila', 9),
('66005485', 'Matilde Pérez', 10),
('45642230', 'Dylan Robles', 6);

insert into equipos values
('0001', 'Equipo1', 2),
('0002', 'Equipo2', 6),
('0003', 'Equipo3', 2),
('0004', 'Equipo4', 7),
('0005', 'Equipo5', 3),
('0006', 'Equipo6', 1),
('0007', 'Equipo7', 9),
('0008', 'Equipo8', 4),
('0009', 'Equipo9', 10),
('0010', 'Equipo10', 1);

insert into reserva values
('45642230', '0009', '2018-02-20 12:00:00', '2018-01-01 12:00:00'),
('45643205', '0002', '2016-05-12 12:00:00', '2017-01-31 12:00:00'),
('54647823', '0004', '2020-06-13 12:00:00', '2020-07-05 12:00:00'),
('68826015', '0006', '2019-06-29 12:00:00', '2019-08-13 12:00:00'),
('54647823', '0003', '2018-01-03 12:00:00', '2018-04-23 12:00:00'),
('85648262', '0001', '2017-01-20 12:00:00', '2017-03-21 12:00:00'),
('46865330', '0007', '2019-03-10 12:00:00', '2019-05-20 12:00:00'),
('66005485', '0010', '2020-04-17 12:00:00', '2020-05-19 12:00:00'),
('85648262', '0005', '2020-10-10 12:00:00', '2021-01-01 12:00:00'),
('45642230', '0003', '2017-04-25 12:00:00', '2017-06-21 12:00:00');