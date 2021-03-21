
CREATE DATABASE IF NOT EXISTS `clientes`;
USE `clientes`;


DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `DNI` int DEFAULT NULL,
  `fecha` String NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `cliente` VALUES (100,'Jaume','Lopez','Calle del Sol',47478264,'2021-02-17');
INSERT INTO `cliente` VALUES (101,'Joan','Marsal','Avenida de Jaime I',47478263,'2020-12-20');
INSERT INTO `cliente` VALUES (102,'Jordi','Rubio','Avenida Cataluña',361279865,'2020-08-12');
INSERT INTO `cliente` VALUES (103,'Arnau','Aladid','Calle Mayor',98765432,'2019-11-04');
INSERT INTO `cliente` VALUES (104,'Daniel','Sopena','Calle Reus',654321987,'2019-04-23');
INSERT INTO `cliente` VALUES (105,'Luis','Martinez','Calle Sant Jordi',65432100,'2020-02-29');
INSERT INTO `cliente` VALUES (106,'Laia','Fernandez','Calle de Ramón Berenguer IV',26574512,'2018-11-10');



