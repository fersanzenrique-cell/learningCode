/*
1º. Hacer un procedimiento que muestre el nombre y el salario del empleado cuyo código es
 7782
*/

create or replace procedure mostrarEmple(in_codigo in empl.empno%type) is
    v_apellido empl.apellido%type;
    v_salario empl.salario%type;
BEGIN 
    select apellido,salario into v_apellido, v_salario from empl where empno=in_codigo;
    DBMS_OUTPUT.put_line(v_apellido || ' ' || v_salario);
EXCEPTION
    when no_data_found then
        DBMS_OUTPUT.put_line('well shit');
    when OTHERS then 
        DBMS_OUTPUT.PUT_LINE('well well shit shit');
END mostrarEmple;
/

DECLARE
    teclado_codigo empl.empno%type := &numero;
BEGIN
    mostrarEmple(teclado_codigo);
END;
/

/*
2º. Crear un procedimiento que cuente el número de filas que hay en la tabla EMP, deposita
 el resu
*/

create or replace procedure contarRows is 
    v_numeroRows integer;
    BEGIN 
        select count(*) into v_numeroRows from empl;
        DBMS_OUTPUT.put_line('Numero de filas: ' || v_numeroRows);
    END contarRows;
/

BEGIN
    contarRows;
END;
/

/*
3º. Escribir un procedimiento que modifique la ubicación de un departamento, de la tabla Dept.
 El procedimiento recibirá como parámetros el número del departamento y la nueva ubicación.
*/

create or replace procedure modificarUbicacion(
    in_deptno in dept.deptno%type, in_loc in dept.loc%type) is
    BEGIN
        update dept set loc=in_loc where deptno=in_deptno;
    END modificarUbicacion;
/

DECLARE
    tec_deptno dept.deptno%type := &deptno;
    tec_loc dept.loc%type := '&localizacion';
BEGIN
    modificarUbicacion(tec_deptno,tec_loc);
END;
/

select * from dept;

/*
4º. Crear un procedimiento para insertar un nuevo empleado en la tabla Empl. Los parámetros
del procedimiento son los valores de los atributos del empleado, excepto el número de
empleado que será el último que de la tabla +10.
*/

create or replace procedure insertarEmpleado(
    a in empl.apellido%type, p in empl.puesto%type,
    d in empl.dir%type, f in empl.F_ALTA%type, s in empl.salario%type,
    c in empl.comision%type, dept in empl.deptno%type 
) is 
    v_empno empl.EMPNO%TYPE;
    BEGIN
        select max(empno) into v_empno from empl;
        insert into empl values (v_empno+10,a,p,d,f,s,c,dept);
    END;
/

DECLARE
    v_APELLIDO empl.apellido%type := '&apellido';
    v_PUESTO empl.puesto%type := '&puesto';
    v_DIR empl.dir%type := &direccion;
    v_fecha empl.F_ALTA%type := '&fecha';
    v_salario empl.salario%type := &salario;
    v_comision empl.comision%type := &comision;
    v_deptno empl.DEPTNO%TYPE := &deptno;
BEGIN
    insertarEmpleado(v_APELLIDO, v_PUESTO, v_DIR, v_fecha, v_salario, v_comision, v_deptno);
END;
/

select max(empno) from empl;
select * from empl;

