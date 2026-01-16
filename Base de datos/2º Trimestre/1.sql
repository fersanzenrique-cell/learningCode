DECLARE 
	numero NUMBER:=&valor;
	
	nombre VARCHAR2(15):=&nombre; /* PONER COMILLAS SIMPLES*/
	
	dividendo NUMBER:= &dividendo;
	divisor NUMBER := &divisor;
	resultado NUMBER;

BEGIN
	IF numero = 5 THEN
		DBMS_OUTPUT.put_line('UN CINCO?¿?¿?');
	ELSIF numero = 67 THEN
		DBMS_OUTPUT.put_line('676767676');
	ELSE 
		DBMS_OUTPUT.put_line('vale');
	END IF;
	
	IF divisor = 0 THEN
		DBMS_OUTPUT.put_line('INFINITO!');
	ELSE 
		resultado:= dividendo/divisor;
		DBMS_OUTPUT.put_line('El resultado es: ' || resultado);
	END IF;
	
	DBMS_OUTPUT.put_line('------------');
	DBMS_OUTPUT.put_line('Tu nombre es.. ' || nombre);
	DBMS_OUTPUT.put_line('El valor es.. ' || numero);
	/*para imprimir*/
/* EXCEPTION */



END;
/

DECLARE

	dia NUMBER:=&dia;

BEGIN

	DMBS_OUTPUT.put_line('----------');
	IF dia=1 THEN
		DBMS_OUTPUT.put_line('LUNES');
	ELSIF dia=2 THEN
		DBMS_OUTPUT.put_line('MARTES');
	ELSE 
		DBMS_OUTPUT.put_line('NO ES LUNES NI MARTES');
	END IF;
	
END;
/

DECLARE

	dia NUMBER:=&dia;

BEGIN

	case dia
		WHEN 1 THEN DBMS_OUTPUT.put_line('LUNES');
		WHEN 2 THEN	DBMS_OUTPUT.put_line('MARTES');
		ELSE DBMS_OUTPUT.put_line('IRRECONOCIBLE');
	END CASE;
END;
/
