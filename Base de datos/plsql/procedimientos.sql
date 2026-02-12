/*show error*/

create or replace procedure procedimiento(/*parametros (in,out,in out)*/)is 
    declare 
        /*.....*/ 
    begin
    end;
    /

begin
    procedimiento();
end;
/

create or replace procedure saludo is
    begin
        dmbs_ouput.put_line('Buenos dias');
    end; 
    /

begin
    saludo;
end;
/

create or replace procedure saludo(nombre varchar2,salida out varchar2)is /* no indicar tamaño en las variables*/
    begin
        dmbs_ouput.put_line('Buenos dias' || nombre);
        salida:='Buenos dias a ti tambien';
    end; 
    /

begin
    saludo('Lorena');
end;
/

declare
    cursor profes is
        select nombre_pila from profesores;
    v_nombre Profesores.nombre_pila%type;
    v_salida varchar2(30);
begin
    open profes;
    loop
        fetch profes into v_nombre;
        exit when profes%notfound;
        saludo(v_nombre,v_salida); /*llamada al procedimiento saludo*/
        dmbs_ouput.put_line(v_salida);
    end loop;
    close profes;
end;
/

create or replace procedure mostrar(
    cod Profesores.codigo%type, nombre out varchar2, apellido out varchar2)is
    begin
        select nombre_pila,apellido1 into nombre,apellido
            from profesores where Profesores.codigo = cod;
    end mostrar;
    /
declare
    cursor profes is select codigo from profesores;
    v_nombre Profesores.nombre_pila%type;
    v_apellido Profesores.apellido1%type;
    v_codigo Profesores.codigo%type;
begin
    open profes;
    loop
        fetch profes into v_codigo;
        exit when profes%notfound;
        mostrar(v_codigo,v_nombre,v_apellido);
        dmbs_ouput.put_line(v_nombre || ', '|| v_apellido);
    end loop;
    close profes;
end;
/

create or replace procedure mostrar2(
    cod Profesores.codigo%type, nombre in out varchar2)is
    begin
        dbms_ouput.put_line('Se va a cambiar el nombre al apellido 1');
        dbms_output.put_line(nombre);
        select apellido1 into nombre from profesores where codigo = cod;
    end mostrar2;
    /
declare
    cursor profes is select codigo,nombre from profesores;
    v_nombre Profesores.nombre_pila%type;
    v_codigo Profesores.codigo%type;
begin
    open profes;
    loop
        fetch profes into v_codigo;
        exit when profes%notfound;
        mostrar2(v_codigo,v_nombre);
        dbms_ouput.put_line('Se ha cambiado por '||v_nombre);
    end loop;
    close profes;
end;
/