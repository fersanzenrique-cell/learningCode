package com.accenture.fers.test.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.function.Consumer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.accenture.fers.entity.Event;
import com.accenture.fers.exceptions.FERSGenericException;
import com.accenture.fers.utils.Constantes;

/**
 * Clase Test Event
 *
 * @author Emilio Robles
 *
 */
public class EventTest {
	/**
	 * Method that executes before every test method in JUnit test case
	 *
	 * @throws Exception
	 */
	Event evento = new Event();

	@Before
	public void setUp() throws Exception {

		evento.setEventId(1);
		evento.setName("C�diz - PSG");
		evento.setDescription("Partido de F�tbol");
		evento.setDuration("Dos Horas");
		evento.setEventType("Deportes");
		evento.setPlace("C�diz");
		evento.setSeatsAvailable(22000);
	}

	/**
	 * Method that executes after every test method
	 *
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		evento = null;
	}

	/**
	 * Test del constructor de copia
	 */
	@Test
	public void testEventEventPositivo() {
		Event copiaEvento = new Event(evento);
		assertEquals(evento, copiaEvento);
	}

	@Test
	public void testEventEventNegativo() {
		Consumer<Event> consumer = e -> new Event(e);
		assertFail(consumer, null, Constantes.ERM_028);
	}

	@Test
	public void testGetEventId() {
		assertEquals(1, evento.getEventId());
	}

	@Test
	public void testSetEventIdPositivo() {
		evento.setEventId(0);
		assertEquals(0,evento.getEventId());
	}

	@Test
	public void testGetName() {
		assertEquals("C�diz - PSG",evento.getName());
	}

	@Test
	public void testSetNamePositive() {

		//Caso de que longitud est� en el limite inferior
		evento.setName(cadenaString('a', Constantes.MIN_EVENT_NAME));
		assertEquals(cadenaString('a', Constantes.MIN_EVENT_NAME), evento.getName());

		//Caso de que longitud est� en el limite superior
		evento.setName(cadenaString('a', Constantes.MAX_EVENT_NAME));
		assertEquals(cadenaString('a', Constantes.MAX_EVENT_NAME), evento.getName());
	}

	@Test
	public void testSetNameNegative() {

		Consumer<String> consumer = e->evento.setName(e);

		//Caso la longitud inferior al minimo
		assertFail(consumer, "", Constantes.ERM_018);

		//Caso la longitud superior al maximo
		assertFail(consumer, cadenaString('a', Constantes.MAX_EVENT_NAME + 1), Constantes.ERM_018);

		//Caso null
		assertFail(consumer, null, Constantes.ERM_018);

	}

	@Test
	public void testGetDescription() {
		assertEquals("Partido de F�tbol", evento.getDescription());
	}

	@Test
	public void testSetDescriptionPositive() {
		//Caso de que descripci�n est� en el limite inferior
		evento.setDescription(cadenaString('a', Constantes.MIN_DESCRIPTION));
		assertEquals(cadenaString('a', Constantes.MIN_DESCRIPTION), evento.getDescription());

		//Caso de que descripci�n est� en el limite superior
		evento.setDescription(cadenaString('a', Constantes.MAX_DESCRIPTION));
		assertEquals(cadenaString('a', Constantes.MAX_DESCRIPTION), evento.getDescription());
	}

	@Test
	public void testSetDescriptionNegative() {
		Consumer<String> consumer = e->evento.setDescription(e);

		//Caso la longitud inferior al minimo
		assertFail(consumer, "", Constantes.ERM_019);

		//Caso la longitud superior al maximo
		assertFail(consumer, cadenaString('a', Constantes.MAX_DESCRIPTION + 1), Constantes.ERM_019);

		//Caso null
		assertFail(consumer, null, Constantes.ERM_019);
	}

	@Test
	public void testGetPlace() {
		assertEquals("C�diz", evento.getPlace());
	}

	@Test
	public void testSetPlacePositive() {
		//Caso de que el lugar est� en el limite inferior
		evento.setPlace(cadenaString('a', Constantes.MIN_PLACE));
		assertEquals(cadenaString('a', Constantes.MIN_PLACE), evento.getPlace());

		//Caso de que el lugar est� en el limite superior
		evento.setPlace(cadenaString('a', Constantes.MAX_PLACE));
		assertEquals(cadenaString('a', Constantes.MAX_PLACE), evento.getPlace());
	}

	@Test
	public void testSetPlaceNegative() {
		Consumer<String> consumer = e->evento.setPlace(e);

		//Caso la longitud inferior al minimo
		assertFail(consumer, "", Constantes.ERM_020);

		//Caso la longitud superior al maximo
		assertFail(consumer, cadenaString('a', Constantes.MAX_PLACE + 1), Constantes.ERM_020);

		//Caso null
		assertFail(consumer, null, Constantes.ERM_020);
	}
	@Test
	public void testGetDuration() {
		assertEquals("Dos Horas",evento.getDuration());
	}

	@Test
	public void testSetDurationPositive() {
		//Caso de que duraci�n est� en el limite inferior
		evento.setDuration(cadenaString('a', Constantes.MIN_DURATION));
		assertEquals(cadenaString('a', Constantes.MIN_DURATION), evento.getDuration());

		//Caso de que duraci�n est� en el limite superior
		evento.setDuration(cadenaString('a', Constantes.MAX_DURATION));
		assertEquals(cadenaString('a', Constantes.MAX_DURATION), evento.getDuration());
	}

	@Test
	public void testSetDurationNegative() {
		Consumer<String> consumer = e->evento.setDuration(e);

		//Caso la longitud inferior al minimo
		assertFail(consumer, "", Constantes.ERM_021);

		//Caso la longitud superior al maximo
		assertFail(consumer, cadenaString('a', Constantes.MAX_DURATION + 1), Constantes.ERM_021);

		//Caso null
		assertFail(consumer, null, Constantes.ERM_021);
	}

	@Test
	public void testGetEventType() {
		assertEquals("Deportes",evento.getEventType());
	}

	@Test
	public void testSetEventTypePositive() {
		//Caso de que el tipo de evento est� en el limite inferior
		evento.setEventType(cadenaString('a', Constantes.MIN_EVENT_TYPE));
		assertEquals(cadenaString('a', Constantes.MIN_EVENT_TYPE), evento.getEventType());

		//Caso de que el tipo de evento est� en el limite superior
		evento.setEventType(cadenaString('a', Constantes.MAX_EVENT_TYPE));
		assertEquals(cadenaString('a', Constantes.MAX_EVENT_TYPE), evento.getEventType());
	}

	@Test
	public void testSetEventTypeNegative() {
		Consumer<String> consumer = e->evento.setEventType(e);

		//Caso la longitud inferior al minimo
		assertFail(consumer, "", Constantes.ERM_022);

		//Caso la longitud superior al maximo
		assertFail(consumer, cadenaString('a', Constantes.MAX_EVENT_TYPE + 1), Constantes.ERM_022);

		//Caso null
		assertFail(consumer, null, Constantes.ERM_022);
	}

	@Test
	public void testGetSeatsAvailable() {
		assertEquals(22000,evento.getSeatsAvailable());
	}

	@Test
	public void testSetSeatsAvailablePositive() {
		// Cero asientos es correcto
		evento.setSeatsAvailable(Constantes.MIN_SEATS);
		assertEquals(0, evento.getSeatsAvailable());

		// Asientos > 0
		evento.setSeatsAvailable(Constantes.MIN_SEATS + 1);
		assertEquals(1, evento.getSeatsAvailable());
	}

	@Test
	public void testSetSeatsAvailableNegative() {
		//No se pueden poner tipos primitivos, no nos vale int
		Consumer<Integer> consumer = e->evento.setSeatsAvailable(e);

		//Caso de asientos < 0
		assertFail(consumer, Constantes.MIN_SEATS - 1, Constantes.ERM_023);
	}

	/**
	 * Test setEventId method
	 */
	@Test
	public void testSetEventId() {

	}

	/**
	 * Metodo que genera una cadena de String de la longitud deseada
	 * @param letra Letra que forma el String
	 * @param longitud Longitud de la cadena
	 * @return cadena Cadena de String deseada
	 */

	private String cadenaString(char letra, int longitud) {
		String cadena = "";
		for (int i = 0; i < longitud; i++) {
			cadena = cadena + String.valueOf(letra);
		}
		return cadena;
	}

	/**
	 * Metodo que hace una plantilla mediante un consumer para los casos no validos
	 *
	 * @param consumer Variable donde guardamos el metodo
	 * @param dato Dato a validar
	 * @param message Mensaje de error que debe salir en la excepcion
	 */

	private <T> void assertFail(Consumer<T> consumer, T dato, String message) {
		try {
			consumer.accept(dato);
			fail();

		} catch (FERSGenericException e) {
			assertEquals(message, e.getMessage());
		}
	}
}