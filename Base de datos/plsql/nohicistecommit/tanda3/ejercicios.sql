/*
1. Usar la tabla Tabla_Articulos.
a) Hacer un bloque anónimo que comprueba si el precio del artículo 'A001' es mayor que
10€, en caso afirmativo, escribe en pantalla todos los datos del artículo.
*/
DECLARE
    v_reg Tabla_Articulos%rowtype;
BEGIN
    select * into v_reg from tabla_articulos where codigo='A001';
    if v_reg.precio > 10 THEN
        dbms_output.put_line(v_reg.codigo || v_reg.nombre || v_reg.precio || v_reg.IVA);
    end if;
END;
/

/*
b) Hacer un bloque anónimo que muestre por pantalla el artículo de mayor precio.
*/
DECLARE
    cursor mostrarDatos is 
        select nombre from TABLA_ARTICULOS where precio = (select max(precio) from tabla_articulos);
    v_nombre tabla_articulos.NOMBRE%TYPE;
BEGIN
    open mostrarDatos;
    fetch mostrarDatos into v_nombre;
    DBMS_OUTPUT.PUT_LINE('El articulo mas caro es: ' || v_nombre);
    close mostrarDatos;
END;
/

DECLARE
    v_nombre tabla_articulos.NOMBRE%TYPE;
BEGIN
    select nombre into v_nombre from TABLA_ARTICULOS where precio = (select max(precio) from TABLA_ARTICULOS);
    DBMS_OUTPUT.PUT_LINE('El articulo mas caro es: ' || v_nombre);
END;
/
/*
c) Hacer un bloque anónimo que actualice el precio del artículo ‘A005’ según las siguientes
condiciones:
 Si el artículo tiene un precio menor de 20€, su precio debe ser aumentado en 1€.
 Si está comprendido entre 20€ y 40€ su precio aumentará un 10 %.
 Si es mayor de 40€ su precio aumentará en un 5%.
 Si el precio es NULL, no se incrementa.
*/
DECLARE
    cursor actualizarDatos is 
        select precio from TABLA_ARTICULOS where codigo='A005'
    for UPDATE;
    v_precio tabla_articulos.PRECIO%TYPE;
BEGIN
    open actualizarDatos;
    fetch actualizarDatos into v_precio;
    if v_precio < 20 THEN
        update TABLA_ARTICULOS set precio=PRECIO+1 where current of actualizarDatos;
    elsif v_precio > 20 and v_precio < 40 then
        update TABLA_ARTICULOS set precio=precio*1.10 where current of actualizarDatos;
    elsif v_precio > 40 THEN
        update TABLA_ARTICULOS set precio=precio*1.05 where current of actualizarDatos;
    end if;
    close actualizarDatos;
END;
/

/*
d) Hacer un bloque anónimo similar al del apartado c donde el usuario introduzca por
teclado el código del artículo q
*/
DECLARE
    cursor actualizarDatos(par_codigo tabla_articulos.codigo%type) is 
        select precio from TABLA_ARTICULOS where codigo=par_codigo
    for UPDATE;
    v_precio tabla_articulos.PRECIO%TYPE;
    v_codigo tabla_articulos.CODIGO%TYPE := '&codigo';
BEGIN
    open actualizarDatos(v_codigo);
    fetch actualizarDatos into v_precio;
    if v_precio < 20 THEN
        update TABLA_ARTICULOS set precio=PRECIO+1 where current of actualizarDatos;
    elsif v_precio > 20 and v_precio < 40 then
        update TABLA_ARTICULOS set precio=precio*1.10 where current of actualizarDatos;
    elsif v_precio > 40 THEN
        update TABLA_ARTICULOS set precio=precio*1.05 where current of actualizarDatos;
    end if;
    close actualizarDatos;
END;
/

/*
2. Usar las tablas Alumnos y AlumnosInf
 Hacer un bloque anónimo con un que inserte sólo los alumnos de informática en la tabla
 ALUMNOSINF, teniendo en cuenta la estructura de esta tabla, así por ejemplo, se debe
 tener en cuenta que el atributo nombre_apellidos resulta de la concatenación de los
 atributos nombre y apellidos. Antes de la inserción de cada tupla en la tabla ALUMNOSINF
 se debe mostrar por pantalla el nombre y el apellido que va a insert
*/

DECLARE
    cursor atraparAlumnos is
        select numMatricula,nombre,apellidos,precioMatricula 
        from Alumnos where titulacion='Informatica';
BEGIN
    dbms_output.PUT_LINE('Se insertaran: ');
    for reg in atraparAlumnos LOOP 
        dbms_output.PUT_LINE(reg.nombre || ' ' || reg.apellidos);
    end loop;
    for reg in atraparAlumnos LOOP 
        insert into ALUMNOSINF values (reg.numMatricula, reg.nombre || ' ' || reg.apellidos, reg.precioMatricula);
    end loop;
END;
/
select * from alumnosinf;

/*
3. Usar las tablas Tabla_Departamento y Tabla_Empleado
 a) Hacer un bloque anónimo que calcule el presupuesto del departamento para el año
 próximo. Se almacenará el mismo en la tabla Tabla_Departamento en la columna
 Presupuesto. Hay que tener en cuenta las siguientes subidas de sueldo:
 Gerente + 20%
 Comercial + 15%
 Los demás empleados que no estén en ninguna de las categorías anteriores se les
 subirá el sueldo un 10%
*/
DECLARE
    cursor updateSalario is 
        select * from tabla_empleado
    for update;
BEGIN 
    update TABLA_DEPARTAMENTO set presupuesto = 0;
    /* no? */
    for emp in updateSalario loop
        if emp.categoria='Gerente' then
            update TABLA_EMPLEADO set SALARIO=SALARIO*1.20 where current of updateSalario;
            update TABLA_DEPARTAMENTO set presupuesto=presupuesto + emp.salario where NUM_DEPART=emp.NUM_DEPART;
        elsif emp.categoria='Comercial' then 
            update TABLA_EMPLEADO set SALARIO=SALARIO*1.25 where current of updateSalario;
            update TABLA_DEPARTAMENTO set presupuesto=presupuesto + emp.salario where NUM_DEPART=emp.NUM_DEPART;
        else
            update TABLA_EMPLEADO set SALARIO=SALARIO*1.20 where current of updateSalario;
        end if;
    end loop;
END;
/
/* No entendi muy bien este ejercicio */
select * from TABLA_DEPARTAMENTO;
/*
b) Hacer un bloque anónimo que actualice el campo Total_Salarios y el campo
 Media_Salarios de la tabla Tabla_Departamento, siendo el total la suma del salario de
 todos los empleados, igualmente con la media. Para ello:
 Cree un cursor C1, que devuelva todos los departamentos
 Cree un cursor C2, que devuelva el salario y el código de todos los empleados de
su departamento. 
*/
DECLARE
    cursor C1 is 
        select * from TABLA_DEPARTAMENTO;
    cursor C2(par_numDepart Tabla_Departamento.num_depart%type) is 
        select salario, num_depart from TABLA_EMPLEADO;
    v_contador integer := 0;
BEGIN
    update TABLA_DEPARTAMENTO set MEDIA_SALARIOS=0,TOTAL_SALARIOS=0;
    for dep in C1 loop 
        for emple in C2(dep.num_depart) LOOP
            v_contador := v_contador + 1;
            update TABLA_DEPARTAMENTO 
                set TOTAL_SALARIOS = TOTAL_SALARIOS + emple.salario 
                , MEDIA_SALARIOS = (MEDIA_SALARIOS + emple.salario/v_contador)
                where NUM_DEPART=emple.num_depart;
        end loop;
        v_contador := 0;
    end loop;
END;
/

select * from TABLA_DEPARTAMENTO;