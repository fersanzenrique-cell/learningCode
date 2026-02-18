package com.accenture.fers.dao;

import java.util.List;

import com.accenture.fers.entity.Event;
import com.accenture.fers.exceptions.FERSGenericException;

/**
 * EVENTDAO INTERFACE
 * No hay atributos en una Interface, podría haber constantes
 * Todas los métodos son abstractos, por tanto todas las que hereden de ella
 * tendrán que implementar todos los métodos
 *
 * @author Emilio Robles
 *
 * @version 1.0
 */
public interface IEventDAO {

	/**
	 * DAO for displaying all the FESTIVALEVENTS in EVENT TABLE
	 * @return collection of all Events
	 * @throws FERSGenericException
	 */
	List<Event> findAll();

	/**
	 * This method fetch the event on basis of eventId
	 * @param eventId
	 * @return event found
	 * @throws FERSGenericException
	 */
	Event findOne(int eventid);

	/**
	 * This method update an event
	 * @param event
	 * @throws FERSGenericException
	 */
	void save(Event event);
}
