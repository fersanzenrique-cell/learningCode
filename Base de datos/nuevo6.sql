drop database ejercicio1;
create database ejercicio1;
use ejercicio1;
create table oficinas (
	oficina int primary key,
	ciudad varchar(20),
	region varchar(10));
	
create table departamentos (
	deptno int primary key,
	nombre varchar(20));
	
create table categorias (
	categoria varchar(1) primary key,
	titulo varchar(20),
	salario decimal(10,2),
	trienio decimal(10,2));
	
create table dptoficinas (
	codigo int primary key,
	oficina int,
	departamento int,
	telefono varchar(11),
	foreign key (oficina) references oficinas(oficina),
	foreign key (departamento) references departamentos(deptno)
	on delete set null on update set null);
	
create table empleados (
	num int primary key,
	nombre varchar(40),
	edad varchar(2),
	departamento int,
	categoria varchar(1),
	contrato date,
	foreign key (categoria) references categorias(categoria)
	on delete set null on update set null);

insert into oficinas values
(11,'Valencia','Este'),
(12,'Barcelona','Este'),
(13,'Alicante','Este'),
(21,'Madrid','Centro'),
(22,'Toledo','Centro');
insert into categorias values
(1,'Director',50000,1000),
(2,'Jefe Sección',40000,800),
(3,'Administrativo',35000,700),
(4,'Comercial',30000,700),
(5,'Empl. almacén',25000,500);
insert into departamentos values 
(1,'Dirección'),
(2,'Administración'),
(3,'Comercial'),
(4,'Almacén'),
(5,'Informática');
insert into dptoficinas values 
(102,11,2,'963.981.100'),
(103,11,3,'963.981.200'),
(104,11,4,'963.981.300'),
(101,11,1,'963.981.000'),
(105,11,5,'963.981.400'),
(106,12,1,'933.551.000'),
(107,12,2,'933.551.100'),
(108,12,3,'933.551.200'),
(109,13,1,'961.671.000'),
(110,13,2,'961.641.000'),
(111,21,1,'913.641.100'),
(112,21,2,'913.641.200'),
(113,22,3,'925.871.000');
insert into empleados values
(1000,'Antonio Gutierrez',46,101,1,'12-01-1989'),
(1001,'Paloma Blanco',56,102,2,'10-03-1982'),
(1002,'Antonio Pazos',50,102,2,'02-10-1984'),
(1003,'Ana Garcia',36,101,3,'24-11-1992'),
(1004,'Amparo Bellot',52,101,2,'15-06-1988'),
(1005,'Ignacio Gómez',39,105,4,'07-04-1994'),
(1006,'Enrique Soler',50,105,4,'16-06-1992'),
(1007,'Juan Jose Velez',47,104,4,'14-01-1995'),
(1008,'Isidro Perez',48,104,4,'10-02-1994'),
(1009,'Ignacio Lopez',53,101,2,'07-04-1984'),
(1010,'Vicente Salvador',50,103,3,'08-07-1995'),
(1011,'Carmen Hernandez',44,102,2,'16-07-1992'),
(1012,'Jose Fonseca',42,102,2,'14-03-1986'),
(1013,'Pedro Fernandez',38,102,2,'12-11-1993'),
(1014,'Silvia Ríos',33,102,3,'20-04-1994'),
(1015,'Jose Alegre',36,106,2,'28-03-1994'),
(1016,'Leticia Pastor',35,106,3,'18-11-1993'),
(1017,'Carina Gimenez',36,108,3,'30-01-1992'),
(1018,'Maria Gonzalez',40,108,2,'16-05-1991'),
(1019,'Manuel Torres',41,108,2,'15-11-1988'),
(1020,'Jesus Perez',45,108,2,'12-05-1987'),
(1021,'Alejandro Mataix',32,110,4,'17-03-1993'),
(1022,'Veronica Morales',30,110,4,'05-07-1995'),
(1023,'Elena Lopez',29,112,4,'03-11-1996'),
(1024,'Isabel Fernandez',40,112,3,'04-04-1985'),
(1025,'Jose Muñoz',49,103,3,'06-03-1981'),
(1026,'Pedro Rubiales',47,103,3,'09-12-1982'),
(1027,'Jose Carlos',53,107,2,'14-07-1984'),
(1028,'Esther Castro',27,111,1,'18-01-1997'),
(1029,'Ignacio Mora',29,111,1,'12-01-1996'),
(1030,'Jose Mejia',24,104,4,'23-04-1998'),
(1031,'Rosa Villar',37,104,4,'14-11-1987'),
(1032,'Marina Gilabert',31,104,3,'02-11-1994');
