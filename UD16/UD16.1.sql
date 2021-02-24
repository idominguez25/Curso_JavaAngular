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

USE bd_tiendaInformatica;

INSERT INTO fabricantes (nombre) VALUES 
("Fabricante_1"),
("Fabricante_2"),
("Fabricante_3"),
("Fabricante_4"),
("Fabricante_5"),
("Fabricante_6"),
("Fabricante_7"),
("Fabricante_8"),
("Fabricante_9"),
("Fabricante_10");

INSERT INTO articulos VALUES 
(1, 'Articulo_1', 100, 1),
(2, 'Articulo_2', 100, 1),
(3, 'Articulo_3', 200, 1),
(4, 'Articulo_4', 250, 2),
(5, 'Articulo_5', 300, 2),
(6, 'Articulo_6', 100, 3),
(7, 'Articulo_7', 120, 4),
(8, 'Articulo_8', 150, 7),
(9, 'Articulo_9', 400, 9),
(10, 'Articulo_10', 420, 9);

-- 1.
SELECT nombre FROM articulos;

-- 2.
SELECT nombre, precio FROM articulos;

-- 3.
SELECT nombre, precio FROM articulos
WHERE precio <= 200;

-- 4.
SELECT * FROM articulos
WHERE precio BETWEEN 60 AND 120;

-- 5.
SELECT nombre, precio * 166.386 AS Precio_en_pesetas FROM articulos;

-- 6.
SELECT AVG(precio) AS Precio_medio FROM articulos;

-- 7.
SELECT AVG(precio) AS Precio_medio FROM articulos
WHERE fabricante = 2;

-- 8.
SELECT COUNT(codigo) AS Numero_articulos FROM articulos
WHERE precio >= 180;

-- 9.
SELECT nombre, precio FROM articulos
WHERE precio >= 180
ORDER BY precio DESC;

SELECT nombre, precio FROM articulos
WHERE precio >= 180
ORDER BY nombre;

-- 10.
SELECT a.*, f.nombre FROM articulos AS a, fabricantes AS f
WHERE a.fabricante = f.codigo;

-- 11.
SELECT a.nombre, a.precio, f.nombre FROM articulos AS a, fabricantes AS f
WHERE a.fabricante = f.codigo;

-- 12.
SELECT f.codigo AS codigo_fabricante, AVG(a.precio) AS precio_medio_productos
FROM articulos AS a, fabricantes AS f
WHERE a.fabricante = f.codigo
GROUP BY f.codigo
ORDER BY f.codigo;

-- 13.
SELECT f.nombre AS nombre_fabricante, AVG(a.precio) AS precio_medio_productos
FROM articulos AS a, fabricantes AS f
WHERE a.fabricante = f.codigo
GROUP BY f.codigo
ORDER BY f.codigo;

-- 14
SELECT fabricantes.nombre, articulos.nombre, articulos.precio
FROM fabricantes
INNER JOIN articulos
ON fabricantes.codigo=articulos.codigo
GROUP BY articulos.codigo
HAVING AVG(precio)  >=150;


-- 15.
SELECT MIN(precio)  FROM articulos
GROUP BY nombre;




-- 16.
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

SELECT a.nombre AS nombre_articulo, MAX(a.precio) AS precio, f.nombre AS nombre_fabricante
FROM articulos AS a, fabricantes AS f
WHERE fabricante = f.codigo
GROUP BY f.codigo;


-- 17.
INSERT INTO articulos VALUES 
(11, 'Altavoces', 70, 2);

-- 18.
UPDATE articulos
SET nombre = 'Impresora Laser'
WHERE codigo = 8;

-- 19.
UPDATE articulos
SET precio = precio * 0.9;

-- 20.
UPDATE articulos
SET precio = precio * 0.9
WHERE precio >= 120;