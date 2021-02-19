DROP DATABASE IF EXISTS bd_cientificos;
CREATE DATABASE bd_cientificos;
USE bd_cientificos;

CREATE TABLE cientificos(
	DNI VARCHAR(8),
    nomApels NVARCHAR(255),
    PRIMARY KEY (DNI)
);

CREATE TABLE proyecto(
    id CHAR(4),
    nombre NVARCHAR(255),
    horas INT,
    PRIMARY KEY (id)
);

CREATE TABLE asignado_a(
	cientifico VARCHAR(8),
    proyecto CHAR(4),
    PRIMARY KEY (cientifico, proyecto),
    FOREIGN KEY (cientifico) REFERENCES cientificos (DNI)
    ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (proyecto) REFERENCES proyecto (id)
    ON DELETE CASCADE ON UPDATE CASCADE
);