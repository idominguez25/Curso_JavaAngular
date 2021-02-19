DROP DATABASE IF EXISTS bd_tiendaInformatica;
CREATE DATABASE bd_tiendaInformatica;
USE bd_tiendaInformatica;

CREATE TABLE fabricantes(
	codigo INT AUTO_INCREMENT,
	nombre NVARCHAR(100),
    PRIMARY KEY(codigo)
);

CREATE TABLE articulos(
	codigo INT,
    nombre NVARCHAR(100),
    precio INT,
    fabricante INT,
	PRIMARY KEY(codigo),
    FOREIGN KEY(fabricante) REFERENCES fabricantes(codigo)
	ON UPDATE CASCADE ON DELETE CASCADE
);