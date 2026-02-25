CREATE TABLE Tabla_Articulos (
    codigo VARCHAR2(5) PRIMARY KEY,
    nombre VARCHAR2(20),
    precio NUMBER,
    IVA NUMBER);
	
INSERT INTO Tabla_Articulos VALUES ('A001','Articulo 1',15.50, 21);
INSERT INTO Tabla_Articulos VALUES ('A002','Articulo 2',22.00, 21);
INSERT INTO Tabla_Articulos VALUES ('A003','Articulo 3',10.50, 10);
INSERT INTO Tabla_Articulos VALUES ('A004','Articulo 4',5.75, 10);
INSERT INTO Tabla_Articulos VALUES ('A005','Articulo 5',30.00, 21);
INSERT INTO Tabla_Articulos VALUES ('A006','Articulo 6',18.20, 21);
INSERT INTO Tabla_Articulos VALUES ('A007','Articulo 7',12.80, 10);
INSERT INTO Tabla_Articulos VALUES ('A008','Articulo 8',50.00, 21);
INSERT INTO Tabla_Articulos VALUES ('A009','Articulo 9',7.90, 10);
INSERT INTO Tabla_Articulos VALUES ('A010','Articulo 10',17.40, 21);

	
CREATE TABLE Alumnos (
    numMatricula NUMBER PRIMARY KEY,
    nombre VARCHAR2(15),
    apellidos VARCHAR2(30),
    titulacion VARCHAR2(15),
    precioMatricula NUMBER);

CREATE TABLE AlumnosInf (
    IDMatricula NUMBER PRIMARY KEY,
    nombre_apellidos VARCHAR2(50),
    precio NUMBER);

INSERT INTO Alumnos VALUES (1,'Juan','Perez','Administrativo',1000);
INSERT INTO Alumnos VALUES (2,'Jose','Jimenez','Informatica',1200);
INSERT INTO Alumnos VALUES (3,'Maria','Gomez','Administrativo',1000);
INSERT INTO Alumnos VALUES (4,'Elena','Martinez','Informatica',1200);
INSERT INTO Alumnos VALUES (5,'Carlos','Gonzalez','Administrativo',1100);
INSERT INTO Alumnos VALUES (6,'Laura','Rodriguez','Informatica',1200);
INSERT INTO Alumnos VALUES (7,'Ana','Martin','Informatica',1250);
INSERT INTO Alumnos VALUES (8,'Pedro','Lopez','Administrativo',1150);
INSERT INTO Alumnos VALUES (9,'David','Rio','Informatica',1300);	

CREATE TABLE Tabla_Departamento (
    Num_Depart NUMBER(2) PRIMARY KEY,
    Nombre_Depart VARCHAR2(15),
    Ubicacion VARCHAR2(15),
    Presupuesto NUMBER(10,2),
    Media_Salarios NUMBER(10,2),
    Total_Salarios NUMBER(10,2));

CREATE TABLE Tabla_Empleado (
    Num_Empleado NUMBER(4) PRIMARY KEY,
    Nombre_Empleado VARCHAR2(25),
    Categoria VARCHAR2(10),
    Jefe NUMBER(4),
    Salario NUMBER(7,2),
    Comision NUMBER(7,2),
    Num_Depart NUMBER(2),
    FOREIGN KEY (Jefe) REFERENCES Tabla_Empleado,
    FOREIGN KEY (Num_Depart) REFERENCES Tabla_Departamento);

INSERT INTO Tabla_Departamento VALUES (1,'Ventas','Madrid',500000.00,25000.00,500000.00);
INSERT INTO Tabla_Departamento VALUES (2,'Marketing', 'Barcelona',400000.00,22000.00,440000.00);
INSERT INTO Tabla_Departamento VALUES (3,'Recursos Humanos','Valencia',300000.00,18000.00,360000.00);
INSERT INTO Tabla_Departamento VALUES (4,'TI', 'Sevilla',600000.00,28000.00,560000.00);
INSERT INTO Tabla_Departamento VALUES (5,'Administracion','Bilbao',350000.00,23000.00,460000.00);
INSERT INTO Tabla_Departamento VALUES (6,'Finanzas','Madrid',450000.00,24000.00,480000.00);
INSERT INTO Tabla_Departamento VALUES (7,'Logistica','Zaragoza',380000.00,21000.00,420000.00);
INSERT INTO Tabla_Departamento VALUES (8,'Produccion','Alicante',550000.00,26000.00,520000.00);
INSERT INTO Tabla_Departamento VALUES (9,'Compras','Castellon',420000.00,25000.00,450000.00);
INSERT INTO Tabla_Departamento VALUES (10,'Investigacion','Valencia',700000.00,30000.00,600000.00);

INSERT INTO Tabla_Empleado VALUES (1,'Juan Perez','Gerente',NULL,5000.00,500.00,1);
INSERT INTO Tabla_Empleado VALUES (2,'Ana Gomez','Comercial',1,2500.00, 250.00,1);
INSERT INTO Tabla_Empleado VALUES (3,'Luis Rodriguez','Comercial',1,2200.00,200.00,1);
INSERT INTO Tabla_Empleado VALUES (4,'Pedro Sanchez','Gerente',NULL,5500.00, 400.00,2);
INSERT INTO Tabla_Empleado VALUES (5,'Laura Martinez','Comercial',4,2400.00, 220.00,2);
INSERT INTO Tabla_Empleado VALUES (6,'Carlos Gomez','Comercial',4,2300.00,210.00,2);
INSERT INTO Tabla_Empleado VALUES (7,'Marta Lopez','Gerente',NULL,6000.00,450.00, 3);
INSERT INTO Tabla_Empleado VALUES (8,'Jose Perez','Comercial',7,2700.00,250.00,3);
INSERT INTO Tabla_Empleado VALUES (9,'Raquel Fernandez','Comercial',7,2300.00,220.00,3);
INSERT INTO Tabla_Empleado VALUES (10,'David Jimenez','Gerente',NULL,6500.00,500.00,4);

commit;