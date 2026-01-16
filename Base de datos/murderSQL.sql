

/* https://www.sqlnoir.com/blog/games-to-learn-sql 
	https://datalemur.com/sql-game
El asesinato ocurrio en el 05/01/2018 20180115 */

select * from crime_scene_report;

/*Los resultados fueron unos cuantos, y no servían.
Vamos a buscar con lo que tenemos, la ciudad y la fecha
*/

select * from crime_scene_report
where date=20180115 and city like 'SQL City';

/*
	20180115	assault	Hamilton: Lee, do you yield? Burr: You shot him in the side! Yes he yields!	SQL City
	20180115	assault	Report Not Found	SQL City
	20180115	murder	Security footage shows that there were 2 witnesses. The first witness lives at the last house on "Northwestern Dr". The second witness, named Annabel, lives somewhere on "Franklin Ave".	SQL City
	
Dos sospechosos:
	El primero vive en la ultima casa de "Northwestern Dr".
	El segundo se llama Annabel, vive por "Franklin Ave".
	Empezemos por el primero.
*/

select * from person
where address_street_name like 'Northwestern Dr'
order by address_number desc
limit 1 ;

/*
	14887	Morty Schapiro	118009	4919	Northwestern Dr	111564949
Vamos a investigar sobre esta persona utilizando 
su licencia de conduccion, facebook, ingresos, y entrevista.
*/

select transcript entrevista
from interview
where person_id=14887;


select annual_income 'Ingresos anuales', ssn
from income
where ssn=111564949;

/*
	Entrevista
	
	I heard a gunshot and then saw a man run out. He had a "Get Fit Now Gym" bag. The membership number on the bag started with "48Z". Only gold members have those bags. The man got into a car with a plate that included "H42W".
	
	Ingresos anuales
	no tiene, sera menor
	
	El sospechoso dice haber escuchado un tiro y ver a un hombre correr.
	Tenia un "Get Fit Now Gym" bolsa, su numero de miembro empezaba por "48Z".
	Solo los miembros de oro tienen esa bolsa.
	Tiene una matrícula en su coche que empieza por "H42W".
	Vamos a investigar la matricula y el afiliado con el gimnasio
*/

select * from get_fit_now_check_in
where membership_id like '48Z%'; 

/*Salen unas cuantas,
	pero vamos a ver cuales de estas matriculas son miembros de oro
*/

select
    getfm.name as Nombre,
    getfm.person_id as Id,
    getfc.membership_id as 'Id de afiliación'
from get_fit_now_member getfm
join get_fit_now_check_in getfc
    on getfm.id = getfc.membership_id
where getfc.membership_id like '48Z%'
  and getfm.membership_status = 'gold'
group by getfm.name, getfm.id, getfc.membership_id;

/*
	Nombre			Id		Id de afiliación
	Jeremy Bowers	67318	48Z55
	Joe Germuska	28819	48Z7A
Investigamos todo sobre ellos, antes veremos la matricula del coche
Jeremy Bowers era el asesino de todas maneras hay que seguir investigando
*/
select * from drivers_license
where plate_number like 'H42W%';

/* Investigaremos esta placa 
id		age	height	eye_color	hair_color	gender	plate_number	car_make	car_model
183779	21	65		blue		blonde		female	H42W0X			Toyota		Prius
*/

select p.id 'Id de la persona',
i.transcript Entrevista
from interview i
join person p
on i.person_id=p.id
join drivers_license d
on p.license_id=d.id
where d.id=183779;

select * from person
where license_id=183779;

select * from interview
where person_id=78193;

/*
Esta persona existe pero no tiene entrevista
	Nombre			Id		Id de afiliación
	Jeremy Bowers	67318	48Z55
Vamos a volver con Jeremy, la respuesta que nos dio la web fue.

Congrats, you found the murderer! 
But wait, there's more... If you think you're up for a challenge, 
try querying the interview transcript of the murderer to find 
the real villain behind this crime. 
If you feel especially confident in your SQL skills, 
try to complete this final step with no more than 2 queries.
Use this same INSERT statement with your new suspect to check your answer.

*/

select * from interview
where person_id=67318;

/*
Dice esto:
I was hired by a woman with a lot of money.
I don't know her name but I know she's around 5'5" (65") or 5'7" (67").
She has red hair and she drives a Tesla Model S.
I know that she attended the SQL Symphony Concert 3 times in December 2017.

Mujer, mucho dinero, entre 65 o 67 de alta, pelo rojo, tesla model S,
Atendío al concierto de sql symphony 3 veces en diciembre 2017
(20171201 entre 20180101)
El nombre del concierto es SQL Symphony Concert
*/

select p.name Nombre,p.id ID, f.event_name Evento, f.date Fecha
from person p
join drivers_license d
on p.license_id=d.id
join facebook_event_checkin f
on p.id=f.person_id
where d.id=(select id from drivers_license where
	gender like '%emale' and height=66 and hair_color like '%ed'
	and car_make like '%esla' and car_model like '%odel S'
)
group by p.name,p.id, f.event_name, f.date;

/*
height between 65 and 67
Nombre				ID		Evento					Fecha
Miranda Priestly	99716	SQL Symphony Concert	20171206
Miranda Priestly	99716	SQL Symphony Concert	20171212
Miranda Priestly	99716	SQL Symphony Concert	20171229
Ya sabemos quien es
*/

INSERT INTO solution VALUES (1, 'Miranda Priestly');
        
        SELECT value FROM solution;

/*
Congrats, you found the brains behind the murder! 
Everyone in SQL City hails you as the greatest SQL detective of all time.
Time to break out the champagne!
*/