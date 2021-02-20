SELECT apellidos
FROM empleados;

SELECT DISTINCT apellidos
FROM empleados;

SELECT *
FROM empleados
WHERE Apellidos LIKE 'López';

SELECT *
FROM empleados
WHERE Apellidos IN ('López', 'Pérez');

SELECT *
FROM empleados
WHERE Departamento = 14;

SELECT *
FROM empleados
WHERE Departamento IN (37,77);

SELECT *
FROM empleados
WHERE Apellidos LIKE 'P%';

SELECT SUM(PRESUPUESTO) AS 'PRESUPUESTO'
FROM Departamentos;

SELECT COUNT(DNI) AS 'Número de empleados', Departamento
FROM empleados
GROUP BY Departamento;

SELECT *
FROM empleados JOIN departamentos ON (empleados.Departamento = departamentos.Código);

SELECT E.Nombre, E.Apellidos, D.Nombre, D.Presupuesto
FROM empleados E JOIN departamentos D ON (E.Departamento = D.Código);

SELECT E.Nombre, E.Apellidos, D.Presupuesto
FROM empleados E JOIN departamentos D ON (E.Departamento = D.Código)
WHERE D.Presupuesto > 60000;

SELECT *
FROM departamentos
WHERE Presupuesto >
(SELECT AVG(Presupuesto)
FROM departamentos);

SELECT D.Nombre, count(DNI)
FROM departamentos D JOIN empleados E ON (D.Código = E.Departamento)
GROUP BY Departamento
HAVING COUNT(DNI) > 2;

UPDATE departamentos SET Presupuesto = Presupuesto * 0.10;**

UPDATE empleados SET Departamento = 14 WHERE Departamento = 77;

DELETE FROM empleados
where Departamento = 14;

DELETE FROM empleados
WHERE Departamento LIKE
(SELECT Código 
FROM Departamento
WHERE Presupuesto >= 60000);**

DELETE FROM empleados;**