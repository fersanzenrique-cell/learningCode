SET ServerOutput ON;
SET VERIFY OFF;
/*
1º. Hacer un bloque anónimo que incremente el salario el 10% a los empleados que
 tengan una comisión superior al 5% del salario. (Tabla:emple)
*/

DECLARE
    CURSOR mostrarDatos IS
        SELECT * FROM emple WHERE emple.comision > emple.salario*0.05;
    v_reg emple%ROWTYPE;
    CURSOR cambiarDatos IS
        SELECT emple.salario, emple.empno FROM emple WHERE emple.comision > emple.salario*0.05;
    v_salario emple.SALARIO%TYPE;
    v_empno emple.EMPNO%TYPE;
    
BEGIN
    OPEN mostrarDatos;
    LOOP 
        FETCH mostrarDatos INTO v_reg;
        EXIT WHEN mostrarDatos%NOTFOUND;
        DBMS_OUTPUT.put_line('Datos de empleado a cambiar ' || v_reg.empno || ' con su salario de ' || v_reg.salario);
    END LOOP;
    CLOSE mostrarDatos;
    OPEN cambiarDatos;
    LOOP
        FETCH cambiarDatos into v_salario,v_empno;
        EXIT WHEN cambiarDatos%NOTFOUND;
        UPDATE v_salario
END;
/

