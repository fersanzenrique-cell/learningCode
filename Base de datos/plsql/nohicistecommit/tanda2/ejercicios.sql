/*
1.- Implementar un bloque el cual saque un listado de todos los profesores cuyo
 apellido paterno comienza con la letra B. Mostrar el nombre y sus dos apellidos.
*/

DECLARE
    cursor mostrarProfesores is 
        select nombre_pila, apellido1, apellido2 from profesores where apellido1 like 'B%';
BEGIN
    for fila in mostrarProfesores LOOP
        dbms_output.put_line(fila.nombre_pila || ' ' || fila.apellido1 || ' ' || fila.apellido2);
    end loop;
END;
/

/*
2.- Implementar un bloque que por medio de un cursor que liste el nombre y
 apellidos de los profesores que se están en las áreas 'atc' y 'oem',ordenados
 por área y dentro del Área por nombre de manera descendente. Sacar también
 el nombre del área.
*/

DECLARE
    cursor mostrarProfesores is 
        select nombre_pila, apellido1, apellido2, area 
        from profesores
        where area like UPPER('atc') or area like UPPER('oem') 
        order by area, nombre_pila desc;
BEGIN
    for fila in mostrarProfesores LOOP
        dbms_output.PUT_LINE(fila.nombre_pila || ' ' || fila.apellido1 || ' ' || fila.apellido2 || ' ' || fila.area);
    END LOOP;
END;
/
/*
3.- Implemente un bloque por medio del cual se saque la siguiente información:
 COD EDIFICIO CAPACIDAD
 ---------------------------------------------
 Se sacara la capacidad de cada uno de los edificios relacionados en la tabla
locales.
*/
DECLARE
    cursor mostrarLocales is 
        select codigo, edificio, capacidad from locales;
BEGIN
    DBMS_OUTPUT.PUT_LINE('COD    EDIFICIO      CAPACIDAD');
    DBMS_OUTPUT.PUT_LINE('------------------------------');
    for reg in mostrarLocales loop 
        DBMS_OUTPUT.PUT_LINE(reg.codigo || '      ' || reg.edificio || '        ' || reg.capacidad);
        DBMS_OUTPUT.PUT_LINE('------------------------------');
    end loop;
END;

/*
4.- Implemente un bloque, el cual obtenga la información de las asignaturas y
 efectué las siguientes operaciones.
- para las asignaturas que tengan menos de 100 alumnos, actualizar el campo
 alumnos con el valor 100.
- las que tengan entre 101 y 200, actualizar con el valor 200.
- mayores de 200 actualizar con el valor 300.
 Una vez finalizado el proceso se debe imprimir la siguiente información:
 ASIGNATURA CANTIDAD ALUMNOS
 ----------------------------------------------------------

*/

DECLARE 
    cursor actualizarAlumnos is 
        select alumnos from asignaturas
        for update of alumnos;
    cursor mostrarAlumnos is 
        select nombre, anualidad, alumnos from ASIGNATURAS;
BEGIN 
    for reg in actualizarAlumnos loop 
        if reg.alumnos < 100 then 
            update ASIGNATURAS set alumnos = 100 where current of actualizarAlumnos;
        elsif reg.alumnos >= 101 and reg.alumnos <= 200 then 
            update ASIGNATURAS set alumnos = 200 where current of actualizarAlumnos;
        elsif reg.alumnos > 200 then 
            update ASIGNATURAS set alumnos = 300 where current of actualizarAlumnos;
        end if;
    end loop;
    DBMS_OUTPUT.PUT_LINE('ASIGNATURA ANUALIDAD ALUMNOS');
    DBMS_OUTPUT.PUT_LINE('---------------------------');

    for reg in mostrarAlumnos loop
        DBMS_OUTPUT.PUT_LINE(reg.nombre || '      ' || reg.anualidad || '        ' || reg.alumnos);
    end loop;
END; 
/

/*
CURSORES PARAMETRIZADOS
5.- Listar las asignaturas, cuya cantidad de alumnos sea mayor a un valor
 introducido por teclado y cuyas horas teóricas sea igual a un valor, también,
 introducido por el usuario. Sacar la siguiente información.
 Sigla Nom. Asig Horas Teoricas Cant Alumnos
 ------------------------------------------------------------------------
*/

DECLARE
    cursor mostrarDatosParametro (par_cantidadAlumnos asignaturas.alumnos%TYPE, par_horasTeoricas asignaturas.horas_teoria%TYPE) IS 
        select siglas, nombre, horas_teoria , alumnos from asignaturas where alumnos > par_cantidadAlumnos and horas_teoria=par_horasTeoricas;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Sigla | Nom. Asig | Horas Teoricas | Cant Alumnos');
    DBMS_OUTPUT.PUT_LINE('---------------------------------------------');
    for reg in mostrarDatosParametro(200, 2) LOOP
        DBMS_OUTPUT.PUT_LINE(reg.siglas || ' | ' || reg.nombre || ' | ' || reg.horas_teoria || ' | ' || reg.alumnos);
    end loop;
END;
/

/*
6.-Implementar un bloque, el cual saque la información de las áreas asociadas
 a un departamento el cual debe ser introducido por teclado. Sacar la siguiente
 información:
 Código Área Área
 ----------------------------------------
 FIS Física Aplicada
*/
DECLARE
    cursor mostrarDatosPar(par_departamento areas.departamento%type) is 
        select codigo, nombre from areas where departamento=par_departamento;
    
    entrada VARCHAR2(3) := '&in';
BEGIN
    DBMS_OUTPUT.PUT_LINE('Código Área | Área');
    DBMS_OUTPUT.PUT_LINE('----------------------------------------');
    for reg in mostrarDatosPar(UPPER(entrada)) loop 
        DBMS_OUTPUT.PUT_LINE(reg.codigo || ' | ' || reg.nombre);
    end loop;
END;
/

/*
7.-Implementar un bloque, el cual saque la información de los locales que
 pertenecen a un edificio introducido por el usuario, cuya capacidad sea mayor
 a un valor, también, introducido por el usuario.
 Ejemplo: Sacar los locales del edificio EGB, cuya capacidad sea mayor a 50.
 La información a sacar será la siguiente:
 Código Local Nombre Local Capacidad
----------------------------------------------------------
*/
DECLARE
    cursor sacarDatosLocales(par_edificio locales.edificio%type, par_capacidad locales.capacidad%type) is 
        select codigo, nombre, capacidad from locales where edificio like par_edificio and capacidad > par_capacidad;
    entradaEdificio locales.EDIFICIO%TYPE := '&edificio';
    entradaCapacidad locales.CAPACIDAD%TYPE := &capacidad;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Código Local | Nombre Local | Capacidad');
    DBMS_OUTPUT.PUT_LINE('----------------------------------------');
    for reg in sacarDatosLocales(entradaEdificio, entradaCapacidad) loop
        DBMS_OUTPUT.PUT_LINE(reg.codigo || ' | ' || reg.nombre || ' | ' || reg.capacidad);
    end loop;
END;
/
/*
8.-Implemente un bloque, el cual obtenga el listado de profesores que pertenecen
 a una área en particular.
 El área debe ser solicitada por teclado y el resultado debe ser un listado con el
 formato que se muestra a continuación.
 Código Área Área Profesor
 ------------------------------------------------------------------------------------
 FIS Física Aplicada Luis Alberto López Villaverde
*/
DECLARE
    cursor sacarProfesores(par_area areas.codigo%type) is 
        select distinct areas.codigo cod, areas.nombre nom, profesores.nombre_pila nomp, profesores.apellido1 ap1, profesores.apellido2 ap2
        from areas inner join profesores 
        on areas.codigo=profesores.area
        where areas.codigo like par_area;
    codigo areas.CODIGO%TYPE := '&codigo';
BEGIN
    DBMS_OUTPUT.PUT_LINE('Código Área | Área | Profesor');
    DBMS_OUTPUT.PUT_LINE('-----------------------------');
    for reg in sacarProfesores(codigo) loop 
        DBMS_OUTPUT.PUT_LINE(reg.cod || ' | ' || reg.nom || ' | ' || reg.nomp || ' ' || reg.ap1 || ' ' || reg.ap2);
    end loop;
END;
/