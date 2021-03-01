
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