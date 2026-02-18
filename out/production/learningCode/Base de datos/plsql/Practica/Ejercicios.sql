/* set serveroutput on */
/* set verify off */
/* set linesize 300 */


/* 
1º. Hacer un bloque anónimo que incremente el salario el 10% a los empleados que
tengan una comisión superior al 5% del salario. (Tabla: emple).
*/

declare
    cursor mostrar is 
        select apellido Apellido, salario Salario from emple where comision > salario + salario * 0.05;
    cursor subida is
        select apellido Apellido, salario Salario from emple where comision > salario + salario * 0.05;
    v_reg Emple%rowtype;
begin
    dbms_output.put_line('Empleados a subir de salario:');
    open mostrar;
    loop
        exit when mostrar%notfound;
        fetch mostrar into v_reg;
        dbms.dbms_output.put_line('             -> ' || v_reg.apellido ', ' || v_reg.salario);
    end loop;
    close mostrar;
    open subida;
    loop
        exit when subida%notfound;
        fetch subida into v_reg;
        update emple set salario = salario * 1.01;
    end loop;
    close subida;
    dbms_output.put_line('Salario actual:');
    open mostrar;
    loop
        exit when mostrar%notfound;
        fetch mostrar into v_reg;
        dbms.dbms_output.put_line('             -> ' || v_reg.apellido ', ' || v_reg.salario);
    end loop;
    close mostrar;
end;
/




declare
    v_reg emple%rowtype;
    
begin
    select * into v_reg from emple where salario = 1600; /*Solo puede cojer un empleado claro esta*/
    dbms_output.put_line(v_reg.apellido || ' Ricachon ' || v_reg.salario);


end;
/

declare
    cursor mirarEmple is
        select apellido Apellido, salario Salario from emple where salario > 1600;
    v_reg mirarEmple%rowtype;
begin
    open mirarEmple;
    loop
        exit when mirarEmple%notfound;
        fetch mirarEmple into v_reg;
        dbms_output.put_line(v_reg.apellido || ' Ricachon ' || v_reg.salario);
    end loop;
    close mirarEmple;
end;
/