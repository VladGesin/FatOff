
/**
 * This class represent any customer which will be created in the Fat_Off project
 * 
 * @author Fat_Off Development Team
 *@version 1.0
 */

import java.util.*;

public class Customer extends Person {
	
	private String gender;
	private HashMap<Integer,Session> sessionsMap;
	private HashMap<Integer, Measures> measuresMap;
	private IntroductoryMeeting pesronalInterview;

	/**
	 * @param firstName the customers' first name
	 * @param lastName the customers' last name
	 * @param phoneNumber the customers' phone number
	 * @param emailAddress the customers' email address
	 * @param id the customers' is
	 * @param gender the customers' gender
	 */
	public Customer(String firstName, String lastName, String phoneNumber, 
							String emailAddress, String id, String gender) {
		// super class constructor
		super(firstName, lastName, phoneNumber, emailAddress, id);
		//initialization of the local private variable
		this.gender = gender;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the sessionsMap
	 */
	public HashMap<Integer,Session> getSessionsMap() {
		return sessionsMap;
	}

	/**
	 * @param sessionsMap the sessionsMap to set
	 */
	public void setSessionsMap(HashMap<Integer,Session> sessionsMap) {
		this.sessionsMap = sessionsMap;
	}

	/**
	 * @return the measuresMap
	 */
	public HashMap<Integer, Measures> getMeasuresMap() {
		return measuresMap;
	}

	/**
	 * @param measuresMap the measuresMap to set
	 */
	public void setMeasuresMap(HashMap<Integer, Measures> measuresMap) {
		this.measuresMap = measuresMap;
	}

	/**
	 * @return the pesronalInterview
	 */
	public IntroductoryMeeting getPesronalInterview() {
		return pesronalInterview;
	}

	/**
	 * @param pesronalInterview the pesronalInterview to set
	 */
	public void setPesronalInterview(IntroductoryMeeting pesronalInterview) {
		this.pesronalInterview = pesronalInterview;
	}
	/**
	 * @return a string representation of the customer object
	 */
	@Override
	public String toString() {
		return "Customer [" + super.toString() + "gender=" + gender + "]";
	}

}
