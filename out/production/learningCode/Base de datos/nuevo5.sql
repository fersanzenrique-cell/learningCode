drop database DatosCoche;
create database DatosCoche;
use DatosCoche;
create table propietarios (
	dni varchar(10) PRIMARY KEY,
	nombre varchar(40),
	edad int);
create table coches (
	matricula varchar(10),
	marca varchar(20),
	precio int,
	dni varchar(10),
	primary key (matricula,dni),
	foreign key (dni) references propietarios(dni)
	on delete cascade on update cascade);
insert into propietarios values
('1A','Pepe',30),
('1B','Ana',40),
('1C','Maria',50);
insert into coches values
('MA-1111','Opel',1000,'1A'),
('MA-2222','Renault',2000,'1A'),
('BA-3333', 'Seat', 3000,'1B');
-- si intentas añadir otro coche, te saldrá error 
-- porque puede que no exista el DNI
-- ej, ('CA-444','Fiat',5667,'2F'),
-- si existe el dni entonces si
-- ej, ('CA-444','Fiat',5667,'1B'),
--select * from propietarios p,coches c where p.dni=c.dni
--select * from propietarios where dni='1A';
--delete from propietarios where dni like '1G';