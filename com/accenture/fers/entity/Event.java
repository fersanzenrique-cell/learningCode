package com.accenture.fers.entity;

import com.accenture.fers.exceptions.FERSGenericException;
import com.accenture.fers.utils.Constantes;
import com.accenture.fers.utils.Validador;

/**
* @author Emilio Robles César
*
* @version 1.0
*
* @since 11 diciembre 2017
*
* Entidad People
*
*/

public class Event {

	private int eventId;
	private String name;
	private String description;
	private String place;
	private String duration;
	private String eventType;
	private int seatsAvailable;

	//Constructor vacío
	public Event() {

	}

	//Constructor copia
	public Event(Event event) {
		if (event != null) {
			this.eventId = event.eventId;
			this.name = event.name;
			this.description = event.description;
			this.place = event.place;
			this.duration = event.duration;
			this.eventType = event.eventType;
			this.seatsAvailable = event.seatsAvailable;
		}
		else{
			throw new FERSGenericException(Constantes.ERM_028);
		}
	}

	//Getters y Setters
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (Validador.validarLongitud(name, Constantes.MIN_EVENT_NAME, Constantes.MAX_EVENT_NAME)) {
			this.name = name;
		} else {
			throw new FERSGenericException(Constantes.ERM_018);
		}

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (Validador.validarLongitud(description, Constantes.MIN_DESCRIPTION, Constantes.MAX_DESCRIPTION)) {
			this.description = description;
		} else {
			throw new FERSGenericException(Constantes.ERM_019);
		}
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		if (Validador.validarLongitud(place, Constantes.MIN_PLACE, Constantes.MAX_PLACE)) {
			this.place = place;
		} else {
			throw new FERSGenericException(Constantes.ERM_020);
		}

	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		if (Validador.validarLongitud(duration, Constantes.MIN_DURATION, Constantes.MAX_DURATION)) {
			this.duration = duration;
		} else {
			throw new FERSGenericException(Constantes.ERM_021);
		}
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventtype) {
		if (Validador.validarLongitud(eventtype, Constantes.MIN_EVENT_TYPE, Constantes.MAX_EVENT_TYPE)) {
			this.eventType = eventtype;
		} else {
			throw new FERSGenericException(Constantes.ERM_022);
		}
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		if (seatsAvailable >= Constantes.MIN_SEATS) {
			this.seatsAvailable = seatsAvailable;
		} else {
			throw new FERSGenericException(Constantes.ERM_023);
		}
	}

	@Override
	public String toString() {
		return this.eventId + ", " + this.description + ", " + this.duration
				+ ", " + this.place + " --- ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + eventId;
		result = prime * result
				+ ((eventType == null) ? 0 : eventType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + seatsAvailable;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (eventId != other.eventId)
			return false;
		if (eventType == null) {
			if (other.eventType != null)
				return false;
		} else if (!eventType.equals(other.eventType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (seatsAvailable != other.seatsAvailable)
			return false;
		return true;
	}
}