Proceso cuatroenteros2
	Definir a, b, c, d, mayor, menor Como Entero;
	Repetir
		Leer a, b, c, d;
	Hasta Que a <> b O a <> c O a <> d O b <> c O b <> d
	mayor = a;
	menor = a;
	SI b > mayor Entonces
		mayor = b;
	FinSi
	SI c > mayor Entonces
		mayor = d;
	FinSi
	SI d > mayor Entonces
		mayor = d;
	FinSi
	SI b < menor Entonces
		menor = b;
	FinSi
	SI c < menor Entonces
		menor = c;
	FinSi
	SI d < menor Entonces
		menor = d;
	FinSi
	Escribir "el mayor es ", mayor;
	Escribir "el menor es ", menor;
FinProceso
