DROP DATABASE IF EXISTS bd_cientificos;
CREATE DATABASE bd_cientificos;
USE bd_cientificos;

CREATE TABLE cientificos(
	DNI VARCHAR(8),
    nomApels NVARCHAR(255),
    PRIMARY KEY (DNI)
);

CREATE TABLE proyecto(
    id CHAR(4),
    nombre NVARCHAR(255),
    horas INT,
    PRIMARY KEY (id)
);

CREATE TABLE asignado_a(
	cientifico VARCHAR(8),
    proyecto CHAR(4),
    PRIMARY KEY (cientifico, proyecto),
    FOREIGN KEY (cientifico) REFERENCES cientificos (DNI)
    ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (proyecto) REFERENCES proyecto (id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO cientificos VALUES
('12345670', 'Juan José Gonzalez'),
('45362415', 'Enric Carpio'),
('87965820', 'June Orozco'),
('46225178', 'Nerea Iglesias'),
('45648012', 'Maria Concepcion Muriel'),
('74189245', 'Marti García'),
('48663415', 'Driss Calderon'),
('48776011', 'Cintia Pinilla'),
('47878965', 'Carlos Antonio Jimenez'),
('44852148', 'Anselmo Andrade');

INSERT INTO proyecto VALUES
('0001', 'Proyecto A', 50),
('0002', 'Proyecto A beta', 70),
('0003', 'Proyecto B', 55),
('0004', 'Proyecto C', 46),
('0005', 'Proyecto D', 48),
('0006', 'Proyecto E', 36),
('0007', 'Proyecto F', 87),
('0008', 'Proyecto G', 23),
('0009', 'Proyecto H', 53),
('0010', 'Proyecto I', 68);