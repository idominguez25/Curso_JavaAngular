
CREATE DATABASE IF NOT EXISTS `cliente_video`;
USE `cliente_video`;


DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `DNI` int DEFAULT NULL,
  `fecha` String NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `clientes` VALUES (100,'Jaume','Lopez','Calle del Sol',47478264,'2021-02-17');
INSERT INTO `clientes` VALUES (101,'Joan','Marsal','Avenida de Jaime I',47478263,'2020-12-20');
INSERT INTO `clientes` VALUES (102,'Jordi','Rubio','Avenida Cataluña',361279865,'2020-08-12');
INSERT INTO `clientes` VALUES (103,'Arnau','Aladid','Calle Mayor',98765432,'2019-11-04');
INSERT INTO `clientes` VALUES (104,'Daniel','Sopena','Calle Reus',654321987,'2019-04-23');
INSERT INTO `clientes` VALUES (105,'Luis','Martinez','Calle Sant Jordi',65432100,'2020-02-29');
INSERT INTO `clientes` VALUES (106,'Laia','Fernandez','Calle de Ramón Berenguer IV',26574512,'2018-11-10');

DROP TABLE IF EXISTS `videos`;
CREATE TABLE `videos` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`titulo` varchar(30) DEFAULT NULL,
	`director` varchar(30) DEFAULT NULL,
	`id_cliente` int(11) DEFAULT NULL,
	)

