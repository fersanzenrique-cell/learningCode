create table Equipos(
	CodEq varchar2(7) primary key,
    Nombre varchar2(15),
	Localidad varchar2(20));

create table Partidos(
	CodPar varchar2(6) primary key,
	EquipoL varchar2(7),
	EquipoV varchar2(7),
	Fecha date,
	Jornada varchar2(10), 
	GolL number(2),
	GolV number(2),
	FOREIGN KEY (EquipoL) REFERENCES Equipos(CodEq),
	FOREIGN KEY (EquipoV) REFERENCES Equipos(CodEq));

create table Clasificacion(
        CodEq  varchar2(7) primary key,
        PJ     number(2),
        PG     number(2),
        PE     number(2),
        PP     number(2),
        GF     number(2),
        GC     number(2),
        Puntos number(3));
	
insert into Equipos values('ALC','Alcorcon','Alcorcon');
insert into Equipos values('MOS','Mostoles','Mostoles');
insert into Equipos values('PAR','Parla','Parla');
insert into Equipos values('FUE','Fuenlabrada','Fuenlabrada');
insert into Equipos values('PIN','Pinto','Pinto');
insert into Equipos values('GET','Getafe','Getafe');
insert into Equipos values('LEG','Leganes','Leganes');
INSERT INTO Equipos VALUES('ARG','Arganda','Arganda del Rey');
INSERT INTO Equipos VALUES('RIV','Rivas','Rivas-Vaciamadrid');
INSERT INTO Equipos VALUES('COS','Coslada','Coslada');

insert into Partidos values ('P001','COS','ALC','06-09-2025','Jornada 1', 2, 1);
insert into Partidos values ('P002','RIV','MOS','06-09-2025','Jornada 1', 1, 2);
insert into Partidos values ('P003','ARG','PAR','06-09-2025','Jornada 1', 0, 3);
insert into Partidos values ('P004','LEG','FUE','06-09-2025','Jornada 1', 1, 1);
insert into Partidos values ('P005','GET','PIN','06-09-2025','Jornada 1', 2, 0);
insert into Partidos values ('P006','ALC','RIV','13-09-2025','Jornada 2', 1, 1);
insert into Partidos values ('P007','ARG','COS','13-09-2025','Jornada 2', 2, 0);
insert into Partidos values ('P008','MOS','LEG','13-09-2025','Jornada 2', 3, 1);
insert into Partidos values ('P009','PAR','GET','13-09-2025','Jornada 2', 1, 2);
insert into Partidos values ('P010','PIN','FUE','13-09-2025','Jornada 2', 0, 1);
insert into Partidos values ('P011','ALC','ARG','20-09-2025','Jornada 3', 2, 3);
insert into Partidos values ('P012','LEG','RIV','20-09-2025','Jornada 3', 1, 0);
insert into Partidos values ('P013','GET','COS','20-09-2025','Jornada 3', 2, 1);
insert into Partidos values ('P014','PIN','MOS','20-09-2025','Jornada 3', 1, 1);
insert into Partidos values ('P015','FUE','PAR','20-09-2025','Jornada 3', 3, 2);
insert into Partidos values ('P016','LEG','ALC','27-09-2025','Jornada 4', 2, 0);
insert into Partidos values ('P017','GET','ARG','27-09-2025','Jornada 4', 1, 1);
insert into Partidos values ('P018','RIV','PIN','27-09-2025','Jornada 4', 0, 3);
insert into Partidos values ('P019','FUE','COS','27-09-2025','Jornada 4', 1, 2);
insert into Partidos values ('P020','PAR','MOS','27-09-2025','Jornada 4', 3, 1);
insert into Partidos values ('P021','ALC','GET','04-10-2025','Jornada 5', 0, 2);
insert into Partidos values ('P022','PIN','LEG','04-10-2025','Jornada 5', 1, 0);
insert into Partidos values ('P023','FUE','ARG','04-10-2025','Jornada 5', 2, 1);
insert into Partidos values ('P024','PAR','RIV','04-10-2025','Jornada 5', 2, 1);
insert into Partidos values ('P025','MOS','COS','04-10-2025','Jornada 5', 1, 3);
insert into Partidos values ('P026','PIN','ALC','11-10-2025','Jornada 6', 3, 1);
insert into Partidos values ('P027','FUE','GET','11-10-2025','Jornada 6', 2, 1);
insert into Partidos values ('P028','PAR','LEG','11-10-2025','Jornada 6', 1, 2);
insert into Partidos values ('P029','MOS','ARG','11-10-2025','Jornada 6', 0, 2);
insert into Partidos values ('P030','COS','RIV','11-10-2025','Jornada 6', 2, 1);
insert into Partidos values ('P031','ALC','FUE','18-10-2025','Jornada 7', 1, 2);
insert into Partidos values ('P032','PAR','PIN','18-10-2025','Jornada 7', 2, 1);
insert into Partidos values ('P033','MOS','GET','18-10-2025','Jornada 7', 3, 0);
insert into Partidos values ('P034','COS','LEG','18-10-2025','Jornada 7', 0, 1);
insert into Partidos values ('P035','RIV','ARG','18-10-2025','Jornada 7', 1, 1);
insert into Partidos values ('P036','ALC','PAR','25-10-2025','Jornada 8', 2, 0);
insert into Partidos values ('P037','MOS','FUE','25-10-2025','Jornada 8', 1, 1);
insert into Partidos values ('P038','COS','PIN','25-10-2025','Jornada 8', 2, 1);
insert into Partidos values ('P039','RIV','GET','25-10-2025','Jornada 8', 0, 3);
insert into Partidos values ('P040','ARG','LEG','25-10-2025','Jornada 8', 1, 2);
insert into Partidos values ('P041','MOS','ALC','01-11-2025','Jornada 9', 1, 0);
insert into Partidos values ('P042','COS','PAR','01-11-2025','Jornada 9', 2, 1);
insert into Partidos values ('P043','RIV','FUE','01-11-2025','Jornada 9', 2, 0);
insert into Partidos values ('P044','ARG','PIN','01-11-2025','Jornada 9', 1, 1);
insert into Partidos values ('P045','LEG','GET','01-11-2025','Jornada 9', 1, 2);
insert into Partidos values ('P046','ALC','COS','29-11-2025','Jornada 10', 1, 2);
insert into Partidos values ('P047','MOS','RIV','29-11-2025','Jornada 10', 0, 3);
insert into Partidos values ('P048','PAR','ARG','29-11-2025','Jornada 10', 3, 1);
insert into Partidos values ('P049','FUE','LEG','29-11-2025','Jornada 10', 2, 1);
insert into Partidos values ('P050','PIN','GET','29-11-2025','Jornada 10', 1, 2);
insert into Partidos values ('P051','RIV','ALC','06-12-2025','Jornada 11', 1, 1);
insert into Partidos values ('P052','COS','ARG','06-12-2025','Jornada 11', 0, 2);
insert into Partidos values ('P053','LEG','MOS','06-12-2025','Jornada 11', 1, 3);
insert into Partidos values ('P054','GET','PAR','06-12-2025','Jornada 11', 1, 0);
insert into Partidos values ('P055','FUE','PIN','06-12-2025','Jornada 11', 2, 1);
insert into Partidos values ('P056','ARG','ALC','13-12-2025','Jornada 12', 2, 1);
insert into Partidos values ('P057','RIV','LEG','13-12-2025','Jornada 12', 1, 1);
insert into Partidos values ('P058','COS','GET','13-12-2025','Jornada 12', 2, 0);
insert into Partidos values ('P059','MOS','PIN','13-12-2025','Jornada 12', 3, 2);
insert into Partidos values ('P060','PAR','FUE','13-12-2025','Jornada 12', 1, 2);
insert into Partidos values ('P061','ALC','LEG','20-12-2025','Jornada 13', 1, 3);
insert into Partidos values ('P062','ARG','GET','20-12-2025','Jornada 13', 0, 2);
insert into Partidos values ('P063','PIN','RIV','20-12-2025','Jornada 13', 1, 1);
insert into Partidos values ('P064','COS','FUE','20-12-2025','Jornada 13', 1, 0);
insert into Partidos values ('P065','MOS','PAR','20-12-2025','Jornada 13', 2, 1);
insert into Partidos values ('P066','GET','ALC','27-12-2025','Jornada 14', 2, 1);
insert into Partidos values ('P067','LEG','PIN','27-12-2025','Jornada 14', 1, 0);
insert into Partidos values ('P068','ARG','FUE','27-12-2025','Jornada 14', 2, 1);
insert into Partidos values ('P069','RIV','PAR','27-12-2025','Jornada 14', 1, 2);
insert into Partidos values ('P070','COS','MOS','27-12-2025','Jornada 14', 0, 2);
insert into Partidos values ('P071','ALC','PIN','03-01-2026','Jornada 15', 3, 1);
insert into Partidos values ('P072','GET','FUE','03-01-2026','Jornada 15', 2, 1);
insert into Partidos values ('P073','LEG','PAR','03-01-2026','Jornada 15', 1, 2);
insert into Partidos values ('P074','ARG','MOS','03-01-2026','Jornada 15', 0, 1);
insert into Partidos values ('P075','RIV','COS','03-01-2026','Jornada 15', 1, 3);
insert into Partidos values ('P076','FUE','ALC','10-01-2026','Jornada 16', 3, 0);
insert into Partidos values ('P077','PIN','PAR','10-01-2026','Jornada 16', 0, 2);
insert into Partidos values ('P078','GET','MOS','10-01-2026','Jornada 16', 1, 1);
insert into Partidos values ('P079','LEG','COS','10-01-2026','Jornada 16', 2, 0);
insert into Partidos values ('P080','ARG','RIV','10-01-2026','Jornada 16', 1, 1);
insert into Partidos values ('P081','PAR','ALC','17-01-2026','Jornada 17', 2, 1);
insert into Partidos values ('P082','FUE','MOS','17-01-2026','Jornada 17', 1, 0);
insert into Partidos values ('P083','PIN','COS','17-01-2026','Jornada 17', 1, 1);
insert into Partidos values ('P084','GET','RIV','17-01-2026','Jornada 17', 2, 0);
insert into Partidos values ('P085','LEG','ARG','17-01-2026','Jornada 17', 0, 3);
insert into Partidos values ('P086','ALC','MOS','24-01-2026','Jornada 18', 1, 2);
insert into Partidos values ('P087','PAR','COS','24-01-2026','Jornada 18', 1, 1);
insert into Partidos values ('P088','FUE','RIV','24-01-2026','Jornada 18', 2, 1);
insert into Partidos values ('P089','PIN','ARG','24-01-2026','Jornada 18', 1, 2);
insert into Partidos values ('P090','GET','LEG','24-01-2026','Jornada 18', 3, 1);

insert into Clasificacion values('ALC',0,0,0,0,0,0,0);
insert into Clasificacion values('MOS',0,0,0,0,0,0,0);
insert into Clasificacion values('PAR',0,0,0,0,0,0,0);
insert into Clasificacion values('FUE',0,0,0,0,0,0,0);
insert into Clasificacion values('PIN',0,0,0,0,0,0,0);
insert into Clasificacion values('GET',0,0,0,0,0,0,0);
insert into Clasificacion values('LEG',0,0,0,0,0,0,0);
insert into Clasificacion values('RIV',0,0,0,0,0,0,0);
insert into Clasificacion values('COS',0,0,0,0,0,0,0);
