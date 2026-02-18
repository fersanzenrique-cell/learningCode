package com.accenture.fers.utils;

/**
*
* @author Emilio Robles César
*
* @version 1.0
*
* @since 11 diciembre 2017
*
* Clase con las constantes de la práctica
*/

public class Constantes {

	// Máximos y Mínimos de las longitudes de los campos

	public static final int MIN_USERNAME = 6;
	public static final int MAX_USERNAME = 12;

	public static final int MIN_PASSWORD = 6;
	public static final int MAX_PASSWORD = 15;

	public static final int MIN_FIRST_NAME = 1;
	public static final int MAX_FIRST_NAME = 30;

	public static final int MIN_LAST_NAME = 1;
	public static final int MAX_LAST_NAME = 30;

	public static final int MIN_EMAIL = 3;
	public static final int MAX_EMAIL = 200;
	public static final String CARACTERES_PROHIBIDOS = "()[]\\;:,<> ";

	public static final int MIN_PHONE = 10;
	public static final int MAX_PHONE = 20;

	public static final int MIN_ADDRESS = 0;
	public static final int MAX_ADDRESS = 30;

	public static final int MIN_DNI = 12;
	public static final int MAX_DNI = 12;
	public static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

	public static final int MIN_EVENT_NAME = 1;
	public static final int MAX_EVENT_NAME = 45;

	public static final int MIN_DESCRIPTION = 1;
	public static final int MAX_DESCRIPTION = 45;

	public static final int MIN_PLACE = 1;
	public static final int MAX_PLACE = 45;

	public static final int MIN_DURATION = 1;
	public static final int MAX_DURATION = 45;

	public static final int MIN_EVENT_TYPE = 1;
	public static final int MAX_EVENT_TYPE = 45;

	public static final int MIN_SEATS = 0;

	// Mensajes de información

	public static final String MSG_001 = "User Registered Successfully!!!";
	public static final String MSG_002 = "User details successfully Updated";

	// Mensajes de error

	public static final String ERM_001 = "Please provide FirstName";
	public static final String ERM_002 = "Please provide LastName";
	public static final String ERM_003 = "Please provide UserName";
	public static final String ERM_004 = "Please provide password";
	public static final String ERM_005 = "Please provide email";
	public static final String ERM_006 = "Please provide confirm password";
	public static final String ERM_007 = "Please provide phone number";
	public static final String ERM_008 = "Please provide dni";
	public static final String ERM_009 = "Password and confirm password must be same !!";
	public static final String ERM_010 = "Invalid Phone number";
	public static final String ERM_011 = "Invalid Email ID";
	public static final String ERM_012 = "Invalid DNI";
	public static final String ERM_013 = "Invalid UserName";
	public static final String ERM_014 = "Invalid Password";
	public static final String ERM_015 = "Invalid Firstname";
	public static final String ERM_016 = "Invalid Lastname";
	public static final String ERM_017 = "Invalid Address";
	public static final String ERM_018 = "Invalid Event Name";
	public static final String ERM_019 = "Invalid Event Description";
	public static final String ERM_020 = "Invalid Event Place";
	public static final String ERM_021 = "Invalid Event Duration";
	public static final String ERM_022 = "Invalid Event Type";
	public static final String ERM_023 = "No available seats";
	public static final String ERM_024 = "Invalid Username/Password";
	public static final String ERM_025 = "USERNAME already exists. Please register again with different USERNAME";
	public static final String ERM_026 = "User already Registered for the EVENT!";
	public static final String ERM_027 = "Error in update...Please Check fields and retry";
	public static final String ERM_028 = "Invalid null";
	public static final String ERM_029 = "Current password is wrong";
	public static final String ERM_030 = "Current password can't be equal to New password";
}
