/* 
      ☠️  BASE DE DATOS: APOCALIPSIS ZOMBI ☠️
   ---------------------------------------------
   Creador: Profesora del Fin del Mundo 🧟‍♀️
   Propósito: Practicar SQL... ¡si sobrevives!
   Fecha: 31-10-2025  🎃
*/


-- Base de datos: ApocalipsisZombi (script completo)
-- Creación de tablas y datos de ejemplo
-- NOTA: las fechas usan formato 'YYYY-MM-DD'

/* ----------------------------
   TABLAS
   ---------------------------- */
DROP DATABASE IF EXISTS ApocalipsisZombi;
CREATE DATABASE ApocalipsisZombi;
USE ApocalipsisZombi;
CREATE TABLE Refugios (
  id_refugio INT PRIMARY KEY,
  nombre VARCHAR(80),
  ubicacion VARCHAR(80),
  capacidad INT,
  fecha_creacion DATE
);

CREATE TABLE Supervivientes (
  id_superviviente INT PRIMARY KEY,
  nombre VARCHAR(50),
  edad INT,
  habilidad VARCHAR(50),
  -- refugio actual (puede ser NULL si está en tránsito)
  refugio_actual_id INT,
  fecha_registro DATE,
  FOREIGN KEY (refugio_actual_id) REFERENCES Refugios(id_refugio)
);

CREATE TABLE Zombis (
  id_zombi INT PRIMARY KEY,
  nombre VARCHAR(60),
  tipo VARCHAR(50),           -- e.j. "Corredor", "Lento", "Mutante"
  peligrosidad INT,           -- 1..5
  velocidad VARCHAR(20),      -- "Muy lento", "Medio", "Rápido"
  fecha_aparicion DATE,
  zona_origen VARCHAR(80)
);

CREATE TABLE Ataques (
  id_ataque INT PRIMARY KEY,
  id_zombi INT,
  id_refugio INT,
  fecha_ataque DATE,
  tipo_ataque VARCHAR(50),    -- "Asalto", "Explosión de vísceras", "Sigiloso", etc.
  exito BOOLEAN,              -- TRUE = el ataque fue efectivo (entraron), FALSE = repelido
  descripcion TEXT,
  FOREIGN KEY (id_zombi) REFERENCES Zombis(id_zombi),
  FOREIGN KEY (id_refugio) REFERENCES Refugios(id_refugio)
);

CREATE TABLE Suministros (
  id_suministro INT PRIMARY KEY,
  nombre VARCHAR(80),
  cantidad INT,
  unidad VARCHAR(20),
  refugio_id INT,
  fecha_reposicion DATE,
  FOREIGN KEY (refugio_id) REFERENCES Refugios(id_refugio)
);

-- Historial de quién se refugió dónde y cuándo (movimientos)
CREATE TABLE HistorialRefugio (
  id_historial INT PRIMARY KEY,
  id_superviviente INT,
  id_refugio INT,
  fecha_entrada DATE,
  fecha_salida DATE, -- puede ser NULL si todavía está
  motivo VARCHAR(100),
  FOREIGN KEY (id_superviviente) REFERENCES Supervivientes(id_superviviente),
  FOREIGN KEY (id_refugio) REFERENCES Refugios(id_refugio)
);

-- Opcional: asignaciones de suministros a supervivientes (quién cogió qué)
CREATE TABLE AsignacionSuministro (
  id_asignacion INT PRIMARY KEY,
  id_suministro INT,
  id_superviviente INT,
  fecha_asignacion DATE,
  cantidad INT,
  nota VARCHAR(100),
  FOREIGN KEY (id_suministro) REFERENCES Suministros(id_suministro),
  FOREIGN KEY (id_superviviente) REFERENCES Supervivientes(id_superviviente)
);

-- ----------------------------
-- INSERTS: Refugios
-- ----------------------------
INSERT INTO Refugios VALUES
(1, 'Bunker del Norte', 'Montañas', 25, '2023-10-01'),
(2, 'Supermercado Viejo', 'Ciudad', 12, '2023-09-15'),
(3, 'Base Subterránea', 'Bosque', 40, '2023-11-05');

INSERT INTO Refugios VALUES
(4, 'Estación del Metro', 'Suburbios', 18, '2023-08-12'),
(5, 'Fuerte Costero', 'Costa', 30, '2023-07-01');

-- ----------------------------
-- INSERTS: Supervivientes (con refugio_actual_id)
-- ----------------------------
INSERT INTO Supervivientes VALUES
(1, 'Lucía', 29, 'Médica', 1, '2024-01-10'),
(2, 'Raúl', 34, 'Francotirador', 2, '2024-02-21'),
(3, 'Sara', 19, 'Mecánica', 1, '2024-03-03'),
(4, 'Miguel', 42, 'Líder', 3, '2024-03-15'),
(5, 'Irene', 25, 'Exploradora', 2, '2024-04-01'),
(6, 'Tomás', 31, 'Cocinero', NULL, '2024-05-10'); -- en tránsito (sin refugio actual)
INSERT INTO Supervivientes VALUES
(7, 'Eva', 27, 'Ingeniera', 1, '2024-06-20'),
(8, 'Pablo', 38, 'Conductor', 4, '2024-06-25'),
(9, 'Noa', 22, 'Comunicaciones', 3, '2024-07-02'),
(10, 'Hugo', 45, 'Carpintero', 5, '2024-07-10'),
(11, 'Marta', 28, 'Bióloga', 3, '2024-07-18'),
(12, 'Sergio', 33, 'Electricista', 1, '2024-07-25'),
(13, 'Rocío', 21, 'Paramédica', 2, '2024-08-01'),
(14, 'Diego', 36, 'Mecánico', 3, '2024-08-09'),
(15, 'Ana', 30, 'Agrónoma', 5, '2024-08-16'),
(16, 'Luis', 26, 'Explorador', NULL, '2024-08-23'),
(17, 'Olga', 40, 'Cocinera', 1, '2024-09-02'),
(18, 'Felipe', 29, 'Guía', 4, '2024-09-10'),
(19, 'Bea', 24, 'Técnica radio', 2, '2024-09-20'),
(20, 'Javier', 35, 'Guardia', 5, '2024-09-28'),
(21, 'Mar', 23, 'Estudiante', 3, '2024-10-05'),
(22, 'Rubén', 32, 'Carpintero', 1, '2024-10-10'),
(23, 'Nuria', 41, 'Directora', 3, '2024-10-18'),
(24, 'Óscar', 39, 'Tirador', 2, '2024-10-24');

CREATE TABLE Victimas (
  id_victima INT PRIMARY KEY,
  id_ataque INT,
  id_zombi INT,
  id_superviviente INT,
  fecha_evento DATE,
  resultado VARCHAR(20),        -- 'Herido' | 'Mordido' | 'Fallecido' | 'Desaparecido'
  descripcion TEXT,
  FOREIGN KEY (id_ataque) REFERENCES Ataques(id_ataque),
  FOREIGN KEY (id_zombi) REFERENCES Zombis(id_zombi),
  FOREIGN KEY (id_superviviente) REFERENCES Supervivientes(id_superviviente)
);

-- ----------------------------
-- INSERTS: Zombis (con características y fecha)
-- ----------------------------
INSERT INTO Zombis VALUES
(1, 'Mordisquitos', 'Lento', 2, 'Muy lento', '2023-10-20', 'Ciudad'),
(2, 'Carrera', 'Corredor', 5, 'Rápido', '2024-01-12', 'Bosque'),
(3, 'Gruñón', 'Mutante', 4, 'Medio', '2024-02-01', 'Montañas'),
(4, 'Susurros', 'Sigiloso', 3, 'Lento', '2024-03-10', 'Ciudad'),
(5, 'Tripas', 'Explosivo', 5, 'Lento', '2024-04-25', 'Bosque'),
(6, 'Colmilludo', 'Corredor', 4, 'Rápido', '2024-06-08', 'Ciudad');

INSERT INTO Zombis VALUES
(7, 'Rasgado', 'Lento', 2, 'Muy lento', '2023-11-12', 'Puerto'),
(8, 'Malvado', 'Sigiloso', 3, 'Medio', '2024-01-28', 'Estación'),
(9, 'Rugidor', 'Mutante', 5, 'Medio', '2024-02-14', 'Bosque'),
(10, 'Colmilludo Jr', 'Corredor', 4, 'Rápido', '2024-02-28', 'Ciudad'),
(11, 'Hedor', 'Explosivo', 5, 'Lento', '2024-03-22', 'Basurero'),
(12, 'Ojo', 'Atrapador', 4, 'Medio', '2024-04-02', 'Alcantarillado'),
(13, 'Manotas', 'Lento', 2, 'Muy lento', '2024-04-18', 'Puerto'),
(14, 'Baba', 'Sigiloso', 3, 'Medio', '2024-05-05', 'Ciudad'),
(15, 'Fugitivo', 'Corredor', 4, 'Rápido', '2024-05-25', 'Autopista'),
(16, 'Marea', 'Corredor', 5, 'Rápido', '2024-06-30', 'Costa'),
(17, 'Cisne Roto', 'Mutante', 4, 'Medio', '2024-07-14', 'Lago'),
(18, 'Ululante', 'Sigiloso', 3, 'Lento', '2024-08-01', 'Bosque'),
(19, 'Bocado', 'Corredor', 5, 'Rápido', '2024-08-20', 'Ciudad'),
(20, 'Gusano', 'Atrapador', 3, 'Medio', '2024-09-09', 'Campos');



-- ----------------------------
-- INSERTS: Ataques (zombi -> refugio)
-- ----------------------------
INSERT INTO Ataques VALUES
(1, 1, 2, '2024-01-15', 'Asalto en masa', FALSE, 'Los supervivientes repelieron el intento con barricadas.'),
(2, 2, 3, '2024-02-20', 'Intercepción nocturna', TRUE, 'Corredores rompieron perímetro sur.'),
(3, 3, 1, '2024-03-05', 'Avalancha', FALSE, 'El mutante quedó atrapado en trampas.'),
(4, 5, 3, '2024-04-30', 'Explosión interna', TRUE, 'Objeto explosivo dentro del bosque hizo estallar a varios.'),
(5, 6, 2, '2024-06-20', 'Ataque relámpago', FALSE, 'Francotiradores eliminan a los colmilludos.');



INSERT INTO Ataques VALUES
(6, 4, 1, '2024-07-01', 'Emboscada', TRUE, 'Colmilludo y su grupo colaron por la torre este.'),
(7, 7, 5, '2024-07-05', 'Asalto lento', FALSE, 'Barricadas y portones evitaron entrada.'),
(8, 8, 4, '2024-07-12', 'Sigiloso en catacumbas', TRUE, 'Entraron por ventilación.'),
(9, 9, 3, '2024-07-20', 'Rugido y ruptura', TRUE, 'Mutante abrió la puerta principal.'),
(10, 10, 2, '2024-08-02', 'Carrera nocturna', FALSE, 'Patrulla detectó y rechazó.'),
(11, 11, 3, '2024-08-15', 'Explosión de vísceras', TRUE, 'Heridos graves tras explosión.'),
(12, 12, 1, '2024-08-21', 'Atrapar y arrastrar', FALSE, 'Trampas devolvieron al zombi a la trampa.'),
(13, 13, 5, '2024-09-01', 'Golpe en muelle', TRUE, 'Saqueo y pérdida de suministros.'),
(14, 14, 2, '2024-09-10', 'Sigiloso intento', FALSE, 'Guardias detectan ruidos y evacuan.'),
(15, 15, 4, '2024-09-20', 'Ataque relámpago', TRUE, 'Dejó varios daños en la estación.'),
(16, 16, 5, '2024-10-01', 'Oleada costera', TRUE, 'Marea juntó hordas y atacaron desde el mar.'),
(17, 17, 3, '2024-10-10', 'A empujones', FALSE, 'Poca coordinación zombi.'),
(18, 18, 1, '2024-10-18', 'Noche silenciosa', FALSE, 'Detectados y neutralizados.'),
(19, 19, 2, '2024-10-25', 'Ataque urbano', TRUE, 'Colapso de una barrera.'),
(20, 20, 4, '2024-11-05', 'Trampa subterránea', FALSE, 'Gusano atrapado en foso.'),
(21, 2, 5, '2024-11-20', 'Reconocimiento rápido', FALSE, 'Exploradora alertó a la base.'),
(22, 6, 2, '2024-12-01', 'Ronda de verano', TRUE, 'Colmilludos intentaron romper puerta.'),
(23, 5, 1, '2024-12-12', 'Explosión interior', TRUE, 'Explosivo improvisado lesionó a varios.'),
(24, 9, 5, '2025-01-08', 'Mutante rompe dique', TRUE, 'Entrada masiva por muelle.'),
(25, 14, 3, '2025-01-20', 'Sigiloso y lento', FALSE, 'Detectado por perros.'),
(26, 1, 4, '2025-02-02', 'Ataque grupal', FALSE, 'Los supervivientes ganaron con fuego dirigido.'),
(27, 15, 5, '2025-02-18', 'Carrera por carretera', TRUE, 'Vehículo incendiado y pérdidas.'),
(28, 16, 2, '2025-03-05', 'Oleada relámpago', TRUE, 'Inundaron la entrada principal.'),
(29, 19, 1, '2025-04-01', 'Ataque sorpresa', FALSE, 'Se detectó temprano.'),
(30, 12, 3, '2025-04-12', 'Red subterránea', TRUE, 'Infiltraron las galerías');
-- ----------------------------
-- INSERTS: Suministros por refugio
-- ----------------------------
INSERT INTO Suministros VALUES
(1, 'Agua embotellada', 200, 'litros', 1, '2024-06-01'),
(2, 'Conservas', 120, 'unidades', 2, '2024-05-20'),
(3, 'Munición 9mm', 500, 'cartuchos', 3, '2024-06-10'),
(4, 'Botiquín nivel 1', 10, 'kits', 1, '2024-04-15'),
(5, 'Placas metálicas', 30, 'unidades', 3, '2024-03-03');

INSERT INTO Suministros VALUES
(6, 'Gasolina', 400, 'litros', 5, '2024-06-25'),
(7, 'Cuchillos', 40, 'unidades', 2, '2024-07-10'),
(8, 'Linternas', 25, 'unidades', 4, '2024-07-18'),
(9, 'Paneles solares', 12, 'unidades', 3, '2024-08-05'),
(10, 'Mascarillas', 200, 'unidades', 1, '2024-08-22'),
(11, 'Toldos', 15, 'unidades', 5, '2024-09-14'),
(12, 'Combustible para generador', 150, 'litros', 3, '2024-09-30'),
(13, 'Antibióticos', 30, 'cajas', 1, '2024-10-05'),
(14, 'Cuerdas', 60, 'metros', 4, '2024-10-21'),
(15, 'Herramientas mixtas', 45, 'unidades', 3, '2024-11-10');


-- ----------------------------
-- INSERTS: Historial de refugio (movimientos)
-- ----------------------------
INSERT INTO HistorialRefugio VALUES
(1, 1, 1, '2024-01-10', NULL, 'Entrada inicial al Bunker del Norte'),
(2, 2, 2, '2024-02-21', NULL, 'Asignación al Supermercado Viejo'),
(3, 3, 1, '2024-03-03', NULL, 'Mecánica asignada al Bunker'),
(4, 4, 3, '2024-03-15', NULL, 'Líder en Base Subterránea'),
(5, 5, 2, '2024-04-01', NULL, 'Exploradora en Supermercado');

INSERT INTO HistorialRefugio VALUES
(6, 7, 1, '2024-06-20', NULL, 'Llegada con equipo de reparación'),
(7, 8, 4, '2024-06-25', NULL, 'Asignado a control de rutas'),
(8, 9, 3, '2024-07-02', NULL, 'Encargada de antenas'),
(9, 10, 5, '2024-07-10', NULL, 'Refuerzo al Fuerte Costero'),
(10, 11, 3, '2024-07-18', NULL, 'Laboratorio improvisado'),
(11, 12, 1, '2024-07-25', NULL, 'Electricidad y paneles'),
(12, 13, 2, '2024-08-01', NULL, 'Paramédica de guardia'),
(13, 14, 3, '2024-08-09', NULL, 'Taller principal'),
(14, 15, 5, '2024-08-16', NULL, 'Agricultura de subsistencia'),
(15, 16, NULL, '2024-08-23', NULL, 'En tránsito tras salida de reconocimiento'),
(16, 17, 1, '2024-09-02', NULL, 'Cocina central'),
(17, 18, 4, '2024-09-10', NULL, 'Guía costero'),
(18, 19, 2, '2024-09-20', NULL, 'Soporte comunicaciones'),
(19, 20, 5, '2024-09-28', NULL, 'Guardia nocturna'),
(20, 21, 3, '2024-10-05', NULL, 'Estudiante voluntaria'),
(21, 22, 1, '2024-10-10', NULL, 'Carpintería de reparación'),
(22, 23, 3, '2024-10-18', NULL, 'Coordinación general'),
(23, 24, 2, '2024-10-24', NULL, 'Tirador en el perímetro'),
(24, 2, 5, '2024-11-01', '2024-11-10', 'Salida temporal a puerto'),
(25, 4, 2, '2024-11-15', NULL, 'Cambio de sector'),
(26, 5, 1, '2024-12-05', NULL, 'Refuerzo por temporada fría'),
(27, 7, 4, '2025-01-03', '2025-02-01', 'Transferencia logística'),
(28, 9, 1, '2025-02-15', NULL, 'Mantenimiento de antenas'),
(29, 13, 3, '2025-03-12', NULL, 'Rotación médica'),
(30, 14, 2, '2025-04-07', NULL, 'Refuerzo de seguridad');


-- ----------------------------
-- INSERTS: Asignaciones de suministros
-- ----------------------------
INSERT INTO AsignacionSuministro VALUES
(1, 2, 2, '2024-05-22', 10, 'Ración para salida de reconocimiento'),
(2, 4, 1, '2024-06-05', 1, 'Botiquín para Lucía'),
(3, 3, 4, '2024-06-12', 50, 'Munición para patrulla nocturna');

INSERT INTO AsignacionSuministro VALUES
(4, 6, 10, '2024-07-12', 50, 'Gasolina para camión de evacuación'),
(5, 7, 13, '2024-07-20', 4, 'Cuchillos para patrulla'),
(6, 8, 8, '2024-07-25', 2, 'Linternas para guardia nocturna'),
(7, 9, 3, '2024-08-10', 1, 'Panel para antena extra'),
(8, 10, 1, '2024-08-25', 20, 'Mascarillas reparto semanal'),
(9, 11, 5, '2024-09-18', 3, 'Toldos para muelle'),
(10, 12, 3, '2024-10-02', 30, 'Combustible para generador central'),
(11, 13, 1, '2024-10-10', 2, 'Antibióticos urgentes'),
(12, 14, 4, '2024-10-25', 20, 'Cuerdas para maniobras'),
(13, 15, 3, '2024-11-15', 5, 'Herramientas para taller'),
(14, 1, 17, '2024-11-20', 5, 'Agua para cocina central'),
(15, 3, 4, '2024-12-02', 100, 'Munición para patrulla'),
(16, 2, 8, '2025-01-05', 6, 'Conservas para ruta'),
(17, 6, 20, '2025-02-02', 30, 'Gasolina para convoy'),
(18, 10, 22, '2025-02-10', 10, 'Mascarillas para carpintería'),
(19, 5, 14, '2025-03-01', 1, 'Botiquín para guardia'),
(20, 15, 9, '2025-04-15', 2, 'Herramientas para reparación');

INSERT INTO Victimas VALUES
(1, 2, 2, 4, '2024-02-20', 'Herido', 'Miguel resultó herido durante la infiltración del corredor.'),
(2, 4, 5, 11, '2024-04-30', 'Fallecido', 'Marta no sobrevivió a la explosión interna.'),
(3, 9, 9, 14, '2024-07-20', 'Herido', 'Diego fue alcanzado por el mutante Rugidor.'),
(4, 11, 11, 21, '2024-08-15', 'Mordido', 'Mar mordida por explosión de vísceras.'),
(5, 13, 13, 10, '2024-09-01', 'Desaparecido', 'Hugo desapareció en el muelle durante el saqueo.'),
(6, 16, 16, 20, '2024-10-01', 'Fallecido', 'Javier murió defendiendo el fuerte costero.'),
(7, 19, 19, 24, '2024-10-25', 'Herido', 'Óscar herido por derrumbe tras ataque urbano.'),
(8, 22, 6, 2, '2024-12-01', 'Herido', 'Raúl sufrió contusiones durante el intento de ruptura.'),
(9, 23, 5, 5, '2024-12-12', 'Desaparecido', 'Irene desapareció entre el humo del explosivo.'),
(10, 24, 9, 15, '2025-01-08', 'Fallecido', 'Ana fue alcanzada por el mutante en el muelle.'),
(11, 27, 15, 17, '2025-02-18', 'Herido', 'Olga sufrió quemaduras en el convoy.'),
(12, 28, 16, 8, '2025-03-05', 'Mordido', 'Pablo mordido durante la oleada relámpago.'),
(13, 30, 12, 9, '2025-04-12', 'Fallecido', 'Noa atrapada por el zombi Ojo en los túneles.');


/*

AYUDA A SALVAR EL MUNDO REALIZANDO LAS SIGUIENTES CONSULTAS:
1) Mostrar todos los refugios ordenados por capacidad (mayor a menor)

	select * from refugios order by capacidad desc;

2) Cual es el Superviviente más joven que actualmente están en el “Bunker
del Norte”.Devuelve una sola columna con su nombre – habilidad.

	select min(edad),nombre,habilidad from supervivientes
	where refugio_actual_id=1
	limit 1
	;
	

3) Zombis de peligrosidad >= 4 que aparecieron en Abril

	select * from zombis where peligrosidad >= 4;

4) Selecciona el nombre del zombie y el refugio donde ha sido llevado a cabo
ataques exitosos.

	select distinct nombre,id_refugio from zombis z join ataques a
	where z.id_zombi=a.id_zombi
	and exito=true;

5) Supervivientes sin refugio.

	select * from supervivientes where refugio_actual_id is null;

6) Muestra los últimos 5 ataques registrados.

	select * from ataques order by fecha_ataque desc limit 5;

7) Qué suministros hay en el “Supermercado Viejo” el resultado tiene que
devolverse en una sola columna de la siguiente forma:
	1) Agua embotellada - 200litros
	
	select * Suministros from suministros
	unpivot
	(
	value
	for col in (id_suministro,nombre,cantidad)
	) un;
	
	select concat(id_suministro,") ",nombre," ",cantidad) suministros from suministros;

8) Zombis que aparecieron entre el 2024-01-01 y 2024-06-30

	select * from zombis where fecha_aparicion between '2024-01-01' and '2024-06-30';

9) Qué suministros fueron asignados a "Lucía"

	select sum.nombre,super.nombre
	from suministros as sum 
	inner join 
	asignacionsuministro as asig
	on sum.id_suministro=asig.id_suministro
	inner join 
	supervivientes as super
	on asig.id_superviviente=super.id_superviviente
	where super.nombre like '%Luc%';
	
10) Suministros con unidad litros o unidades

	select * from suministros where unidad like '%litros%' or like '%unidades%'

11) Primeros 10 caracteres de la descripción del ataque

	select * from suministros where unidad like '%litros%' or unidad like '%unidades%';

12) Supervivientes cuyo nombre tiene menos de 5 letras

	select * from supervivientes where length(nombre)<5;

13) Devuelve el nombre y habilidad del superviviente junto con el
refugio donde está, pero sólo queremos los refugios con más de 15 personas
de capacidad.

	select super.nombre,super.habilidad,super.refugio_actual_id from supervivientes as super
    inner join historialrefugio as histo
    on super.id_superviviente=histo.id_superviviente
    inner join refugios
    on histo.id_refugio=refugios.id_refugio
    where capacidad > 15;

14) Qué zombies atacaron la estación de Metro. Se quieren saber su
nombre y su tipo y el tipo de ataque. Ponle nombres a las columnas y
ordénalos por la peligrosidad.

	select zomb.nombre as Nombre,zomb.tipo as Tipo,ataq.id_ataque as 'Tipo de ataque',zomb.peligrosidad as Peligrosidad
	from zombis as zomb 
	inner join 
	ataques as ataq
	on zomb.id_zombi=ataq.id_zombi
	order by zomb.peligrosidad;
	
15) Dime los suministros que había en los Refugios creados en los 6
últimos meses de 2023.

	select distinct sum.fecha_reposicion as 'Fecha de reposicion',sum.cantidad as 'Cantidad de suministros', ref.nombre as Refugio 
	from suministros as sum
	inner join
	refugios as ref
	on sum.refugio_id=ref.id_refugio
	where ref.fecha_creacion between '2023-06-01' and '2023-12-31';

16) Personas que recibieron comida con cantidades mayores de 10.

	select super.nombre as 'Nombre del superviviente', 
	asig.fecha_asignacion as 'Fecha de asignacion',
	asig.cantidad as 'Cantidad de suministros'
	from supervivientes as super
	inner join 
	AsignacionSuministro as asig
	on super.id_superviviente=asig.id_superviviente
	where asig.cantidad > 10;

17) A que refugios han atacado los zombies tipo lentos.

	select ref.nombre as 'Nombre del refugio atacado por zombies tipo lentos'
	from refugios as ref 
	inner join 
	ataques as atac
	on ref.id_refugio=atac.id_refugio 
	inner join 
	zombis as zomb
	on atac.id_zombi=zomb.id_zombi
	where zomb.tipo like '%lento%';

18) En que refugios ha estado el francotirador.
	
	select ref.nombre as 'Refugios en los que estuvo el francotirador',
	hist.fecha_entrada as 'Fecha de entrada',
	hist.fecha_salida as 'Fecha de salida'
	from refugios as ref
	inner join 
	HistorialRefugio as hist
	on ref.id_refugio=hist.id_refugio
	inner join
	supervivientes as super
	on hist.id_superviviente=super.id_superviviente
	where super.habilidad like '%francotirador%';
	
*/