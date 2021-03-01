
-- 1.
SELECT nombre FROM peliculas;

-- 2.
SELECT DISTINCT calificacionEdad FROM peliculas
ORDER BY calificacionEdad;

-- 3.
SELECT nombre FROM peliculas
WHERE calificacionEdad IS NULL;

-- 4.
SELECT nombre FROM salas
WHERE CODIGO IS NULL;

-- 5.
SELECT * FROM salas
LEFT JOIN peliculas
ON salas.codigo = peliculas.codigo;

-- 6.
SELECT * FROM peliculas
LEFT JOIN salas
ON salas.codigo = peliculas.codigo;

-- 7.
SELECT * FROM peliculas
LEFT JOIN salas
ON salas.codigo = peliculas.codigo
WHERE salas.codigo IS NULL;

-- 8.
INSERT INTO peliculas(codigo,nombre, calificacionEdad) VALUES
	(10,'Un, Dos, Tres', 7);

-- 9.
ALTER TABLE peliculas
ADD no_recom_menores_de_13 varchar(50);

UPDATE peliculas
SET CALIFICACIONEDAD = 'no recomendada a menores de 13 años'
WHERE CALIFICACIONEDAD IS NULL;

-- 10.
DELETE salas.* FROM salas
JOIN peliculas
ON salas.codigo = peliculas.codigo
WHERE peliculas.CALIFICACIONEDAD = null;