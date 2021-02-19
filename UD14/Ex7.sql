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
    nomApels nvarchar(255),
    DNIJefe varchar(8),
    despacho int,
    PRIMARY KEY (DNI),
    FOREIGN KEY (DNIJefe) REFERENCES directores (DNI)
    ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (despacho) REFERENCES despachos (numero)
    ON UPDATE CASCADE ON DELETE CASCADE
);