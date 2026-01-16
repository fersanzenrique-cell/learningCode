Proceso piedrapapeltijera
	Definir p1, p2, winp1, winp2 Como Entero;
	winp1 <- 0;
	winp2 <- 0;
	Repetir
		Repetir
			Repetir
				Escribir 'Escoge piedra(1), papel(2) o tijera(3) jugador 1: ';
				Leer p1;
			Hasta Que p1>=1 Y p1<=3
			Repetir
				Escribir 'Escoge piedra(1), papel(2) o tijera(3) jugador 2: ';
				Leer p2;
			Hasta Que p2>=1 Y p2<=3
			Segun p1 Hacer
				1:
					Escribir '¡El jugador 1 ha escogido piedra!';
					Segun p2 Hacer
						1:
							Escribir '¡El jugador 2 ha escogido piedra!';
							Escribir '¡Empate!';
						2:
							Escribir '¡El jugador 2 ha escogido papel!';
							Escribir '¡El jugador 2 gana, el jugador 1 pierde!';
							winp2 <- winp2+1;
						3:
							Escribir '¡El jugador 2 ha escogido tijera!';
							Escribir '¡El jugador 1 gana, el jugador 2 pierde!';
							winp1 <- winp1+1;
					FinSegun
				2:
					Escribir '¡El jugador 1 ha escogido papel!';
					Segun p2 Hacer
						1:
							Escribir '¡El jugador 2 ha escogido piedra!';
							Escribir '¡El jugador 1 gana, el jugador 2 pierde!';
							winp1 <- winp1+1;
						2:
							Escribir '¡El jugador 2 ha escogido papel!';
							Escribir '¡Empate!';
						3:
							Escribir '¡El jugador 2 ha escogido tijera!';
							Escribir '¡El jugador 2 gana, el jugador 1 pierde!';
							winp2 <- winp2+1;
					FinSegun
				3:
					Escribir '¡El jugador 1 ha escogido tijera!';
					Segun p2 Hacer
						1:
							Escribir '¡El jugador 2 ha escogido piedra!';
							Escribir '¡El jugador 2 gana, el jugador 1 pierde!';
							winp2 <- winp2+1;
						2:
							Escribir '¡El jugador 2 ha escogido papel!';
							Escribir '¡El jugador 1 gana, el jugador 2 pierde!';
							winp1 <- winp1+1;
						3:
							Escribir '¡El jugador 2 ha escogido tijera!';
							Escribir '¡Empate!';
					FinSegun
			FinSegun
			Si p2=p1 Entonces
				Escribir 'Ingrese valores que no sean iguales.';
			FinSi
			Si winp1=2 Entonces
				Escribir '¡El jugador 1 gana la partida!';
			FinSi
			Si winp2=2 Entonces
				Escribir '¡El jugador 2 gana la partida!';
			FinSi
		Hasta Que p2<>p1
	Hasta Que winp1=2 O winp2=2
FinProceso
