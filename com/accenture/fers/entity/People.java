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
public class People {

	private String address;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String dni;

	//Constructor vacío
	public People() {

	}

	//Constructor copia
	public People(People people) {
		if (people != null){
			this.address = people.address;
			this.firstName = people.firstName;
			this.lastName = people.lastName;
			this.email = people.email;
			this.phoneNumber = people.phoneNumber;
			this.dni = people.dni;
		} else {
			throw new FERSGenericException(Constantes.ERM_028);
		}
	}

	//Getters y Setters
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || Validador.validarLongitud(address, Constantes.MIN_ADDRESS,Constantes.MAX_ADDRESS)) {
			this.address = address;
		} else {
			throw new FERSGenericException(Constantes.ERM_017);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (Validador.validarLongitud(firstName, Constantes.MIN_FIRST_NAME, Constantes.MAX_FIRST_NAME)) {
			this.firstName = firstName;
		} else {
			throw new FERSGenericException(Constantes.ERM_015);
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (Validador.validarLongitud(lastName, Constantes.MIN_LAST_NAME, Constantes.MAX_LAST_NAME)) {
			this.lastName = lastName;
		} else {
			throw new FERSGenericException(Constantes.ERM_016);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (Validador.validarLongitud(email,Constantes.MIN_EMAIL, Constantes.MAX_EMAIL)
			&& Validador.validarEmail(email)){
			this.email = email;
		} else {
			throw new FERSGenericException(Constantes.ERM_011);
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (Validador.validarTelefono(phoneNumber)) {
			this.phoneNumber = phoneNumber;
		} else {
			throw new FERSGenericException(Constantes.ERM_010);
		}
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		if (Validador.validarLongitud(dni,Constantes.MIN_DNI, Constantes.MAX_DNI)
				&&  Validador.validarDni(dni)) {
			this.dni = dni;
		} else {
			throw new FERSGenericException(Constantes.ERM_012);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}

	//Equals y Hashcode para comparar objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
}