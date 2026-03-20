/*1.*/

DECLARE
    v_nombre medicos.nombre%type;
    v_espe especialidades.nombre%type;
    v_fecha medicos.contratacion%type;
BEGIN
    select min(contratacion) into v_fecha from medicos;
    select medicos.nombre med,especialidades.nombre espe
        into v_nombre, v_espe
        from medicos
        inner join especialidades
        on medicos.id_especialidad=especialidades.id_especialidad
        where contratacion=v_fecha;
    dbms_output.put_line('El medico es : ' || v_nombre || ' y esta en ' || v_espe);
END;
/

/*2.*/

create or replace function codigoEspecialidad(
    in_nombre in especialidades.nombre%type
) return number is 
    var_id especialidades.id_especialidad%type;
    BEGIN 
        select id_especialidad into var_id from especialidades
        where nombre=in_nombre;
        return var_id;
    exception
    when no_data_found then
        dbms_output.put_line('Busqueda fallida');
        return -1;
    END codigoEspecialidad;
/

DECLARE
    v_nombre especialidades.nombre%type := '&nombre';
    v_num especialidades.id_especialidad%type;
BEGIN
    dbms_output.put_line('El id es: ' || codigoEspecialidad(v_nombre));
END;
/

/*El otro 2*/

DECLARE
    v_nombre especialidades.nombre%type := '&nombre';
    v_suma NUMBER(20,2) := 0;
BEGIN
    select sum(medicos.salario) into v_suma
    from medicos
    inner join especialidades
    on medicos.id_especialidad=especialidades.id_especialidad
    where especialidades.id_especialidad=codigoEspecialidad(v_nombre);

    dbms_output.put_line(
        'La suma del salario de la especialidad ingresada es: 
        ' || v_suma);
END;
/
/*3. */

create or replace procedure cantidadMedicos(
    in_nombre in especialidades.nombre%TYPE
    ) is 
    v_total integer := 0;
    BEGIN

    select count(medicos.id_medico) into v_total from medicos
    inner join especialidades
    on medicos.id_especialidad=especialidades.id_especialidad
    where especialidades.nombre=in_nombre;
    dbms_output.put_line('El numero total de medicos es: ' || v_total);

    END cantidadMedicos;
/

begin
    cantidadMedicos('Dermatologia');
end;
/
/*4.*/

create or replace procedure salarioTotal is 
    v_coste integer := 0;
    BEGIN
    select sum(salario + c_guardias) into v_coste 
    from medicos
    inner join especialidades
    on medicos.id_especialidad=especialidades.id_especialidad
    where contratacion < TO_DATE('01-01-2015','DD-MM-YYYY');
    dbms_output.put_line('El numero total de salario es: ' || v_coste);
    END salarioTotal;
/

begin
    salarioTotal;
end;
/

/*6.*/

create or replace function horasEstancia(in_nombre in medicos.nombre%type) 
return HOSPITALIZACIONES.horas_estancia%type is 
v_horas HOSPITALIZACIONES.horas_estancia%type := 0;
    BEGIN
        select sum(HOSPITALIZACIONES.horas_estancia) into v_horas from hospitalizaciones
        inner join MEDICOS
        on hospitalizaciones.id_medico = medicos.id_medico
        where medicos.nombre=in_nombre;
        return v_horas;
    END;
/

DECLARE
    cursor mostrarMedicos is 
        select nombre from medicos;
BEGIN 
    for medico in mostrarMedicos loop
        dbms_output.put_line(medico.nombre 
            || ' tiene un total de ' 
            || horasEstancia(medico.nombre) 
            || ' horas de Estancia');
    end loop;
END;
/

/* 7.*/
create or replace procedure actualizarCoste(in_pacientes in pacientes.categoria%type) is 
cursor actualizarPorCategoria is
    select HOSPITALIZACIONES.coste from hospitalizaciones
    inner join pacientes 
    on hospitalizaciones.id_paciente=pacientes.id_paciente
    where pacientes.categoria=in_pacientes
    for update;
    v_descuento hospitalizaciones.coste%type := 0;
BEGIN
    if in_pacientes='A' then 
        v_descuento := 0.85;
    elsif in_pacientes='B' then
        v_descuento := 0.90;
    elsif in_pacientes='C' then
        v_descuento := 0.95;
    end if;

    for row in actualizarPorCategoria loop
        update hospitalizaciones set coste=coste*v_descuento where current of actualizarPorCategoria;
    end loop;
end actualizarCoste;
/

begin
    actualizarCoste('A');
end;
/

/*
SQL> select * from hospitalizaciones;

   ID_HOSP ID_PACIENTE  ID_MEDICO HORAS_ESTANCIA      COSTE
---------- ----------- ---------- -------------- ----------
         1           1          1             48       1020
         2           2          1             36        900
         3           3          2             72       2000
         4           4          2             24        510
         5           5          3             72       1800
         6           1          3             48       1275
         7           2          2             24        700
         8           3          1             48       1300
         9           4          3             36        765
        10           5          1             48       1600
        11           6          4             24        500

   ID_HOSP ID_PACIENTE  ID_MEDICO HORAS_ESTANCIA      COSTE
---------- ----------- ---------- -------------- ----------
        12           7          4             48        935
        13           8          5             72       1900
        14           9          5             24        400
        15          10          6             48       1020
        16           6          5             48       1000
        17           7          6             72       1530
        18           8          4             48       1300
        19           9          6             24        450
        20          10          4             48     1062,5
        21           1          7             72       1785
        22           9          7             24        600

   ID_HOSP ID_PACIENTE  ID_MEDICO HORAS_ESTANCIA      COSTE
---------- ----------- ---------- -------------- ----------
        23          13          8             48       1500
        24          10          8             48       1190
        25           4          9             48       1105
        26           8          9             48       1600
        27          20          8             48     1147,5
        28          25          7             24        500
        29          14          9             48     1232,5
        30          12          7              8       1500
        31          22         10            120       4000
        32          17         10             96       2720
        33          18         11             96       3100

   ID_HOSP ID_PACIENTE  ID_MEDICO HORAS_ESTANCIA      COSTE
---------- ----------- ---------- -------------- ----------
        34          24         11             72       2125
        35          29         12             96       3300
        36          26         12             96       3500
        37          17         11             72       2210
        38          16         10             96       3400
        39          19         12             72       2550
        40          29         10             96       3450
        41          26         13             48       1200
        42           3         13             48       1300
        43          30         14             48       1400
        44          14         14             48     1147,5

   ID_HOSP ID_PACIENTE  ID_MEDICO HORAS_ESTANCIA      COSTE
---------- ----------- ---------- -------------- ----------
        45           3         15             48       1250
        46          26         15             48       1100
        47          30         13             48       1150
        48          22         14             48       1200
        49          15         15             48       1180
        50          30         13             48       1220

50 rows selected.
*/

