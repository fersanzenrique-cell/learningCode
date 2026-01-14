Proceso sumarpares
	Definir n Como Entero;
	Repetir
		Repetir
			Leer n;
		Hasta Que n>1
	Hasta Que n MOD 2=0
	n <- n/2;
	n <- n*(n+1);
	Escribir 'la suma de todos los pares del numero que has puesto es:', n;
FinProceso
