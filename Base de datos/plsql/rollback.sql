DECLARE
 v_reg emple%ROWTYPE;
BEGIN 
    SELECT * INTO v_reg FROM EMPLE where empno=7369;
    IF v_reg.salario<1000 then
        update EMPLE set salario=1000 where empno=7369;
    ELSE
        DBMS_OUTPUT.PUT_LINE('AL EMPLEADO ' || v_reg.empno || ' NO LE CORRESPONDE.');
    END IF;
END;
/
/*
Leerlo literalmente
DECLARE
    definicion cursor;
    variables;
BEGIN
    Apertura curso;
    LOOP
        FETCH cursor INTO variables;
        EXIT WHEN cursor%NOTFOUND;
        sentencias;
    END LOOP;
    close cursor;
    sentencias;
END;
/
*/

DECLARE
    cursor mostrarDatos IS /*Un cursor es para mostrar lo que hemos elegido, una consulta*/
        SELECT * FROM EMPLE ORDER BY salario; /*Lo que quieres que muestre*/
    v_reg emple%ROWTYPE;
    cursor escribirDatos IS
        SELECT empno, salario FROM emple ORDER BY salario;
    v_salario emple.salario%TYPE;
    v_empno emple.empno%TYPE;
BEGIN
    OPEN mostrarDatos; 
    LOOP
        FETCH mostrarDatos INTO v_reg;
        EXIT WHEN mostrarDatos%NOTFOUND;
        DBMS_OUTPUT.put_line('El salario del empleado' ||v_reg.empno||' ES '|| v_salario;
    END LOOP;
    CLOSE mostrarDatos;
    DBMS_OUTPUT.put_line('SE HAN ACABADO LOS DATOS DEL PRIMER CURSOR.');
    OPEN escribirDatos;
    LOOP 
        FETCH escribirDatos INTO v_empno,v_salario;
        EXIT WHEN escribirDatos%NOTFOUND;
        DBMS_OUTPUT.put_line('El salario del empleado' ||v_EGmpno||' ES '|| v_empno);
    END LOOP;
    CLOSE EscribirDatos;
    DBMS_OUTPUT.put_line('SE HAN ACABADO LOS DATOS DEL SEGUNDO CURSOR.');

END;
/