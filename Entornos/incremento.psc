Proceso incremento
	Definir sueldo, increment Como Real;
	Definir categoria como Entero;
	Repetir
		Escribir "Escribe tu sueldo, tiene que ser mayor que 0.";
		leer sueldo;
	Hasta Que sueldo>0
	Repetir
		Escribir "Escribe tu categoria a la que ascendiste(1-4): ";
		leer categoria;
		Segun categoria Hacer
			1:
				increment=1.15;
				sueldo=sueldo*increment;
			2:
				increment=1.10;
				sueldo=sueldo*increment;
			3:
				increment=1.08;
				sueldo=sueldo*increment;
			4:
				increment=1.07;
				sueldo=sueldo*increment;
			De Otro Modo:
				Escribir "Categoría no válida";
		FinSegun
	Hasta Que categoria <> 0 y categoria <5;
	Escribir "Tu nuevo saldo es: ", sueldo;
FinProceso