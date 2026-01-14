CREATE OR REPLACE DATABASE SANIDAD;
USE SANIDAD;

CREATE TABLE especialidades (
    id_especialidad INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT
);

CREATE TABLE medicos (
    id_medico INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    correo VARCHAR(100),
    id_especialidad INT,
    FOREIGN KEY (id_especialidad) REFERENCES especialidades(id_especialidad)
);

CREATE TABLE pacientes (
    id_paciente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    fecha_nacimiento DATE,
    telefono VARCHAR(20),
    correo VARCHAR(100)
);

CREATE TABLE citas (
    id_cita INT AUTO_INCREMENT PRIMARY KEY,
    id_medico INT NOT NULL,
    id_paciente INT NOT NULL,
    fecha_cita DATETIME NOT NULL,
    motivo VARCHAR(255),
    estado ENUM('Pendiente', 'Completada', 'Cancelada') DEFAULT 'Pendiente',
    FOREIGN KEY (id_medico) REFERENCES medicos(id_medico),
    FOREIGN KEY (id_paciente) REFERENCES pacientes(id_paciente)
);

INSERT INTO especialidades (nombre, descripcion) VALUES 
('Cardiologia', 'Trata enfermedades del corazon'),
('Pediatria', 'Atencion medica infantil'),
('Dermatologia', 'Trata problemas de la piel'),
('Neurologia', 'Trata trastornos del sistema nervioso'),
('Oftalmologia', 'Cuida la salud visual'),
('Traumatologia', 'Atiende lesiones oseas y musculares'),
('Ginecologia', 'Salud del sistema reproductor femenino'),
('Psiquiatria', 'Trata trastornos mentales y emocionales'),
('Endocrinologia', 'Trata trastornos hormonales y del metabolismo'),
('Oncologia', 'Diagnostico y tratamiento del cancer'),
('Reumatologia', 'Trata enfermedades articulares y autoinmunes'),
('Nefrologia', 'Trata enfermedades renales'),
('Otorrinolaringologia', 'Trata problemas de oido, nariz y garganta'),
('Medicina Interna', 'Diagnostico y tratamiento integral de enfermedades en adultos'),
('Digestivo', 'Diagnostico, tratamiento y prevencion de las enfermedades del aparato digestivo'),
('Urologia', 'Trata enfermedades del sistema urinario y del aparato reproductor masculino');

INSERT INTO medicos (nombre, apellido, telefono, correo, id_especialidad) VALUES
('Laura', 'Gomez', '555-1234', 'lgomez@hospital.com', 1),
('Carlos', 'Perez', '555-5678', 'cperez@hospital.com', 2),
('Maria', 'Torres', '555-1111', 'mtorres@hospital.com', 4),
('Jorge', 'Ramirez', '555-2222', 'jramirez@hospital.com', 5),
('Sofia', 'Castillo', '555-3333', 'scastillo@hospital.com', 6),
('Andres', 'Fernandez', '555-4444', 'afernandez@hospital.com', 7),
('Paula', 'Diaz', '555-5555', 'pdiaz@hospital.com', 8),
('Natalia', 'Cruz', '555-6667', 'ncruz@hospital.com', 9),
('Hector', 'Morales', '555-7778', 'hmorales@hospital.com', 10),
('Veronica', 'Salas', '555-8889', 'vsalas@hospital.com', 11),
('Tomas', 'Gil', '555-9990', 'tgil@hospital.com', 12),
('Carmen', 'Rojas', '555-1212', 'crojas@hospital.com', 13),
('Miguel', 'Herrera', '555-1010', 'mherrera@hospital.com', 3),  
('Isabel', 'Marin', '555-2020', 'imarin@hospital.com', 1),       
('Raul', 'Cortes', '555-3030', 'rcortes@hospital.com', 8),       
('Elena', 'Blanco', '555-4040', 'eblanco@hospital.com', 9),      
('Daniel', 'Vargas', '555-5050', 'dvargas@hospital.com', 10);    

INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, telefono, correo) VALUES
('Ana', 'Lopez', '2001-04-15', '555-8765', 'alopez@mail.com'),
('Luis', 'Martinez', '2020-09-20', '555-3456', 'lmartinez@mail.com'),
('Marcos', 'Gutierrez', '1978-03-11', '555-6666', 'mgutierrez@mail.com'),
('Elena', 'Suarez', '1995-07-23', '555-7777', 'esuarez@mail.com'),
('Fernando', 'Vega', '2001-02-05', '555-8888', 'fvega@mail.com'),
('Patricia', 'Navarro', '1989-10-19', '555-9999', 'pnavarro@mail.com'),
('Ricardo', 'Luna', '1975-12-02', '555-0000', 'rluna@mail.com'),
('Javier', 'Mendoza', '1992-01-10', '555-1122', 'jmendoza@mail.com'),
('Lucia', 'Ortiz', '2000-05-30', '555-2233', 'lortiz@mail.com'),
('Camila', 'Santos', '1983-08-25', '555-3344', 'csantos@mail.com'),
('Diego', 'Hernandez', '1976-11-12', '555-4455', 'dhernandez@mail.com'),
('Rosa', 'Blanco', '1999-03-08', '555-5566', 'rblanco@mail.com');

INSERT INTO citas (id_medico, id_paciente, fecha_cita, motivo, estado) VALUES
(9, 6, '2025-11-28 09:30:00', 'Control oncologico','Pendiente'),
(5, 3, '2025-11-17 14:00:00', 'Dolor en rodilla', 'Completada'),
(15, 12, '2025-12-06 09:00:00', 'Seguimiento por ansiedad', 'Completada'),
(3, 12, '2025-11-25 10:00:00', 'Revision dermatologica', 'Pendiente'),
(13, 9, '2025-12-02 11:30:00', 'Irritacion en la piel', 'Completada'),
(6, 8, '2025-11-18 09:30:00', 'Chequeo ginecologico','Pendiente'),
(10, 12, '2025-11-22 12:00:00', 'Dolor articular', 'Pendiente'),
(14, 5, '2025-12-03 10:00:00', 'Chequeo cardiologico', 'Pendiente'),
(11, 1, '2025-11-29 16:00:00', 'Chequeo renal avanzado', 'Completada'),
(8, 10, '2025-11-20 09:00:00', 'Control endocrino', 'Pendiente'),
(4, 6, '2025-11-16 11:30:00', 'Revision de vista', 'Pendiente'),
(1, 5, '2025-11-10 10:00:00', 'Chequeo general','Pendiente'),
(17, 3, '2025-12-08 14:30:00', 'Consulta oncologica de seguimiento', 'Pendiente'),
(11, 9, '2025-11-23 15:00:00', 'Chequeo renal', 'Completada'),
(7, 4, '2025-11-19 13:00:00', 'Consulta por ansiedad', 'Pendiente'),
(16, 12, '2025-12-07 11:00:00', 'Control de tiroides', 'Pendiente'),
(3, 1, '2025-11-15 09:00:00', 'Consulta por ansiedad', 'Cancelada'),
(14, 1, '2025-12-04 15:00:00', 'Dolor en el pecho', 'Pendiente'),
(2, 2, '2025-11-12 15:30:00', 'Control pediatrico', 'Completada'),
(5, 8, '2025-11-26 11:30:00', 'Dolor muscular', 'Pendiente'),
(9, 7, '2025-11-21 10:30:00', 'Revision post tratamiento', 'Completada'),
(13, 4, '2025-12-01 09:00:00', 'Consulta por acne', 'Pendiente'),
(15, 10, '2025-12-05 13:30:00', 'Evaluacion psicologica', 'Pendiente'),
(12, 11, '2025-11-24 16:30:00', 'Dolor de garganta persistente', 'Cancelada');

/* Creación de vista */

create or replace view med_especialidades as
select
medicos.nombre as Nombre,
especialidades.nombre as Especializacion
from medicos 
inner join especialidades
on medicos.id_especialidad=especialidades.id_especialidad;

/*
	1. Mostrar todos los médicos
	
		select * from medicos;
	
	2. Mostrar los nombres y correos de los pacientes ordenados alfabéticamente
	
		select nombre,correo from pacientes
		order by correo asc; 
	
	3. Listar las especialidades médicas disponibles
	
		select * from especialidades;
	
	4. Mostrar las citas pendientes
	
		select * from citas
		where estado like 'Pendiente';
	
	5. Mostrar las citas completadas o canceladas
	
		select * from citas
		where estado like '%ompletada%' or '%ancelada%';
		
		select * from citas 
		where estado not like 'Pendiente';
	
	6. Mostrar los médicos junto con el nombre de su especialidad
	
		select medicos.nombre,especialidades.nombre from medicos 
		inner join especialidades
		on medicos.id_especialidad=especialidades.id_especialidad;
	
	7. Listar las citas con el nombre del médico y paciente
	
		select id_medico,id_paciente from citas;
	
	!! 8. Contar cuántos médicos hay por especialidad
	
			
		select count(distinct m.id_medico),e.nombre
		from medicos as m
		inner join
		especialidades as e
		on m.id_especialidad=e.id_especialidad
		group by e.nombre;
	
	9. Contar cuántas citas tiene cada médico
	
		select count(distinct c.id_cita), m.nombre
		from citas as c
		natural join
		medicos as m
		group by m.nombre;
	
	10. Mostrar los pacientes que tienen más de una cita
	
		select count(c.id_cita), p.nombre
		from pacientes as p
		natural join
		citas as c
		group by nombre
		having count(c.id_cita)>1;
	
	11. Mostrar las próximas 8 citas (más cercanas)
	
		select fecha_cita,id_cita
		from citas
		order by fecha_cita desc
		limit 8;
	
	12. ️Mostrar los médicos cuyo correo contiene "hospital.com"
	
		select nombre, correo
		from medicos
		where correo like '%hospital.com%';
	
	13. Mostrar las especialidades que no tienen médicos asignados
	
		select e.nombre, m.id_medico
		from medicos as m
		right join
		especialidades as e
		on m.id_especialidad=e.id_especialidad
		where id_medico is null;
	
	14. Ver la edad de cada paciente (calculada a partir de su fecha de nacimiento)
	
		select nombre, fecha_nacimiento,
		timestampdiff(
			year,fecha_nacimiento,now())
		from pacientes;
	
	15. Mostrar todas las citas de un médico específico (por ejemplo, "Laura Gómez")
	16. Cambiar el estado de una cita a 'Completada'
	17. Insertar una nueva cita
	18. Eliminar una cita cancelada
	19. Mostrar el número total de pacientes registrados
	20. Ver la lista de médicos y el número de pacientes distintos que han atendido
	21. Mostrar los médicos que tienen al menos una cita pendiente
	22. Mostrar los pacientes que no tienen ninguna cita registrada
	23. Obtener el nombre del médico con más citas en total
	24. Mostrar las citas programadas para la próxima semana
	25. Calcular el promedio de citas por médico
	26. Mostrar los pacientes atendidos por un médico específico usando su correo
	27. ️ Mostrar el número de citas por estado (Pendiente, Completada, Cancelada)
	28. Mostrar las citas en las que el paciente y el médico tienen el mismo apellido
	29.Mostrar los médicos que no tienen ninguna cita asignada
	30.Listar pacientes y el número total de citas que tienen por estado
	31.Listar médicos junto con su número de citas pendientes y completadas
	32.Mostrar pacientes que han tenido citas con más de un médico
	33.Listar las especialidades con el número total de citas asociadas
	34. Mostrar los pacientes con citas programadas para hoy
*/
