DROP DATABASE IF EXISTS bd_almacenes;
CREATE DATABASE bd_almacenes;
USE bd_almacenes;

CREATE TABLE almacenes(
	codigo INT AUTO_INCREMENT,
    lugarCapacidad NVARCHAR(100),
    PRIMARY KEY (codigo)
);

CREATE TABLE cajas(
	numReferencia CHAR(5),
    contenido NVARCHAR(100),
    valor INT,
    almacen INT,
    PRIMARY KEY (numReferencia),
    FOREIGN KEY (almacen) REFERENCES almacenes(codigo)
    ON UPDATE CASCADE ON DELETE CASCADE
);