Proceso cuatroenteros3
	Definir menor, mayor, num, i Como Entero;
	Repetir
		Escribir 'Introduzca cuatro números que no son iguales entre ellos.';
		Leer num;
		mayor <- num;
		menor <- num;
		Para i<-1 Hasta 3 Hacer
			Leer num;
			Si num>mayor Entonces
				mayor <- num;
			FinSi
			Si num<menor Entonces
				menor <- num;
			FinSi
		FinPara
	Hasta Que mayor<>menor
	Escribir 'El número mayor es ', mayor;
	Escribir 'El número menor es ', menor;
FinProceso