drop database Estudios;
create database Estudios;
use Estudios;
create table CURSO(
	id int primary key,
	nombre varchar(15),
	familia varchar(20))Engine=InnoDB; --tabla que esta relacionado a otra tabla
	
create table ALUMNO(
	mat int primary key,
	nombre varchar(30) not null,
	curso int,
	foreign key Alumno(curso) references CURSO (id)
	on delete CASCADE on update cascade)Engine=InnoDB;
	--insert into alumno values (100, 'alumno1', 50); (no deja hacerlo,
	--Cannot add or update a child row: a foreign key constraint fails)

insert into curso values
(10,'SMR','Informatica'),
(20,'ASIR','Informatica'),
(30,'DAM','Informatica'),
(40,'DAW','Informatica'),
(50,'CI','Comercio'),
(60,'GA','Administracion');

insert into alumno values
(100,'alumno1',10),
(200,'alumno2',30),
(300,'alumno3',30),
(400,'alumno4',40),
(500,'alumno5',20),
(600,'alumno6',50),
(700,'alumno7',60),
(800,'alumno8',40),
(900,'alumno9',20),
(1000,'alumno10',50),
(1100,'alumno11',60);

	
