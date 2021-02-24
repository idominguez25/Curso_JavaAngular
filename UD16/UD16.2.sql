DROP DATABASE IF EXISTS bd_departamentos;
CREATE DATABASE bd_departamentos;
USE bd_departamentos;



CREATE TABLE departamentos (
	codigo INT,
    nombre NVARCHAR(100),
    presupuesto INT,
    PRIMARY KEY (codigo)
    );
    
    CREATE TABLE empleados (
    DNI VARCHAR(8),
    nombre  NVARCHAR(100),
    apellidos NVARCHAR(255),
    departamento INT,
	PRIMARY KEY (DNI),
    FOREIGN KEY (departamento) REFERENCES departamentos(codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
	);

SET FOREIGN_KEY_CHECKS= 0;

insert into departamentos values
(1, 'Departamento1', 500), 
(2, 'Departamento2', 1000), 
(3, 'Departamento3', 700), 
(14, 'Departamento de informática', 80000), 
(5, 'Departamento5', 550), 
(6, 'Departamento6', 750), 
(37, 'Departamento7', 60500), 
(8, 'Departamento8', 800), 
(77, 'Departamento de investigación', 850),
(10, 'Departamento10', 990);


insert into  empleados values
 
('12345677', 'Igor', 'Martinez', 14),
('98746532', 'Maria', 'Pérez', 77),
('69852143', 'Max', 'Maya', 14),
('87456210', 'Noa', 'Moreno', 3),
('98765324', 'Julen', 'Marin', 37),
('42015365', 'Ignacio', 'Duarte', 10),
('74862501', 'Ariana', 'Cobos', 77),
('98561212', 'Sebastian', 'López', 2),
('60041257', 'Bianca', 'Martinez', 37),
('21365784', 'Oscar', 'Palomares', 14),
('89267109', 'Esther', 'Vázquez', 11);



-- 1.
SELECT apellidos
FROM empleados;

-- 2.
SELECT DISTINCT apellidos
FROM empleados;

-- 3.
SELECT *
FROM empleados
WHERE Apellidos LIKE 'López';

-- 4.
SELECT *
FROM empleados
WHERE Apellidos IN ('López', 'Pérez');

-- 5.
SELECT *
FROM empleados
WHERE Departamento = 14;

-- 6.
SELECT *
FROM empleados
WHERE Departamento IN (37,77);

-- 7.
SELECT *
FROM empleados
WHERE Apellidos LIKE 'P%';

-- 8.
SELECT SUM(PRESUPUESTO) AS 'PRESUPUESTO'
FROM Departamentos;

-- 9.
SELECT COUNT(DNI) AS 'Número de empleados', Departamento
FROM empleados
GROUP BY Departamento;

-- 10.
SELECT *
FROM empleados JOIN departamentos ON (empleados.Departamento = departamentos.codigo); 

-- 11.
SELECT E.Nombre, E.Apellidos, D.Nombre, D.Presupuesto
FROM empleados E JOIN departamentos D ON (E.Departamento = D.codigo);

-- 12.
SELECT E.Nombre, E.Apellidos, D.Presupuesto
FROM empleados E JOIN departamentos D ON (E.Departamento = D.codigo)
WHERE D.Presupuesto > 60000;   -- 9

-- 13.
SELECT *
FROM departamentos
WHERE Presupuesto >
(SELECT AVG(Presupuesto)
FROM departamentos);

-- 14.
SELECT D.Nombre, count(DNI)
FROM departamentos D JOIN empleados E ON (D.codigo = E.Departamento)
GROUP BY Departamento
HAVING COUNT(DNI) > 2;    -- 7

-- 15.
INSERT INTO departamentos  VALUES
(11, 'Calidad', 40000);   -- 6


-- 16.
UPDATE departamentos
SET presupuesto = presupuesto-(presupuesto*0.10);
SELECT * FROM departamentos;


-- 17.
UPDATE empleados SET Departamento = 14 WHERE Departamento = 77;

-- 18.
DELETE FROM empleados
where Departamento = 14;

-- 19.
DELETE FROM empleados
WHERE departamento IN (SELECT codigo  FROM departamentos WHERE Presupuesto >= 60000); -- 2


-- 20.

 SET SQL_SAFE_UPDATES = 0;
DELETE FROM empleados;   -- 1