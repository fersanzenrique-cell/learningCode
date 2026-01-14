drop database ejerciciotablas1
create database ejerciciotablas1
use ejerciciotablas1

create table comercial (
	id int(10) primary key,
	nombre varchar(100),
	apellido1 varchar(100),
	apellido2 varchar(100),
	ciudad varchar(100),
	comisión float,
	foreign key (id) references pedido(id_comercial)
	);

create table pedido (
	id int(10) primary key,