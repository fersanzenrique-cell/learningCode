drop database ejerciciotablas3;
create database ejerciciotablas3;
use ejerciciotablas3;

create table socios (
	id_socio int(2) primary key,
	nombre varchar(15),
	apellidos varchar(30),
	direccion varchar(30),
	ciudad varchar(15),
	cp varchar(5),
	telefono char(9),
	nif varchar(9),
	f_alta date
	);

create table peliculas (
	id_pelicula int(2) primary key,
	titulo varchar(30),
	p_compra decimal(4,2),
	p_alquiler decimal(2,1),
	maxdias int(2),
	descuento decimal(4,1),
	categoria int(2)
	);

create table categoria (
	id_categoria int(2) primary key,
	descripcion varchar(15)
	);

create table alquiler (
	id_alquiler int(2) primary key,
	f_salida date,
	f_devolucion date, 
	id_socio int(2),
	id_pelicula int(2)
	);
	
alter table peliculas add foreign key (categoria) references categoria(id_categoria);
alter table alquiler add foreign key (id_socio) references socios(id_socio);
alter table alquiler add foreign key (id_pelicula) references peliculas(id_pelicula);

INSERT INTO Socios VALUES
(1, 'Laura', 'Garcia Perez', 'Calle Sol 12', 'Madrid', '28001', '612345678', '12345678A', '2020/01/15'),
(2, 'Carlos', 'Martin Ruiz', 'Av. España 45', 'Barcelona', '08010', NULL, '87654321B', '2019/03/20'),
(3, 'Maria', 'Lopez Diaz', 'Calle Luna 5', 'Valencia', '46002', '622334455', '11223344C', '2021/06/10'),
(4, 'Javier', 'Santos Gil', 'Plaza Mayor 9', 'Sevilla', '41003', '699887766', '44332211D', '2022/02/14'),
(5, 'Lucia', 'Fernandez Soto', 'Ronda Norte 8', 'Bilbao', '48004', '655443322', '99887766E', '2021/09/25'),
(6, 'Sergio', 'Jimenez Vega', 'Av. Libertad 22', 'Granada', '18001', '633221100', '55443322F', '2020/12/01'),
(7, 'Elena', 'Castro Mora', 'Calle Real 30', 'Zaragoza', '50001', NULL, '66778899G', '2018/05/18'),
(8, 'Raul', 'Mendez Torres', 'Camino Verde 3', 'Malaga', '29002', '699112233', '33445566H', '2019/11/09'),
(9, 'Patricia', 'Dominguez Leon', 'Calle Olivo 17', 'Murcia', '30003', '622556677', '22114455I', '2022/07/01'),
(10, 'David', 'Ortega Navarro', 'Calle Nueva 6', 'Toledo', '45001', '633554433', '77889900J', '2023/01/11'),
(11, 'Andres', 'Garcia Gil', 'Calle Prado 10', 'Madrid', '28012', NULL, '99112233K', '2023/05/20'),
(12, 'Natalia', 'Lopez Martin', 'Av. Central 8', 'Valencia', '46010', '622334466', '88223344L', '2023/06/15'),
(13, 'Pablo', 'Fernandez Ruiz', 'Calle Mayor 25', 'Bilbao', '48001', '633445577', '77334455M', '2023/07/22'),
(14, 'Sofia', 'Mendez Perez', 'Ronda Este 4', 'Málaga', '29004', NULL, '66445566N', '2023/08/11'),
(15, 'Isabel', 'Castro Gomez', 'Calle Jardín 6', 'Zaragoza', '50008', '655667799', '55556677O', '2023/09/30');

INSERT INTO Categoria VALUES
(1,'Terror'),
(2,'Comedia'),
(3,'Drama'),
(4,'Ciencia Ficcion'),
(5,'Aventura'),
(6,'Musical'),
(7,'Oeste');

INSERT INTO Peliculas VALUES 
(1, 'El Rescate Final', 19.99, 2.5, 5, 0.0, 1),
(2, 'Rie que te Rie', 14.50, 2.0, 4, 10.0, 2),
(3, 'Lagrimas del Sol', 18.75, 2.5, 6, 5.0, 3),
(4, 'La Casa Oscura', 16.90, 3.0, 3, 0.0, 4),
(5, 'Galaxias Perdidas', 22.00, 3.5, 7, 15.0, 5),
(6, 'En Busca del Tesoro', 20.00, 2.5, 6, 5.0, 7),
(7, 'El Reino Animal', 12.99, 1.5, 4, 0.0, 5),
(8, 'Planeta Tierra', 25.00, 3.0, 7, 0.0, 6),
(9, 'Canta Conmigo', 17.50, 2.0, 4, 10.0, 4),
(10, 'Venganza Implacable', 21.50, 3.0, 5, 0.0, 1),       
(11, 'El Silencio del Alma', 18.25, 2.5, 6, 0.0, 3),      
(12, 'Noche en el Bosque', 16.40, 3.0, 3, 0.0, 4),        
(13, 'Cartas de Amor', 14.80, 2.0, 5, 0.0, 6),            
(14, 'El Mapa Dorado', 19.60, 2.5, 6, 5.0, 7),            
(15, 'Naturaleza Salvaje', 23.50, 3.0, 7, 0.0, 1),        
(16, 'Ritmo en el Corazon', 17.90, 2.0, 4, 5.0, 2),      
(17, 'Operacion Fuego', 20.00, 3.0, 5, 0.0, 1),           
(18, 'Dos y un Cafe', 14.30, 2.0, 4, 0.0, 2),             
(19, 'El Susurro', 15.90, 3.0, 3, 0.0, 4);                


INSERT INTO Alquiler VALUES 
(1, '2023/01/10', '2023/01/13', 1, 2),
(2, '2023/02/05', '2023/02/10', 3, 5),
(3, '2023/03/01', '2023/03/04', 2, 1),
(4, '2023/04/12', '2023/04/17', 5, 7),
(5, '2023/05/20', NULL, 4, 4),
(6, '2023/06/15', '2023/06/20', 6, 3),
(7, '2023/07/02', '2023/07/07', 8, 10),
(8, '2023/08/10', '2023/08/13', 9, 9),
(9, '2023/09/22', '2023/09/27', 7, 8),
(10, '2023/10/03', '2023/10/07', 10, 6),
(11, '2023/10/15', '2023/10/20', 2, 3),
(12, '2023/11/01', NULL, 1, 5),        
(13, '2023/11/03', NULL, 4, 9),       
(14, '2023/11/05', '2023/11/09', 3, 8),
(15, '2023/11/06', '2023/11/10', 6, 6),
(16, '2023/12/07', NULL, 9, 10),      
(17, '2023/12/08', '2023/11/12', 8, 7),
(18, '2023/12/09', NULL, 10, 4),      
(19, '2024/01/10', '2024/01/13', 5, 2),
(20, '2024/01/15', NULL, 7, 1),
(21, '2019/02/10', '2019/02/14', 2, 1),   
(22, '2019/05/03', '2019/05/07', 4, 2),   
(23, '2019/07/15', NULL, 7, 3),   
(24, '2019/10/22', '2019/10/27', 8, 4);


/* Ejercicios

	1. Mostrar todos los socios ordenados alfabéticamente por apellidos.
	
		select * from socios order by apellidos asc;
		
	2. Listar los títulos de todas las películas de la categoría "Comedia".
	
		select * from peliculas where categoria=2;
		
		select titulo from peliculas join categoria
			on id_categoria=categoria
			where descripcion='Comedia';
		
		select titulo from peliculas,categoria
			where id_categoria=categoria
			and descripcion='Comedia';
			
		select titulo from peliculas
			where categoria=(
				select id_categoria from categoria where descripcion='Comedia'
			);
		
	3. Obtener el nombre y ciudad de los socios que no tienen teléfono registrado.
	
		select nombre,ciudad from socios where telefono is null;
		
	4. Mostrar las películas que tienen un precio de compra superior a 22€.
	
		select * from peliculas where p_compra>22;
		
	5. Listar los alquileres realizados por el socio con nombre “Natalia”.
	
		select alquiler.* from socios s, alquiler a
			where s.id_socios=a.id_socio and nombre='Natalia';
			
		select a.* from socios s, alquiler a
			where s.id_socios=a.id_socio and nombre='Natalia';
		
	6. Mostrar las películas que aún no han sido devueltas.
	
		select titulo from peliculas p,alquiler a
			where p.id_pelicula=a.id_pelicula and f_devolucion is null;
	
	7. Obtener el número total de socios registrados.
	
		select count(telefono) as 'Telefonos Registrados' from socios s;
		
		select count(*) as 'Socios Registrados' from socios s;
	
	8. Mostrar las películas con descuento mayor que 0.1.
	
		select titulo,descuento from peliculas
			where descuento>0.1;
	
	9. Listar los socios de la ciudad de “Zaragoza”.
	
		select numbre,ciudad from socios
			where ciudad='Zaragoza';
	
	10. Mostrar la cantidad total de películas por categoría.
	
		select descripcion,count(*) from peliculas,categoria
			where categoria=id_categoria
			group by categoria
			having count(*)>=3;
		
	11. Obtener el número de alquileres realizados por cada socio.
	
		select s.id_socio,s.nombre, count(*) as 'Numero de peliclas alquileres'
			from socios s join alquiler al
			on s.id_socio=al.id_socio
			group by al.id_socio;
			
	12. Mostrar las películas cuyo precio de alquiler sea menor a 3€.
	
		select titulo from peliculas where p_alquiler<3;
		
	13. Listar los socios dados de alta en el año 2022.
	
		select nombre,apellidos from socios where year(f_alta)=2022;
	
	14. Obtener las películas alquiladas más de una vez.
	
		select titulo,count(*) as 'Pelicula alquilada mas de 1 vez'
			from peliculas p join alquiler al
			on p.id_pelicula=al.id_pelicula
			group by al.id_pelicula
			having count(*)>1;
	
	15. Mostrar el nombre del socio y la película que alquiló con la fecha de salida más reciente.
	
		select nombre, titulo from alquiler al join socios s
			on al.id_socio=s.id_socio
			join peliculas p 
			on p.id_pelicula=al.id_pelicula
			where f_salida=(select max(f_salida) from alquiler);
	
	16. Actualizar el teléfono del socio con NIF '77889900J' a '123456789'.
	
		update socios set telefono ='123456789' where NIF='77889900J';
	 
	16b. Actualizar el NIF del socio con NIF '77889900J' a '67899900J'.
	
		update socios set NIF='67899900J' where NIF='77889900J';
	
	17. Aumentar en 0.5€ el precio de alquiler de todas las películas de categoría 'Terror'.
	
		update peliculas set p_alquiler=p_alquiler+0.5;
			where categoria=(select id_categoria from categoria
				where descripcion='Terror');
	
		update peliculas p join categoria c 
			set p.categoria=c.id_categoria
			set p.p_alquiler=p.p_alquiler+0.5
			where c.descripcion='Terror';
			
	18. Aplicar un descuento del 0.2 a las películas con más de 5 días de alquiler máximo.
	
		update peliculas set p_alquiler=p_alquiler-0.2
			where maxdias>5;
	
	19. Cambiar la ciudad del socio 'Patricia Dominguez Leon' a 'Valencia'.
	
		update ciudad set ciudad ='Valencia'
			where nombre='Patricia' and apellidos='Dominguez Leon';
	
	20. Actualizar la fecha de devolución de los alquileres pendientes a la fecha actual.
	
		update alquiler set f_devolucion=curdate()
			where f_devolucion is null;
	
	21. Eliminar a los socios que no tienen teléfono.
	
		delete from socios where telefono is null;
		
		delete socios,alquiler
			from socios s join alquiler al
			on s.id_socio=al.id_socio
			where telefono is null;
			
		delete from alquiler
			where id_socio in (7,10,12,15);
		
		delete from alquiler
			where id_socio in (
			select id_socio from socios where telefono is null);
		
	22. Eliminar todas las películas con precio de compra inferior a 19€.
	
			delete from alquiler 
				where id_pelicula in(select id_pelicula from peliculas where p_compra<19);
			
			delete from peliculas where p_compra<19;
	
	23. Borrar los alquileres anteriores al año 2019.
	
		delete from alquiler where year(f_salida)<2019;
	
	24. Eliminar la categoría “Musical” y sus películas asociadas.
	
		delete from peliculas where id_categoria=(select id_categoria from categoria
			where descripcion='Musical');
			
		delete from peliculas
		where categoria=(select id_categoria from categoria
			where descripcion='Musical');
			
		delete peliculas from peliculas join categorias
			on categoria=id_categoria
			where descripcion='Oeste';
			
		delete from categoria where descripcion='Oeste';
		
	25. Eliminar los socios que viven en “Toledo”.
	
		delete from alquiler where id_socio in 
			(select id_socio from socio where ciudad='Toledo'); 
		
		delete from socios where ciudad='Toledo';
		
	26. Agregar un nuevo campo “Email” en la tabla Socios.
	
		alter table socios add column email varchar(20);
	
	27. Cambiar el tipo de dato de Teléfono para permitir 12 caracteres.
	
		alter table socios modify telefono char(12);
	
	28. Renombrar la tabla Alquiler a Alquileres.
	
		alter table alquiler rename Alquileres;
	
	29. Agregar una columna Stock a la tabla Películas con valor por defecto 10.
	
		alter table peliculas add column stock int(2) default 10;

*/
