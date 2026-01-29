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

/* Ejercicio 4 */

declare
    precio productos.precio%rowtype;
begin
    select precio_uni into precio from productos where cod_producto = 7;
    dbms_output.put_line('El producto 7 vale' || precio);
end;
/

declare
    precio productos.precio%rowtype;
begin
    select precio_uni into precio from productos where cod_producto = 7;
    dbms_output.put_line('El producto 7 vale' || precio);
    exception
      when %no_data_found then
        bsms_output.put_line('El producto no existe');
end;
/




/* Ejercicio 5 */

declare
    v_cant Number(3);
begin
    select count(*) into v_cant from ventascp where fecha='22/09/1997';
    dbms_output.put_line(v_cant || ' clientes compraron el dia 22/09/1997.');
    exception
      when %no_data_found then
        dbms_output.put_line('No se compraron productos en esa fecha.');
end;
/

/* Y si pidiera los nombres?*/

declare
    v_nif Ventascp.nif%type;
begin
    select nif into v_nif from Ventascp where fecha='22/09/1997';
    dbms_output.put_line('El nif ' || v_nif || ' compro el dia 22/09/1997.');
    exception
      when %no_data_found then
        dbms_output.put_line('No se compraron productos en esa fecha.');
      when too_many_rows then
        dbms_output.put_line('Hay mas de un cliente que ha comprado en esta fecha.')
end;
/

/* Ejercicio 6*/
/*Un cursor implicito devuelve una fila, uno explicito devuelve varias*/

declare
    v_cant Number(3);
    v_sum Number(9);
begin
    select count(*), sum(precio_uni) into v_cant,v_sum from productos;
    dbms_output.put_line('Hay ' || v_cant || ' produtos de la linea pb');
    dbms_output.put_line('El precio total es de ' || v_sum || '€');
    exception
      when %no_data_found then
        dbms_output.put_line('No hay productos en esa linea.');
      when too_many_rows then
        dbms_output.put_line('Hay mas de un cliente que ha comprado en esta fecha.');
end;

/* Ejercicio 7*/

alter table clientes add zona varchar2(10);

declare
    cursor c_clientes is
        select nif from clientes where zona='Centro';
    v_nif Clientes.nif%type;
    cursor c_ventas is
        select * from ventascp where nif=v_nif;
    v_codigo ventascp.cod_producto%type;
    v_unidades ventascp.unidades%type;
begin
    update clientes set zona='Centro' where domicilio='Madrid';
    update clientes set zona='Norte' where domicilio!='Madrid';
    open c_clientes;
    loop
        fetch c_clientes into v_nif;
        exit when c_clientes%notfound;
        open c_ventas;
        loop
          fetch c_ventas into v_codigo, v_unidades;
          exit when c_ventas%notfound;
          select precio_uni into v_precio from productos where cod_producto=v_codigo;
          total := v_precio*v_unidades;
          dbms_output.put_line('El cliente ' || v_nif || ' se ha gastado.');
        end loop
        close c_ventas;
    end loop
    close c_clientes;
    dbms_output.put_line('Se ha facturado un total de ' || totalF || '€');
end;
/

/*Ejercicio 8*/

declare
    cod_max Productos.cod_producto%type;
begin
    select max (cod_producto)+1 into cod_max from productos
        insert into productos values (cod_max,)
end;