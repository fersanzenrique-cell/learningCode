CREATE DATABASE Tienda;
use Tienda;
CREATE TABLE articulos(
	clave_articulo int(3) PRIMARY KEY,
	nombre varchar(30),
	precio int(5));
insert into articulos values
	(1,'Teclado',100),
	(2,'Disco duro 300gb',500),
	(3,'Mouse',80),
	(4,'Memoria USB',140),
	(5,'Memoria RAM',290),
	(6,'Disco duro extraíble 250gb',650),
	(7,'Memoria USB',450),
	(8,'DVD Rom',279),
	(9,'CD Rom',200),
	(10,'Tarjeta de red',180);