package com.accenture.fers.dao;


import com.accenture.fers.entity.Visitor;
import com.accenture.fers.exceptions.FERSGenericException;
/**
 * VISITORDAO INTERFACE
 * No hay atributos en una Interface, podría haber constantes
 * Todas los métodos son abstractos, por tanto todas las que hereden de ella
 * tendrán que implementar todos los métodos
 *
 * @author Emilio Robles
 *
 * @version 1.0
 */
public interface IVisitorDAO {
	/**
	 * DAO method to loading visitor details into VISITOR table in database
	 * and validating about existing visitor details.
	 *
	 * @param visitor
	 * @return true(success) /false (fail)
	 * @throws FERSGenericException
	 *
	 */
	 void save(Visitor visitor);

	/**
	 * DAO method to update visitor with additional information
	 *
	 * @param visitor
	 * @return number of rows affected by the query
	 * @throws FERSGenericException
	 */
	int updateVisitor(Visitor visitor);


	/**
	 *  DAO method to find a particular visitor
	 * @param userName
	 * @throws FERSGenericException
	 *
	 */

	Visitor findByUserName(String userName);
}
