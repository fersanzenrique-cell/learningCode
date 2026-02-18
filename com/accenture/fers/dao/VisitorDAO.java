package com.accenture.fers.dao;

import java.util.ArrayList;
import java.util.List;

import com.accenture.fers.entity.Visitor;

/**
*
* VisitortDAO
*
* @author Emilio Robles
*
* @version 1.0
*/
public class VisitorDAO implements IVisitorDAO{

	private static List<Visitor> visitors = new ArrayList<>();
	private static int lastID = 2;
	static {
		Visitor visitor = new Visitor();
		visitor.setVisitorId(1);
		visitor.setUserName("rebeca");
		visitor.setPassword("qwerty");
		visitor.setFirstName("Rebeca");
		visitor.setLastName("Velasco González");
		visitor.setEmail("rebeca@tecnilogica.com");
		visitor.setDni("22.222.222-J");
		visitor.setPhoneNumber("1122334455");
		visitor.setAddress("La Finca 1 Edificio 10");
		visitors.add(visitor);

		Visitor visitor2 = new Visitor();
		visitor2.setVisitorId(2);
		visitor2.setUserName("erobles");
		visitor2.setPassword("qwerty");
		visitor2.setFirstName("Emilio");
		visitor2.setLastName("Robles");
		visitor2.setEmail("erobles@accenture.com");
		visitor2.setDni("11.111.111-H");
		visitor2.setPhoneNumber("+1122334455");
		visitor2.setAddress("La Finca 1 Edificio 2");
		visitors.add(visitor2);
	}

	public VisitorDAO() {

	}

	/**
	 * This method adds a new visitor to database if it doesn't already exists
	 *
	 * @param Visitor to add
	 * @return Boolean value to check if the operation was succeed
	 */
	@Override
	public void save(Visitor visitor) {
		lastID++;
		visitor.setVisitorId(lastID);
		visitors.add(visitor);

	}

	/**
	 * This method updates all the visitor data in the database
	 *
	 * @param Visitor object that has to be updated
	 * @return Integer value to check if operation succeed
	 */
	@Override
	public int updateVisitor(Visitor visitor) {
		int update = 0;
		for (Visitor visitor2 : visitors) {
			if (visitor2.getVisitorId() == visitor.getVisitorId()){
				visitor2.setAddress(visitor.getAddress());
				visitor2.setEmail(visitor.getEmail());
				visitor2.setFirstName(visitor.getFirstName());
				visitor2.setLastName(visitor.getLastName());
				visitor2.setPhoneNumber(visitor.getPhoneNumber());
				visitor2.setDni(visitor.getDni());
				visitor2.setPassword(visitor.getPassword());
				visitor2.setRegisteredEvents(visitor.getRegisteredEvents());
				update = 1;
			}
		}
		return update;
	}

	/**
	 * This method looks for a user in the database
	 *
	 * @param User's name
	 * @return Visitor object if it already exists, null value otherwise
	 */

	@Override
	public Visitor findByUserName(String userName) {
		Visitor visitorFound = null;
		for (Visitor visitorF : visitors) {
			if (visitorF.getUserName().equals(userName)){
				visitorFound = visitorF;
			}
		}
		return visitorFound;
	}
}
