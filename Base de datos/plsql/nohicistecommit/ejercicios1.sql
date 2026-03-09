set SERVEROUTPUT on;
set LINESIZE 300 on; 

/* 1º. Hacer un bloque anónimo que incremente el salario el 10% a los empleados que
tengan una comisión superior al 5% del salario. (Tabla: emple) */

DECLARE
    CURSOR mostrarDatos IS
        select * from emple where comision > salario*0.05;
    v_reg emple%rowtype;
    v_salario emple.salario%type;
    CURSOR mostrarDatosTodos IS 
        select salario, apellido from emple;
BEGIN
    FOR fila in mostrarDatos LOOP
        dbms_output.put_line('El empleado cuyo salario cambiar es: ' || fila.apellido || ', con su salario de ' || fila.salario);
    END LOOP;
    update emple set salario = salario*1.10 where comision > salario*0.05;
    for fila in mostrarDatosTodos loop
        dbms_output.put_line('Empleado: ' || fila.apellido || ' Salario: ' || fila.salario);
    end loop;
END;
/    

/*
2º. Escribe un bloque anónimo que muestre el apellido y el salario del empleado sin
departamento asignado. Debe aparecer el mensaje:
“El empleado tiene un salario de Euros.”
NOTA: Si no hay ningún empleado sin departamento asignado, insertar un
registro que cumpla las condiciones para hacer el bloque anónimo.
*/

DECLARE
    CURSOR mostrarDatos IS 
        select apellido, salario from emple where deptno=10;
BEGIN 
    FOR fila in mostrarDatos LOOP
        dbms_output.put_line('El empleado ' || fila.apellido ||' tiene un salario de ' || fila.salario ||' Euros.');
    END LOOP;
END;
/

/*
3º. Crea un bloque anónimo que inserte un nuevo empleado en la tabla emple.
El código de empleado será el máximo código de empleado más 1, la fecha
de alta será la fecha del sistema, el salario será igual al máximo más 10.000
y la comisión igual a la máxima más 5.000. El resto de campos los puedes
completar como quieras. Comprueba luego el resultado
*/

DECLARE 
    v_codigo emple.empno%type;
    v_fecha emple.fechaalt%type;
    v_salario emple.salario%type;
    v_comision emple.comision%type;
begin
    select empno into v_codigo from (select empno from emple order by empno desc) where ROWNUM=1;
    v_codigo := v_codigo + 1;
    select sysdate into v_fecha from dual;
    select salario into v_salario from (select salario from emple order by salario desc) where ROWNUM=1;
    v_salario := v_salario + 10000;
    select comision into v_comision from (select comision from emple order by comision desc) where ROWNUM=1;
    v_comision := v_comision + 5000;
  insert into EMPLE (empno,apellido,oficio,dir,fechaalt,salario,comision,deptno)
  values(v_codigo, 'ASTERIX', 'SALESMAN', 7782, v_fecha, v_salario, v_comision,30);
end;
/
/*
Usando las tablas que se crearan al ejecutar el script 'Scritps tablas clientes,
productos, ventascp.sql' , realizar los siguientes ejercicios.

4º. Crea un bloque anónimo que muestre el precio del producto con código 7 (tabla
productos).
*/

DECLARE
    v_precio productos.precio_uni%type;
begin
    select precio_uni into v_precio from productos where cod_producto=7;
    dbms_output.put_line('El producto tiene el precio: ' || v_precio);
end;
/

/*
5º. Muestra por pantalla cuantos clientes realizaron una compra el día ‘22/09/1997’.
Debe aparecer el mensaje:
“ xxxxxxx clientes compraron el día ‘22/09/1997’ ”.
*/

DECLARE
    cursor mostrarDatos is 
        select fecha from ventascp where fecha='22/09/1997';
    v_contador integer := 0;
begin
    for fila in mostrarDatos loop
        v_contador := v_contador + 1;
    end loop;
    dbms_output.put_line(v_contador || ' clientes compraron el dia "22/09/1997"');
end;
/

/*
6º. Crea un bloque anónimo que muestre cuantos productos hay de la línea ‘PB’ y
sume el precio unitario de todos los productos de la línea ‘PB’.
“ Hay xxxxxxxxxx productos de la línea PB. El precio total es de xxxx €”
*/

DECLARE
    cursor mostrarDatos is 
        select precio_uni from productos where lineaproducto='PB';
    v_contador integer := 0;
    v_preciototal integer := 0;
begin
    for fila in mostrarDatos loop
        v_preciototal := v_preciototal + fila.precio_uni;
        v_contador := v_contador + 1;
    end loop;
    dbms_output.put_line('Hay ' || v_contador || ' productos de la línea PB. El precio total es de ' || v_preciototal || '€');
end;
/

/*
7º. Añade un nuevo campo a la tabla clientes llamado ZONA de tipo varchar2(10).
Crea un bloque anónimo que actualice la tabla clientes asignando zona CENTRO
los clientes cuyo domicilio sea Madrid y Norte al resto. Mostrar por pantalla
el importe total vendido a los clientes de la zona centro. Debe aparecer el mensaje:
“Se ha facturado un total de € a los clientes de la zona CENTRO.”
*/

DECLARE
    cursor updateZona is 
        select * from clientes;
    v_precioTotal integer := 0;
BEGIN
    for row in updateZona loop
        if row.domicilio='Madrid' then
            update clientes set zona=centro;
        else 
    end loop;
END;