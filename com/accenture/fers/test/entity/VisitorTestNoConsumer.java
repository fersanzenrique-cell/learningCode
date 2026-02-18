package com.accenture.fers.test.entity;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.accenture.fers.entity.Event;
import com.accenture.fers.entity.Visitor;
import com.accenture.fers.utils.Constantes;

public class VisitorTestNoConsumer {

	public static final int ID_VALIDO = 1;
	public static final String USERNAME_VALIDO = "username1";
	public static final String ADDRESS_VALIDA = "address1";
	public static final String DNI_VALIDO = "11.111.111-H";
	public static final String EMAIL_VALIDO = "visitor1@accenture.com";
	public static final String FIRSTNAME_VALIDO = "firstName1";
	public static final String LASTNAME_VALIDO = "lastName1";
	public static final String PASSWORD_VALIDA = "password1";
	public static final String PHONENUMBER_VALIDO = "6116161616";
	public static final Set<Event> REGISTERED_EVENTS = new HashSet<Event>();

	Visitor visitor;

	@Before
	public void setUp() throws Exception {
		visitor = new Visitor();
		visitor.setVisitorId(ID_VALIDO);
		visitor.setUserName(USERNAME_VALIDO);
		visitor.setAddress(ADDRESS_VALIDA);
		visitor.setDni(DNI_VALIDO);
		visitor.setEmail(EMAIL_VALIDO);
		visitor.setFirstName(FIRSTNAME_VALIDO);
		visitor.setLastName(LASTNAME_VALIDO);
		visitor.setPassword(PASSWORD_VALIDA);
		visitor.setPhoneNumber(PHONENUMBER_VALIDO);
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
		assertEquals(USERNAME_VALIDO, visitor.getUserName());
	}

	@Test
	public void testSetUserName() {
		// Correct parameter with minimum length
		String userName = returnStr(Constantes.MIN_USERNAME);
		visitor.setUserName(userName);
		assertEquals(userName, visitor.getUserName());

		// Correct parameter with maximum length
		userName = returnStr(Constantes.MAX_USERNAME);
		visitor.setUserName(userName);
		assertEquals(userName, visitor.getUserName());
	}

	@Test
	public void testGetPassword() {
		assertEquals(PASSWORD_VALIDA, visitor.getPassword());
	}

	@Test
	public void testSetPassword() {
		// Correct parameter with minimum length
		String password = returnStr(Constantes.MIN_PASSWORD);
		visitor.setPassword(password);
		assertEquals(password, visitor.getPassword());

		// Correct parameter with maximum length
		password = returnStr(Constantes.MAX_PASSWORD);
		visitor.setPassword(password);
		assertEquals(password, visitor.getPassword());
	}

	@Test
	public void testGetAddress() {
		assertEquals(ADDRESS_VALIDA, visitor.getAddress());
	}

	@Test
	public void testSetAddress() {
		// Correct parameter with minimum length
		String address = returnStr(Constantes.MIN_ADDRESS);
		visitor.setAddress(address);
		assertEquals(address, visitor.getAddress());

		// Correct parameter with maximum length
		address = returnStr(Constantes.MAX_ADDRESS);
		visitor.setAddress(address);
		assertEquals(address, visitor.getAddress());

	}

	@Test
	public void testGetFirstName() {
		assertEquals(FIRSTNAME_VALIDO, visitor.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		// Correct parameter with minimum length
		String firstName = returnStr(Constantes.MIN_FIRST_NAME);
		visitor.setFirstName(firstName);
		assertEquals(firstName, visitor.getFirstName());

		// Correct parameter with maximum length
		firstName = returnStr(Constantes.MAX_FIRST_NAME);
		visitor.setFirstName(firstName);
		assertEquals(firstName, visitor.getFirstName());

	}

	@Test
	public void testGetLastName() {
		assertEquals(LASTNAME_VALIDO, visitor.getLastName());
	}

	@Test
	public void testSetLastName() {
		// Correct parameter with minimum length
		String lastName = returnStr(Constantes.MIN_LAST_NAME);
		visitor.setLastName(lastName);
		assertEquals(lastName, visitor.getLastName());

		// Correct parameter with maximum length
		lastName = returnStr(Constantes.MAX_LAST_NAME);
		visitor.setLastName(lastName);
		assertEquals(lastName, visitor.getLastName());

	}

	@Test
	public void testGetEmail() {
		assertEquals(EMAIL_VALIDO, visitor.getEmail());
	}

	@Test
	public void testSetEmail() {
		// Correct parameter with minimum length and format
		String email = "a@a.a";
		visitor.setEmail(email);

		assertEquals(email, visitor.getEmail());

		// Correct parameter with maximum length and format
		email = returnStr(Constantes.MAX_EMAIL - 6) + "@aa.es";
		visitor.setEmail(email);
		assertEquals(email, visitor.getEmail());

	}

	@Test
	public void testGetPhoneNumber() {
		assertEquals(PHONENUMBER_VALIDO, visitor.getPhoneNumber());
	}

	@Test
	public void testSetPhoneNumber() {
		// Correct parameter with minimum length
		String phoneNumber = "+231231231";
		visitor.setPhoneNumber(phoneNumber);
		assertEquals(phoneNumber, visitor.getPhoneNumber());

		// Correct parameter with maximum length
		phoneNumber = "12312312312312312312";
		visitor.setPhoneNumber(phoneNumber);
		assertEquals(phoneNumber, visitor.getPhoneNumber());

	}

	@Test
	public void testGetDni() {
		assertEquals(DNI_VALIDO, visitor.getDni());
	}

	@Test
	public void testSetDni() {
		// Correct
		String dni = "11.111.111-H";
		visitor.setDni(dni);
		assertEquals(dni, visitor.getDni());
	}

	@Test
	public void testGetVisitorId() {
		assertEquals(ID_VALIDO, visitor.getVisitorId());
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
}

