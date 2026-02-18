/* set serveroutput on */
/* set verify off */
DECLARE
	numero Number := &numero;
BEGIN
	LOOP
		EXIT WHEN numero > 10;
		DBMS_OUTPUT.PUT_LINE('El valor es '|| numero);
		numero := numero + 1;
	END LOOP;
END;
/

DECLARE
	numero Number :=&numero;
BEGIN
	WHILE numero < 10 LOOP
		DBMS_OUTPUT.PUT_LINE('VALOR '|| numero);
		numero := numero + 1;
	END LOOP;
	DBMS_OUTPUT.PUT_LINE(numero);
END;
/

DECLARE
	i Number;
BEGIN
	FOR i IN REVERSE 1..10 LOOP
		DBMS_OUTPUT.PUT_LINE('VALOR '||i);
	END LOOP;
	DBMS_OUTPUT.PUT_LINE(i);
END;
/

DECLARE
	i Number;
	j Number;
BEGIN
	FOR i IN 1..10 LOOP
		FOR j IN 1..10 LOOP
		DBMS_OUTPUT.PUT_LINE(i || '*' || j || '=' || i*j);
		END LOOP;
	END LOOP;
END;
/