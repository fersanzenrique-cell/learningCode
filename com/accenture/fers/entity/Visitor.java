package com.accenture.fers.entity;

import java.util.HashSet;
import java.util.Set;

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
* Entidad Visitor que hereda de People
*/

public class Visitor extends People {

	private int visitorId;
	private String userName;
	private String password;
	private Set<Event> registeredEvents = new HashSet<Event>();

	//Constructor vacío
	public Visitor() {

	}

	//Constructor copia
	public Visitor(Visitor visitor) {
		super(visitor);
		if (visitor != null){
			this.password = visitor.password;
			this.visitorId = visitor.visitorId;
			this.userName = visitor.userName;
			this.registeredEvents = visitor.registeredEvents;
		} else {
			throw new FERSGenericException(Constantes.ERM_028);
		}

	}

	//Getters y Setters
	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public Set<Event> getRegisteredEvents() {
		return this.registeredEvents;
	}

	public void setRegisteredEvents(Set<Event> resgisteredEvents) {
		this.registeredEvents = resgisteredEvents;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (Validador.validarLongitud(userName, Constantes.MIN_USERNAME, Constantes.MAX_USERNAME)) {
			this.userName = userName;
		} else {
			throw new FERSGenericException(Constantes.ERM_013);
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (Validador.validarLongitud(password, Constantes.MIN_PASSWORD, Constantes.MAX_PASSWORD)) {
			this.password = password;
		} else {
			throw new FERSGenericException(Constantes.ERM_014);
		}
	}

	//Equals y Hashcode para comparar objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((registeredEvents == null) ? 0 : registeredEvents.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + visitorId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visitor other = (Visitor) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (registeredEvents == null) {
			if (other.registeredEvents != null)
				return false;
		} else if (!registeredEvents.equals(other.registeredEvents))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (visitorId != other.visitorId)
			return false;
		return true;
	}
}
