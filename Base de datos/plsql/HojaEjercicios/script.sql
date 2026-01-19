DROP TABLE clientes CASCADE CONSTRAINTS;


CREATE TABLE clientes(
	nif		VARCHAR2(10) NOT NULL,
	nombre	VARCHAR2(15) NOT NULL,
	domicilio	VARCHAR2(15),
     	PRIMARY KEY (nif));


DROP TABLE productos CASCADE CONSTRAINTS;


CREATE TABLE productos(
	codproducto	NUMBER(4) 	   NOT NULL,
	descripcion	VARCHAR2(15)     NOT NULL,
	lineaproducto	VARCHAR2(6) 	   NOT NULL,
 	preciouni	        NUMBER(6) 	   NOT NULL,
	stock		NUMBER(5)	   NOT NULL,	
      	PRIMARY KEY (cod_producto),
        CONSTRAINT ck_precio CHECK (precio_uni > 0));	


DROP TABLE ventascp CASCADE CONSTRAINTS;


CREATE TABLE ventascp(
        nif		        VARCHAR2(10) NOT NULL,
	codproducto	NUMBER(4)	NOT NULL,
	fecha		DATE		NOT NULL,
	unidades	        NUMBER(3)	DEFAULT 1 NOT NULL,
    	PRIMARY KEY (nif, cod_producto, fecha),
    	FOREIGN KEY (nif) REFERENCES Clientes(nif) ON DELETE CASCADE,
   	FOREIGN KEY (cod_producto) REFERENCES Productos(cod_producto)
	ON DELETE CASCADE,
        CONSTRAINT ck_unidades CHECK (unidades > 0));
	
	
insert into Clientes values('111A', 'ANDRES', 'POZUELO' ); 
insert into Clientes values('222B', 'JAIME', 'ARAVACA'); 
insert into Clientes values('333C', 'TERESA', 'LAS ROZAS'); 
insert into Clientes values('444D', 'VICENTE', 'MADRID');
insert into Clientes values('555E', 'SANDRA', 'MADRID');
insert into Clientes values('666F', 'ALBERTO', 'POZUELO');
insert into Clientes values('777G', 'MIGUEL', 'POZUELO');
insert into Clientes values('888H', 'MARINA','ARAVACA');	
	

insert into Productos values(1, 'PROCESADOR P133', 'PROCES', 15000, 0);
insert into Productos values(2, 'PLACA BASE VX', 'PB', 10000, 0);
insert into Productos values(3, 'SIMM EDO 16MB', 'MEM', 7000, 0);
insert into Productos values(4, 'DISCO SCSI 4MB', 'DISCOS', 40000, 0);  
insert into Productos values(5, 'PROCESADOR K6', 'PROCES', 20000, 0);
insert into Productos values(6, 'DISCO IDE 2.5MB', 'DISCOS', 25000, 0);
insert into Productos values(7, 'PROCESADOR MMX', 'PROCES', 20000, 0);
insert into Productos values(8, 'PLACA BASE ATLA', 'PB', 50000, 0);
insert into Productos values(9, 'DIMM SDRAM 32MB', 'MEM', 22000, 0);


insert into Ventascp values('333C', 2, '22/09/1997', 2);
insert into Ventascp values('888H', 4, '22/09/1997', 1);
insert into Ventascp values('555E', 6, '23/09/1997', 3);
insert into Ventascp values('222B', 5, '26/09/1997', 5);
insert into Ventascp values('111A', 9, '28/09/1997', 3);
insert into Ventascp values('222B', 4, '28/09/1997', 1);
insert into Ventascp values('444D', 6, '02/10/1997', 2);
insert into Ventascp values('555E', 6, '02/10/1997', 1);
insert into Ventascp values('888H', 2, '04/10/1997', 4);
insert into Ventascp values('333C', 9, '04/10/1997', 4);
insert into Ventascp values('222B', 6, '05/10/1997', 2);
insert into Ventascp values('666F', 7, '07/10/1997', 1);
insert into Ventascp values('555E', 4, '10/10/1997', 3);
insert into Ventascp values('222B', 4, '16/10/1997', 2);
insert into Ventascp values('111A', 3, '18/10/1997', 3);
insert into Ventascp values('222B', 4, '18/10/1997', 5);
insert into Ventascp values('444D', 6, '22/10/1997', 2);
insert into Ventascp values('555E', 6, '02/11/1997', 2);
insert into Ventascp values('888H', 2, '04/11/1997', 3);
insert into Ventascp values('333C', 9, '04/12/1997', 3);
insert into Ventascp values('222B', 2, '05/12/1997', 2);

COMMIT;