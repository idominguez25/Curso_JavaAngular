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

