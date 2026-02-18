package com.accenture.fers.test.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.accenture.fers.entity.Event;
import com.accenture.fers.entity.Visitor;
import com.accenture.fers.exceptions.FERSGenericException;
import com.accenture.fers.utils.Constantes;

public class VisitorTest {

	public static final Set<Event> REGISTERED_EVENTS = new HashSet<Event>();

	Visitor visitor;

	@Before
	public void setUp() throws Exception {
		visitor = new Visitor();
		visitor.setVisitorId(1);
		visitor.setUserName("erobles");
		visitor.setAddress("La Finca 1 Bloque 2");
		visitor.setDni("11.111.111-H");
		visitor.setEmail("erobles@accenture.com");
		visitor.setFirstName("Emilio");
		visitor.setLastName("Robles");
		visitor.setPassword("qwerty");
		visitor.setPhoneNumber("+112233445566");
		visitor.setRegisteredEvents(REGISTERED_EVENTS);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testVisitorVisitor() {
		Visitor visitorCopy = new Visitor(visitor);
		assertEquals(visitor, visitorCopy);
	}

	@Test
	public void testGetUserName() {
		assertEquals("erobles", visitor.getUserName());
	}

	@Test
	public void testSetUserNamePositive() {
		//Caso de que longitud del userName esté en el límite inferior
		String userName = returnStr(Constantes.MIN_USERNAME);
		visitor.setUserName(userName);
		assertEquals(userName, visitor.getUserName());

		userName = returnStr(Constantes.MAX_USERNAME);
		visitor.setUserName(userName);
		assertEquals(userName, visitor.getUserName());
	}

	@Test
	public void testSetUserNameNegative() {
		Consumer<String> consumer = e -> visitor.setUserName(e);

		//Caso de que la longitud del userName sea inferior al minimo
		String userName = returnStr(Constantes.MIN_USERNAME - 1);
		assertFail(consumer, userName, Constantes.ERM_013);

		//Caso de que la longitud del userName sea superior al máximo
		userName = returnStr(Constantes.MAX_USERNAME + 1);
		assertFail(consumer, userName, Constantes.ERM_013);

		//Caso de que el userName sea null
		userName = null;
		assertFail(consumer, userName, Constantes.ERM_013);
	}

	@Test
	public void testGetPassword() {
		assertEquals("qwerty", visitor.getPassword());
	}

	@Test
	public void testSetPasswordPositive() {
		//Caso de que longitud de la Password esté en el límite inferior
		String password = returnStr(Constantes.MIN_PASSWORD);
		visitor.setPassword(password);
		assertEquals(password, visitor.getPassword());

		//Caso de que longitud de la Password esté en el límite superior
		password = returnStr(Constantes.MAX_PASSWORD);
		visitor.setPassword(password);
		assertEquals(password, visitor.getPassword());
	}

	@Test
	public void testSetPasswordNegative() {
		Consumer<String> consumer = e -> visitor.setPassword(e);

		//Caso de que la longitud de la password sea inferior al mínimo
		String password = returnStr(Constantes.MIN_PASSWORD - 1);
		assertFail(consumer, password, Constantes.ERM_014);

		//Caso de que la longitud de la password sea superior al máximo
		password = returnStr(Constantes.MAX_PASSWORD + 1);
		assertFail(consumer, password, Constantes.ERM_014);

		//Caso de que la password sea null
		password = null;
		assertFail(consumer, password, Constantes.ERM_014);
	}

	@Test
	public void testGetAddress() {
		assertEquals("La Finca 1 Bloque 2", visitor.getAddress());
	}

	@Test
	public void testSetAddressPositive() {
		//Caso de que longitud de la Dirección esté en el límite inferior
		String address = "";
		visitor.setAddress(address);
		assertEquals(address, visitor.getAddress());

		//Caso de que longitud de la Dirección esté en el límite superior
		address = returnStr(Constantes.MAX_ADDRESS);
		visitor.setAddress(address);
		assertEquals(address, visitor.getAddress());
	}

	@Test
	public void testSetAddressNegative() {
		Consumer<String> consumer = e -> visitor.setAddress(e);

		//Caso de que la longitud de la Dirección sea superior al máximo
		String address = returnStr(Constantes.MAX_ADDRESS + 1);
		assertFail(consumer, address, Constantes.ERM_017);

	}

	@Test
	public void testGetFirstName() {
		assertEquals("Emilio", visitor.getFirstName());
	}

	@Test
	public void testSetFirstNamePositive() {
		//Caso de que longitud de el nombre esté en el límite inferior
		String firstName = returnStr(Constantes.MIN_FIRST_NAME);
		visitor.setFirstName(firstName);
		assertEquals(firstName, visitor.getFirstName());

		//Caso de que longitud de el nombre esté en el límite superior
		firstName = returnStr(Constantes.MAX_FIRST_NAME);
		visitor.setFirstName(firstName);
		assertEquals(firstName, visitor.getFirstName());
	}

	@Test
	public void testSetFirstNameNegative() {
		Consumer<String> consumer = e -> visitor.setFirstName(e);

		//Caso de que la longitud del nombre sea inferior al mínimo
		String firstName = "";
		assertFail(consumer, firstName, Constantes.ERM_015);

		//Caso de que la longitud del nombre sea superior al máximo
		firstName = returnStr(Constantes.MAX_FIRST_NAME + 1);
		assertFail(consumer, firstName, Constantes.ERM_015);

		//Caso de que el nombre sea null
		firstName = null;
		assertFail(consumer, firstName, Constantes.ERM_015);
	}

	@Test
	public void testGetLastName() {
		assertEquals("Robles", visitor.getLastName());
	}

	@Test
	public void testSetLastNamePositive() {
		//Caso de que longitud de el nombre esté en el límite inferior
		String lastName = returnStr(Constantes.MIN_LAST_NAME);
		visitor.setLastName(lastName);
		assertEquals(lastName, visitor.getLastName());

		//Caso de que longitud de el nombre esté en el límite superior
		lastName = returnStr(Constantes.MAX_LAST_NAME);
		visitor.setLastName(lastName);
		assertEquals(lastName, visitor.getLastName());
	}

	@Test
	public void testSetLastNameNegative() {
		Consumer<String> consumer = e -> visitor.setLastName(e);

		//Caso de que la longitud del apellido sea inferior al mínimo
		String lastName = returnStr(Constantes.MIN_LAST_NAME - 1);
		assertFail(consumer, lastName, Constantes.ERM_016);

		//Caso de que la longitud del apellido sea superior al máximo
		lastName = returnStr(Constantes.MAX_LAST_NAME + 1);
		assertFail(consumer, lastName, Constantes.ERM_016);

		//Caso de que el apellido sea null
		lastName = null;
		assertFail(consumer, lastName, Constantes.ERM_016);
	}

	@Test
	public void testGetEmail() {
		assertEquals("erobles@accenture.com", visitor.getEmail());
	}

	@Test
	public void testSetEmailPositive() {
		//Caso de que longitud de el email esté en el límite inferior respetando formato
		String email = "a@a";
		visitor.setEmail(email);

		assertEquals(email, visitor.getEmail());

		//Caso de que longitud de el email esté en el límite inferior respetando formato
		email = returnStr(Constantes.MAX_EMAIL - 2) + "@a";
		visitor.setEmail(email);
		assertEquals(email, visitor.getEmail());
	}

	@Test
	public void testSetEmailNegative() {
		Consumer<String> consumer = e -> visitor.setEmail(e);

		//Caso de que la longitud del email sea inferior al mínimo
		String email = "a@";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de que la longitud del email sea superior al máximo
		email = returnStr(Constantes.MAX_EMAIL - 1) + "@a";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de que no haya nada en la parte local
		email = "@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de que no haya nada en la parte dominio
		email = "aaa@";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de más de una arroba
		email = "aaaaaa@aaaa@aa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de que no haya arrobas
		email = "aaaaaaaaaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de que haya un punto justo antes de la arroba
		email = "aaaaaaaa.@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de uso de caracteres prohibidos (/) en parte local
		email = "aaa(aaaa@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de uso de caracteres prohibidos (;) en parte local
		email = "aaa;aaaa@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de uso de caracteres prohibidos (:) en parte local
		email = "aaa:aaaa@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de uso de caracteres prohibidos (() en parte local
		email = "aaa(aaaa@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de uso de caracteres prohibidos ()) en parte local
		email = "aaa)aaaa@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de uso de caracteres prohibidos ( ) en parte local
		email = "aaa aaaa@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de uso de caracteres prohibidos ([) en parte local
		email = "aaa[aaaa@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de uso de caracteres prohibidos (]) en parte local
		email = "aaa]aaaa@aaa.es";
		assertFail(consumer, email, Constantes.ERM_011);

		//Caso de que el email sea null
		email = null;
		assertFail(consumer, email, Constantes.ERM_011);
	}

	@Test
	public void testGetPhoneNumber() {
		assertEquals("+112233445566", visitor.getPhoneNumber());
	}

	@Test
	public void testSetPhoneNumberPositive() {
		// Correct parameter with minimum length
		String phoneNumber = "+112233445";
		visitor.setPhoneNumber(phoneNumber);
		assertEquals(phoneNumber, visitor.getPhoneNumber());

		// Correct parameter with maximum length
		phoneNumber = "11223344556677889900";
		visitor.setPhoneNumber(phoneNumber);
		assertEquals(phoneNumber, visitor.getPhoneNumber());
	}

	@Test
	public void testSetPhoneNumberNegative() {
		Consumer<String> consumer = e -> visitor.setPhoneNumber(e);

		//Caso de que la longitud del teléfono sea inferior al mínimo
		String phoneNumber = "112233445";
		assertFail(consumer, phoneNumber, Constantes.ERM_010);

		//Caso de que la longitud del teléfono sea superior al máximo
		phoneNumber = "112233445566778899001";
		assertFail(consumer, phoneNumber, Constantes.ERM_010);

		//Caso de que haya letras
		phoneNumber = "52412a47852";
		assertFail(consumer, phoneNumber, Constantes.ERM_010);

		//Caso de que haya más de un +
		phoneNumber = "++52412547852";
		assertFail(consumer, phoneNumber, Constantes.ERM_010);

		//Caso de que el + no esté en la primera posición
		phoneNumber = "52+552547852";
		assertFail(consumer, phoneNumber, Constantes.ERM_010);

		//Caso de que haya caracteres no numéricos
		phoneNumber = "123123<123123";
		assertFail(consumer, phoneNumber, Constantes.ERM_010);

		//Caso de que el teléfono sea nulo
		phoneNumber = null;
		assertFail(consumer, phoneNumber, Constantes.ERM_010);
	}

	@Test
	public void testGetDni() {
		assertEquals("11.111.111-H", visitor.getDni());
	}

	@Test
	public void testSetDniPositive() {
		//Caso de que el DNI sea correcto
		String dni = "11.111.111-H";
		visitor.setDni(dni);
		assertEquals(dni, visitor.getDni());
	}

	@Test
	public void testSetDniNegative() {
		Consumer<String> consumer = e -> visitor.setDni(e);

		//Caso de que la longitud del DNI sea inferior al mínimo
		String dni = "11.11.111-H";
		assertFail(consumer, dni, Constantes.ERM_012);

		//Caso de que la longitud del DNI sea superior al máximo
		dni = "111.111.111-H";
		assertFail(consumer, dni, Constantes.ERM_012);

		//Caso de que los puntos estén fuera de posición
		dni = "1.1111.111-H";
		assertFail(consumer, dni, Constantes.ERM_012);

		//Caso de que los puntos estén fuera de posición
		dni = "11.1111.11-H";
		assertFail(consumer, dni, Constantes.ERM_012);

		//Caso de que no haya guión
		dni = "11.111.111.H";
		assertFail(consumer, dni, Constantes.ERM_012);

		//Caso de que el guión esté fuera de posición
		dni = "1a.111.11-1H";
		assertFail(consumer, dni, Constantes.ERM_012);

		//Caso de que haya letras en una posición distinta de la última
		dni = "11.11a.111.H";
		assertFail(consumer, dni, Constantes.ERM_012);

		//Caso de que la letra no es válida para ese número
		dni = "11.111.111-A";
		assertFail(consumer, dni, Constantes.ERM_012);

		//Caso de que el DNI sea null
		dni = null;
		assertFail(consumer, dni, Constantes.ERM_012);
	}

	@Test
	public void testGetVisitorId() {
		assertEquals(1, visitor.getVisitorId());
	}

	@Test
	public void testGetRegisteredEvents() {
		assertEquals(REGISTERED_EVENTS, visitor.getRegisteredEvents());
	}

	private String returnStr(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str = str + "a";
		}
		return str;
	}

	private <T> void assertFail(Consumer<T> consumer, T data, String message) {
		try {
			consumer.accept(data);
			fail("No se ha lanzado la excepcion");
		} catch (FERSGenericException e) {
			assertEquals(message, e.getMessage());
		}
	}

}

