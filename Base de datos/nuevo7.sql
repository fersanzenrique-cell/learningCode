drop database ejercicio2;
create database ejercicio2;
use ejercicio2;

create table fabricante (
	codigo int(10) primary key,
	nombre varchar(100)
	);
create table producto (
	codigo int(10) primary key,
	nombre varchar(100),
	precio double,
	codigo_fabricante int(10),
	foreign key (codigo_fabricante) references fabricante(codigo)
	);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portatil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portatil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

/*

	26. Devuelve un listado con los nombres de los fabricantes y el número de productos que tiene
	cada uno con un precio superior o igual a 220 €. No es necesario mostrar el nombre de los
	fabricantes que no tienen productos que cumplan la condición.

		select fabricante.nombre,count(*) as 'Total'
		from fabricante f join producto p
		on f.codigo=p.cod_fab
		where precio >=220
		group by f.codigo 
		order by total desc;

	27.Devuelve un listado con los nombres de los fabricantes y el número de productos que tiene
	cada uno con un precio superior o igual a 220 €. El listado debe mostrar el nombre de todos
	los fabricantes, es decir, si hay algún fabricante que no tiene productos con un precio
	superior o igual a 220€ deberá aparecer en el listado con un valor igual a 0 en el número de
	productos.

		select f.nombre,count(*) as 'Total'
		from fabricante f left join producto p
		on f.codigo=p.cod_fab
		where precio >=220
		group by f.nombre
		order by total desc;
		
		
	28.Devuelve un listado con los nombres de los fabricantes donde la suma del precio de todos
	sus productos es superior a 1000 €.
	
		
	
	29.Devuelve un listado con el nombre del producto más caro que tiene cada fabricante. El
	resultado debe tener tres columnas: nombre del producto, precio y nombre del fabricante. El
	resultado tiene que estar ordenado alfabéticamente de menor a mayor por el nombre del
	fabricante.
	
		
	
*/