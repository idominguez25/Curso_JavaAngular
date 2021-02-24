drop database if exists PELÍCULAS_SALAS;
create database PELÍCULAS_SALAS;
use PELÍCULAS_SALAS;
create table PELICULAS (
Codigo int auto_increment primary key,
Nombre varchar(255) not null,›
CalificacionEdad int
);
create table SALAS (
Codigo INT auto_increment primary key, 
Nombre varchar(255) not null,
Codigo_pelicula int,
foreign key (Codigo_pelicula) references PELICULAS(Codigo)
on delete cascade on update cascade
);

-- INSERT de 10 registros
INSERT INTO peliculas (nombre, calificacionEdad) VALUES
	('El Club de la Lucha', 18),
	('Dogville', 18),
	('Del Reves', 0),
	('Donnie Darko', NULL),
	('Piratas del Caribe', 7),
	('Tres Anuncios a las Afueras', 18),
	('Los Vengadores: Infinity War I', 13),
	('Blade Runner 2049', NULL),
	('Dejame entrar', 13),
	('Interestelar', 7);

INSERT INTO salas (nombre, codigo_pelicula) VALUES
    ('Sala_1', 1),
	('Sala_2', 2),
	('Sala_3', 3),
	('Sala_4', 4),
	('Sala_5', 5),
	('Sala_6', 6),
	('Sala_7', 7),
	('Sala_8', NULL),
	('Sala_9', NULL),
	('Sala_10', 10);

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
WHERE Codigo_pelicula IS NULL;

-- 5.
SELECT * FROM salas
LEFT JOIN peliculas
ON codigo_pelicula = peliculas.codigo;

-- 6.
SELECT * FROM peliculas
LEFT JOIN salas
ON codigo_pelicula = peliculas.codigo;

-- 7.
SELECT * FROM peliculas
LEFT JOIN salas
ON codigo_pelicula = peliculas.codigo
WHERE salas.codigo IS NULL;

-- 8.
INSERT INTO peliculas(nombre, calificacionEdad) VALUES
	('Un, Dos, Tres', 7);

-- 9.
ALTER TABLE peliculas
ADD no_recom_menores_de_13 varchar(50);

UPDATE peliculas
SET no_recom_menores_de_13 = 'no recomendada a menores de 13 años'
WHERE calificacionEdad IS NULL;

-- 10.
DELETE salas.* FROM salas
JOIN peliculas
ON salas.codigo_pelicula = peliculas.codigo
WHERE peliculas.calificacionEdad = 0;