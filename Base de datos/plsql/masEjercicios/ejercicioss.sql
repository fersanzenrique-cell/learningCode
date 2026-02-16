/*
CON BLOQUES ANONIMOS, HACERLO TAMBIEN CON PROCEDIMIENTOS FUNCIONES.
1. Usar la tabla Tabla_Articulos.
a) Hacer un bloque anónimo que comprueba si el precio del artículo 'A001' es mayor que
10€, en caso afirmativo, escribe en pantalla todos los datos del artículo.
*/

declare 
    v_reg Tabla_Articulos%rowtype;
begin
    select * into v_reg where codigo='A001';
    if v_reg.precio > 10 then 
        dbms_output.put_line(v_reg.codigo || v_reg.nombre || v_reg.precio || v_reg.IVA);
    end if;
end;
/
/*
b) Hacer un bloque anónimo que muestre por pantalla el artículo de mayor precio.
*/

declare 
    v_reg Tabla_Articulos%rowtype;
begin
    select * into v_reg order by price desc limit 1;
    dbms_output.put_line(v_reg.codigo || v_reg.nombre || v_reg.precio || v_reg.IVA);
end;

/*
c) Hacer un bloque anónimo que actualice el precio del artículo ‘A005’ según las siguientes
condiciones:
 Si el artículo tiene un precio menor de 20€, su precio debe ser aumentado en 1€.
 Si está comprendido entre 20€ y 40€ su precio aumentará un 10 %.
 Si es mayor de 40€ su precio aumentará en un 5%.
 Si el precio es NULL, no se incrementa.
*/

declare 
    v_reg Tabla_Articulos%rowtype;
begin
    select * into v_reg where codigo='A005';
    if v_reg.precio > 40 then
        update Tabla_Articulos set v_reg.precio = v_reg.precio * 1.05;
    elsif v_reg.precio > 20 and v_reg.precio < 40 then
        update Tabla_Articulos set v_reg.precio = v_reg.precio * 1.10;
    elsif v_reg.precio < 20 then
        update Tabla_Articulos set v_reg.precio = v_reg.precio + 1;
    end if;
end;

/*
d) Hacer un bloque anónimo similar al del apartado c donde el usuario introduzca por
teclado el código del artículo que desee modificar su precio.
*/

declare
    codigoMod varchar2(5) := &codigoMod;
    precioMod number := &precioMod;
    v_reg Tabla_Articulos%rowtype;
begin
    select * into v_reg where codigo=codigoMod;
    update Tabla_Articulos set v_reg.precio = precioMod;
end;

/*
2. Usar las tablas Alumnos y AlumnosInf
Hacer un bloque anónimo con un que inserte sólo los alumnos de informática en la tabla
ALUMNOSINF, teniendo en cuenta la estructura de esta tabla, así por ejemplo, se debe
tener en cuenta que el atributo nombre_apellidos resulta de la concatenación de los
atributos nombre y apellidos. Antes de la inserción de cada tupla en la tabla ALUMNOSINF
se debe mostrar por pantalla el nombre y el apellido que va a insertar.
*/

declare
    cursor mostrarInformaticos is 
        select * from Alumnos where titulacion = 'Informatica';
    v_reg1 Alumnos%rowtype;
    cursor modificarInformaticos is 
        select nombre,apellidos from Alumnos where titulacion = 'Informatica';
    v_nombre Alumnos.nombre%type;
    v_apellidos Alumnos.nombre%type;
    cursor anadirAlumnos is 
        select * from AlumnosInf;
    /*La cuestion es crear un bucle que lea los alumnos de la primera tabla y vaya añadiendolos a
    sus respectivas columnas en la segunda tabla.*/
    