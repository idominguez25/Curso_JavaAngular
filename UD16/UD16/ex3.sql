
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

INSERT INTO almacenes (codigo,lugar,capacidad) VALUES
(6,'Barcelona', 3);


-- 12. 

INSERT INTO cajas  VALUES

('H5RT', "Papel", 200, 2);


-- 13.

UPDATE cajas
SET valor= valor-(valor*0.15)
WHERE almacen>0;
SELECT * FROM cajas;


-- 14.

UPDATE  cajas
SET valor=valor-(valor*0.20)
WHERE valor > (SELECT valor FROM (SELECT AVG (valor) FROM  cajas)AS v);


-- 15.

DELETE FROM cajas
WHERE valor <100;


-- 16.

DELETE  FROM cajas
WHERE  almacen IN (SELECT codigo FROM (SELECT codigo FROM almacenes WHERE  capacidad < (SELECT COUNT(numReferencia) FROM cajas WHERE almacen >0)) AS c);
