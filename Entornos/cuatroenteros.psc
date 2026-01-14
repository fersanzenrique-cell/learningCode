Proceso cuatroenteros
	Definir a, b, c, d Como Entero;
	Repetir
		Leer a, b, c, d;
	Hasta Que a <> b O a <> c O a <> d O b <> c O b <> d
	Si a > b Entonces
		Si a > c Entonces
			Si a > d Entonces
				Escribir 'mayor es ', a;
			SiNo
				Escribir 'mayor es ', d;
			FinSi
		SiNo
			Si c > d Entonces
				Escribir 'mayor es ', c;
			SiNo
				Escribir 'mayor es ', d;
			FinSi
		FinSi
	SiNo
		Si b > c Entonces
			Si d > c Entonces
				Escribir 'mayor es ', d;
			SiNo
				Escribir 'mayor es ', c;
			FinSi
		SiNo
			Si b > d Entonces
				Escribir 'mayor es ', b;
			SiNo
				Escribir 'mayor es ', d;
			FinSi
		FinSi
	FinSi
	Si a < b Entonces
		Si a < c Entonces
			Si a < d Entonces
				Escribir 'menor es ', a;
			SiNo
				Escribir 'menor es ', d;
			FinSi
		SiNo
			Si c < d Entonces
				Escribir 'menor es ', c;
			SiNo
				Escribir 'menor es ', d;
			FinSi
		FinSi
	SiNo
		Si b < c Entonces
			Si c < d Entonces
				Escribir 'menor es ', c;
			SiNo
				Escribir 'menor es ', d;
			FinSi
		SiNo
			Si b < d Entonces
				Escribir 'menor es ', b;
			SiNo
				Escribir 'menor es ', d;
			FinSi
		FinSi
	FinSi
FinProceso
