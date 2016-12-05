/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  sax
 * Created: 15/11/2016
 */
CREATE DATABASE acme_store;

USE acme_store;

CREATE TABLE productos (
  id_producto int(11) NOT NULL AUTO_INCREMENT,
  producto varchar(100) NOT NULL,
  existencias float NOT NULL,
  descripcion varchar(200) NOT NULL,
  precio_compra float NOT NULL,
  precio_venta float NOT NULL,
  PRIMARY KEY (id_producto)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE usuarios(
    user varchar(20) NOT NULL PRIMARY KEY,
    password varchar(32) NOT NULL
)



INSERT INTO productos(producto,existencias,descripcion,precio_compra,precio_venta) VALUES 
('Moto Maxx',10,'Motorola Moto Maxx',8500,10500),
('Pebble',100,'Pebble Red',1800,2000),
('Laptop Asus Mx34',5,'Laptop Asus i7 8GB Ram 1TB HHD',17000,21000);


INSERT INTO usuarios(user, password) VALUES ('admin',MD5('12345'));
INSERT INTO usuarios(user, password) VALUES ('vendedor',MD5('12345'));
