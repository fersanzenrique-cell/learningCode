package com.accenture.fers.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*
* @author Emilio Robles César
*
* @version 1.0
*
* @since 11 diciembre 2017
*
* Validadores
*
*/

public class Validador {

	/**
	 * Valida las longitudes de los campos
	 *
	 * @param campo
	 *            campo que se valida
	 * @param min
	 *            mínima longitud del campo
	  * @param min
	 *            máxima longitud del campo
	 *
	 * @return un boolean para saber si el campo se debe aceptar entre el max y el min pasados
	 */
	public static boolean validarLongitud(String campo, int min,int max) {
		boolean retorno = false;

		if (campo != null && campo.length() >= min && campo.length() <=max){
			retorno=true;
		}

		return retorno;

	}

	/**
	 * Validat el formato del email
	 *
	 * @param email
	 *
	 *
	 * @return un boolean para saber si el formato del email es aceptable
	 */
	public static boolean validarEmail(String email) {
		boolean retorno = false;

		if (validarLongitud(email, Constantes.MIN_EMAIL, Constantes.MAX_EMAIL)){

			//Vemos cuántas arrobas tiene el email
			String [] dividirPorArrobas = email.split("@");

			//Si hay dos trozos es que hay una sola arroba
			if (dividirPorArrobas.length == 2){
				String local = dividirPorArrobas[0];
				String dominio = dividirPorArrobas[1];

				//Local y Dominio tiene que contener al menos un carácter
				if (local.length() > 0 && dominio.length() > 0){

					//El último carácter de local no puede ser un punto
					if(local.charAt(local.length()-1) != '.'){

						// Comprobamos que la seccion local no contenga ()[]\;:,<> o espacio
						for (int i = 0; i < local.length(); i++){
							if (Constantes.CARACTERES_PROHIBIDOS.indexOf(local.charAt(i)) == -1){
								retorno = true;
							}else {
								retorno = false;
								break;
							}
						}
					}
				}
			}
		}
		return retorno;
	}

	/**
	 * Valida el formato del teléfono
	 *
	 * @param telefono
	 *
	 *
	 * @return un boolean para saber si el formato del teléfono está bien
	 */
	public static boolean validarTelefono(String telefono) {
		boolean retorno = false;

		if (validarLongitud(telefono, Constantes.MIN_PHONE, Constantes.MAX_PHONE)){

			char primerCaracter = telefono.charAt(0);

			//Miramos si el primer carácter es + o número
			if (primerCaracter == '+' || Character.isDigit(primerCaracter)){

				//Miramos si el resto son espacios o números
				for (int i = 1; i < telefono.length(); i++) {
					if (telefono.charAt(i) == ' ' || Character.isDigit(telefono.charAt(i))){
						retorno = true;
					} else {
						retorno = false;
						break;
					}
				}
			}
		}

		return retorno;

	}

	/**
	 * Valida el formato del DNI
	 *
	 * @param dni
	 *
	 *
	 * @return un boolean para saber si el formato del DNI es aceptable
	 */
	public static boolean validarDni(String dni) {
		boolean retorno = false;

		if (validarLongitud(dni, Constantes.MIN_DNI, Constantes.MAX_DNI)){
			if (Character.isDigit(dni.charAt(0)) &&
				Character.isDigit(dni.charAt(1)) &&
				Character.isDigit(dni.charAt(3)) &&
				Character.isDigit(dni.charAt(4)) &&
				Character.isDigit(dni.charAt(5)) &&
				Character.isDigit(dni.charAt(7)) &&
				Character.isDigit(dni.charAt(8)) &&
				Character.isDigit(dni.charAt(9)) &&
				dni.charAt(2) == '.' &&
				dni.charAt(6) == '.' &&
				dni.charAt(10) == '-' &&
				Character.isLetter(dni.charAt(11))) {
				retorno = true;
			} else {
				retorno = false;
			}
		}

		if (retorno){
			String unirNumeros = dni.substring(0, 2) + dni.substring(3, 6) + dni.substring(7, 10);
			int dniNumero = Integer.parseInt(unirNumeros);
			int resto = dniNumero % 23;

			if (dni.charAt(11) == Constantes.LETRAS_DNI.charAt(resto)) {
				retorno = true;
			} else {
				retorno = false;
			}
		}
		return retorno;
	}

	/**
	 * Validates the email format using regular expressions
	 *
	 * @param email
	 *            a email with a correct length
	 *
	 * @return a boolean to know if the format is also acceptable
	 */
	public static boolean validateEmail(String email) {
		Pattern pat = Pattern
				.compile("^[a-z0-9-_]+(\\.[a-z0-9-_]+)*@[a-z0-9-_]+(\\.[a-z0-9-_]+)*$");
		Matcher mat = pat.matcher(email);

		if (mat.find()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Validates the phone number format using regular expressions
	 *
	 * @param phoneNumber
	 *            a phone number with a correct length
	 *
	 * @return a boolean to know if the format is also acceptable
	 */
	public static boolean validatePhoneNumber(String phoneNumber) {
		Pattern pat = Pattern.compile("^\\+?([0-9]|\\s)+$");
		Matcher mat = pat.matcher(phoneNumber);

		if (mat.find()) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Validates the DNI format and last letter with math operations
	 *
	 * @param dni
	 *            a DNI with a correct length
	 *
	 * @return a boolean to know if the format and last letter are also
	 *         acceptable
	 */
	public static boolean validateDni(String dni) {
		Pattern pat = Pattern
				.compile("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}-[A-Z]{1}");
		Matcher mat = pat.matcher(dni);
		boolean valid = false;
		String[] parts;
		// We create a data structure that stores all the possible results to
		// compare later
		String[] moduleResults = { "T", "R", "W", "A", "G", "M", "Y", "F", "P",
				"D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C",
				"K", "E" };
		// Auxiliary variables to manipulate data and extract the letter
		String letter;
		StringBuffer numericPart;
		int dniNumber;
		int operationResult;

		if (mat.find()) {
			// If the format is correct, we proceed to evaluate the letter
			parts = dni.split("\\.|-");
			// We assume that the 4th part of the data is the letter according
			// to the format
			letter = parts[3];
			numericPart = new StringBuffer();
			numericPart.append(parts[0] + parts[1] + parts[2]);
			dniNumber = Integer.valueOf(numericPart.toString());
			operationResult = dniNumber % 23;
			// Finally, we must try the letter to be sure they are the same
			if (letter.equals(moduleResults[operationResult])) {
				valid = true;
			}
		}
		return valid;
	}
}

