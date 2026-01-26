/* set serveroutput on */
/* set verify off */
/* Ejercicio 1*/

begin
    update emple
    set salario = salario * 1.01
    where comision > salario * 5 / 100;
end;
/

declare
    cursor mostrar is 
        select * from emple;
    cursor subida is
        select * from emple where comision > salario * 5 / 100;
    v_registro emple%rowtype;
begin
    open mostrar;
    loop
        fetch mostrar into v_registro;
        exit when mostrar%notfound;
        dbms_output.put_line(
            v_registro.empno || ' Salario inicial ' || 
            v_registro.salario
        );
    end loop
    close mostrar;
    open subida;
    loop
        fetch subida into v_registro;
        exit when subida%notfound;
        update emple set salario = salario * 1.01 where empno = v_registro.empno;
    end loop
    close subida;
    dbms_output.put_line('---------------------------------------------------------');
    open mostrar;
    loop
        fetch mostrar into v_registro;
        exit when mostrar%notfound;
        dbms_output.put_line(
            v_registro.empno || ' Salario inicial ' || 
            v_registro.salario
        );
    end loop
    close mostrar;
end;
/

/* Ejercicio 2 */

declare
    v_depart emple.deptno%type := &departamento;
    cursor datos is 
        select apellido,salario from emple where deptno = v_depart;
    v_apellido emple.apellido%type;
    v_salario emple.salario%type;
begin
    open datos;
    loop
        fetch datos into v_apellido,v_salario;
        exit when datos%notfound;
        dbms_output.put_line('Apellido ' || v_apellido || ' salario ' || v_salario);
    end loop
    close datos;
end;
/

/* Ejercicio 3 */

declare
    v_reg emple%rowtype;
    cursor mostrar is select * from emple;
begin
    open mostrar;
    loop
        fetch mostrar into v_reg;
        exit when mostrar%notfound;
        dbms_output.put_line(v_reg.empno || ' ' || v_reg.apellido || v_reg.oficio || ' ' || v_reg.dir || ' ' || v_reg.fechaalt || ' ' || v_reg.salario || ' ' || v_reg.comision || ' ' || v_reg.deptno);
    end loop;
    close mostrar;
    select max(empno) + 1 into v_reg.empno from emple;
    /* v_reg.empno := v_reg.empno + 1; */ 
    select sysdate into v_reg.fechaalt from dual;
    select max(salario) into v_reg.salario from emple;
    v_reg.salario := v_reg.salario + 10000;
    select max(comision) + 5000 into v_reg.comision from emple;
    insert into emple values(v_reg.empno, 'Apelllido1', 'oficio1', 7839,v_reg.fechaalt,v_reg.salario, v_reg.comision,20);

end;
/