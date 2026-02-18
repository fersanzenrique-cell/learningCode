package com.accenture.fers.test.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.accenture.fers.entity.Event;
import com.accenture.fers.exceptions.FERSGenericException;
import com.accenture.fers.utils.Constantes;

/**
 * Class to test Event class
 *
 * @author Accenture Technology Solutions
 *
 */
public class EventTestNoConsumer {

	private Event event;
	public static final int VALID_EVENT_ID=1;
	public static final String VALID_EVENT_NAME="Event 1";
	public static final String VALID_EVENT_DESCRIPTION="Description 1";
	public static final String VALID_EVENT_DURATION="Duration 1";
	public static final String VALID_EVENT_EVENTTYPE="Type 1";
	public static final String VALID_EVENT_PLACE="Place 1";
	public static final int VALID_EVENT_SEATSAVAILABLE=111;

	/**
	 * Method that executes before every test method in JUnit test case
	 *
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		event = new Event();
		event.setEventId(VALID_EVENT_ID);
		event.setName(VALID_EVENT_NAME);
		event.setDescription(VALID_EVENT_DESCRIPTION);
		event.setDuration(VALID_EVENT_DURATION);
		event.setEventType(VALID_EVENT_EVENTTYPE);
		event.setPlace(VALID_EVENT_PLACE);
		event.setSeatsAvailable(VALID_EVENT_SEATSAVAILABLE);
	}

	/**
	 * Method that executes after every test method
	 *
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		event = null;
	}

	/**
	 * Test copy constructor
	 */
	@Test
	public void testEventEvent() {
		Event eventCopy = new Event(event);
		assertEquals(event, eventCopy);
	}


	@Test
	public void testGetName() {
		assertEquals(VALID_EVENT_NAME,event.getName());
	}

	@Test
	public void testSetName() {
		// Correct parameter with minimum length
		String name = returnStr(Constantes.MIN_EVENT_NAME);
		event.setName(name);
		assertEquals(name, event.getName());

		// Correct parameter with maximum length
		name = returnStr(Constantes.MAX_EVENT_NAME);
		event.setName(name);
		assertEquals(name, event.getName());

		// Incorrect parameter with length below the minimum
		name = returnStr(Constantes.MIN_EVENT_NAME - 1);
		failParameter(name, "SetName");

		// Incorrect parameter with length above the maximum
		name = returnStr(Constantes.MAX_EVENT_NAME + 1);
		failParameter(name, "SetName");

		// Incorrect null parameter
		name = null;
		failParameter(name, "SetName");
	}

	@Test
	public void testGetDescription() {
		assertEquals(VALID_EVENT_DESCRIPTION, event.getDescription());
	}

	@Test
	public void testSetDescription() {
		// Correct parameter with minimum length
		String description = returnStr(Constantes.MIN_DESCRIPTION);
		event.setDescription(description);
		assertEquals(description, event.getDescription());

		// Correct parameter with maximum length
		description = returnStr(Constantes.MAX_DESCRIPTION);
		event.setDescription(description);
		assertEquals(description, event.getDescription());

		// Incorrect parameter with length below the minimum
		description = returnStr(Constantes.MIN_DESCRIPTION - 1);
		failParameter(description, "SetDescription");

		// Incorrect parameter with length above the maximum
		description = returnStr(Constantes.MAX_DESCRIPTION + 1);
		failParameter(description, "SetDescription");

		// Incorrect null parameter
		description = null;
		failParameter(description, "SetDescription");
	}

	@Test
	public void testGetPlace() {
		assertEquals(VALID_EVENT_PLACE,event.getPlace());
	}

	@Test
	public void testSetPlace() {
		// Correct parameter with minimum length
		String place = returnStr(Constantes.MIN_PLACE);
		event.setPlace(place);
		assertEquals(place, event.getPlace());

		// Correct parameter with maximum length
		place = returnStr(Constantes.MAX_PLACE);
		event.setPlace(place);
		assertEquals(place, event.getPlace());

		// Incorrect parameter with length below the minimum
		place = returnStr(Constantes.MIN_PLACE - 1);
		failParameter(place, "SetPlace");

		// Incorrect parameter with length above the maximum
		place = returnStr(Constantes.MAX_PLACE + 1);
		failParameter(place, "SetPlace");

		// Incorrect null parameter
		place = null;
		failParameter(place, "SetPlace");
	}

	@Test
	public void testGetDuration() {
		assertEquals(VALID_EVENT_DURATION,event.getDuration());
	}

	@Test
	public void testSetDuration() {
		// Correct parameter with minimum length
		String duration = returnStr(Constantes.MIN_DURATION);
		event.setDuration(duration);
		assertEquals(duration, event.getDuration());

		// Correct parameter with maximum length
		duration = returnStr(Constantes.MAX_DURATION);
		event.setDuration(duration);
		assertEquals(duration, event.getDuration());

		// Incorrect parameter with length below the minimum
		duration = returnStr(Constantes.MIN_DURATION - 1);
		failParameter(duration, "SetDuration");

		// Incorrect parameter with length above the maximum
		duration = returnStr(Constantes.MAX_DURATION + 1);
		failParameter(duration, "SetDuration");

		// Incorrect null parameter
		duration = null;
		failParameter(duration, "SetDuration");
	}

	@Test
	public void testGetEventType() {
		assertEquals(VALID_EVENT_EVENTTYPE,event.getEventType());
	}

	@Test
	public void testSetEventType() {
		// Correct parameter with minimum length
		String eventType = returnStr(Constantes.MIN_EVENT_TYPE);
		event.setEventType(eventType);
		assertEquals(eventType, event.getEventType());

		// Correct parameter with maximum length
		eventType = returnStr(Constantes.MAX_EVENT_TYPE);
		event.setEventType(eventType);
		assertEquals(eventType, event.getEventType());

		// Incorrect parameter with length below the minimum
		eventType = returnStr(Constantes.MIN_EVENT_TYPE - 1);
		failParameter(eventType, "SetEventType");

		// Incorrect parameter with length above the maximum
		eventType = returnStr(Constantes.MAX_EVENT_TYPE + 1);
		failParameter(eventType, "SetEventType");

		// Incorrect null parameter
		eventType = null;
		failParameter(eventType, "SetEventType");
	}

	@Test
	public void testGetSeatsAvailable() {
		assertEquals(VALID_EVENT_SEATSAVAILABLE,event.getSeatsAvailable());
	}

	@Test
	public void testSetSeatsAvailable() {
		// Correct 0 seats
		event.setSeatsAvailable(Constantes.MIN_SEATS);
		assertEquals(0, event.getSeatsAvailable());

		// Correct seats>0
		event.setSeatsAvailable(Constantes.MIN_SEATS + 1);
		assertEquals(1, event.getSeatsAvailable());

		// Incorrect
		try {
			event.setSeatsAvailable(Constantes.MIN_SEATS - 1);
			fail("No ha saltado la excepcion de seatsAvailable");
		} catch (FERSGenericException e) {
			// OK
		}
	}

	@Test
	public void testGetEventId() {
		assertEquals(VALID_EVENT_ID,event.getEventId());
	}

	/**
	 * Test setEventId method
	 */
	@Test
	public void testSetEventId() {

	}

	private void failParameter(String str, String method) {
		try {
			switch (method) {
			case "SetName":
				event.setName(str);
				break;
			case "SetDescription":
				event.setDescription(str);
				break;
			case "SetPlace":
				event.setPlace(str);
				break;
			case "SetDuration":
				event.setDuration(str);
				break;
			case "SetEventType":
				event.setEventType(str);
				break;
			}
			fail("No lanza excepcion en metodo " + method);
		} catch (FERSGenericException e) {
			// OK
		}
	}

	private String returnStr(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str = str + "a";
		}
		return str;
	}
}
