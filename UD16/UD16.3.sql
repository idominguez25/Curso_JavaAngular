DROP DATABASE IF EXISTS los_almacenes;
CREATE DATABASE los_almacenes;
USE los_almacenes;

CREATE TABLE almacenes (
	codigo INT AUTO_INCREMENT,
    lugar NVARCHAR(100),
    capacidad INT,
    PRIMARY KEY (codigo)
    );
    
    CREATE TABLE cajas (
    numReferencia CHAR(5),
    contenido  NVARCHAR(100),
    valor INT,
    almacen INT,
    PRIMARY KEY (numReferencia),
    FOREIGN KEY (almacen) REFERENCES almacenes(codigo)
    ON UPDATE CASCADE ON DELETE CASCADE
);
    
    
    INSERT INTO almacenes (lugar,capacidad) VALUES
("Lugar_1", 10),
("bilbao", 19),
("Lugar_3", 30),
("Lugar_4", 42),
("Lugar_5", 5),
("Lugar_6", 15),
("Lugar_7", 70),
("Lugar_8", 8),
("Lugar_9", 90),
("Lugar_10", 50);


	INSERT INTO cajas  VALUES
(1, "Contenido_1", 10, 1),
(2, "Contenido_2", 20, 2),
(3, "Contenido_3", 30, 3),
(4, "Contenido_4", 40, 4),
(5, "Contenido_5", 60, 5),
(6, "Contenido_6", 60, 6),
(7, "Contenido_7", 70, 7),
(8, "Contenido_8", 80, 8),
(9, "Contenido_9", 160, 9),
(10, "Contenido_10", 200, 10);


	INSERT INTO cajas  VALUES

(11, "Contenido_11", 10, 1),
(12, "Contenido_12", 20, 2),
(13, "Contenido_13", 30, 3),
(14, "Contenido_14", 400, 4),
(15, "Contenido_15", 500, 5),
(16, "Contenido_16", 60, 6),
(17, "Contenido_17", 70, 7),
(18, "Contenido_18", 80, 8),
(19, "Contenido_19", 160, 9),
(20, "Contenido_20", 200, 10);


-- 1. 

SELECT * FROM almacenes;


-- 2.

SELECT * FROM cajas WHERE valor > 150;

-- 3. 

SELECT contenido, valor FROM cajas;

-- 4.

SELECT AVG (valor)
FROM  cajas;

-- 5.

SELECT almacen, AVG (valor)
FROM  cajas
WHERE almacen 
GROUP BY almacen;


-- 6.

SELECT almacen AS codigo_almacen
FROM cajas
GROUP BY almacen
HAVING  sum(valor) / count(valor) >=150;

-- 7.

SELECT  cajas.numReferencia, almacenes.lugar
FROM almacenes
INNER JOIN cajas
ON almacenes.codigo=cajas.numReferencia;

-- 8.


SELECT almacen, COUNT(numReferencia) AS numero_cajas
FROM cajas
WHERE almacen
GROUP BY almacen;


-- 9. 

SELECT codigo,lugar
FROM almacenes
WHERE  capacidad < (SELECT COUNT(numReferencia) FROM cajas WHERE almacen );


-- 10.


SELECT  cajas.numReferencia, almacenes.lugar
FROM almacenes
INNER JOIN cajas
ON almacenes.lugar="bilbao";


-- 11.

INSERT INTO almacenes (lugar,capacidad) VALUES
("Barcelona", 3);


-- 12. 

INSERT INTO cajas  VALUES

('H5RT', "Papel", 200, 2);


-- 13.

UPDATE cajas
SET valor= valor-(valor*0.15)
WHERE almacen>0;
SELECT * FROM cajas;


-- 14.

 SET SQL_SAFE_UPDATES = 0;
UPDATE  cajas
SET valor=valor-(valor*0.20)
WHERE valor > (SELECT valor FROM (SELECT AVG (valor) FROM  cajas)AS v);


-- 15.

DELETE FROM cajas
WHERE valor <100;


-- 16.

DELETE  FROM cajas
WHERE  almacen IN (SELECT codigo FROM (SELECT codigo FROM almacenes WHERE  capacidad < (SELECT COUNT(numReferencia) FROM cajas WHERE almacen >0)) AS c);



