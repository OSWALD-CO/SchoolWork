/*
 * Clayton Oswald
 * 08.04.2019
 * Bellevue Universiy
 * The purpose of this assignment is to create 4 different classes that groups a companies by types and subtypes.
 * Division.java
 */

public abstract class Division {
	protected String DivisionName;



	protected String AccountNumber;

	public Division(String DivisionName, String AccountNumber) {

		super();
		this.DivisionName = DivisionName;
		this.AccountNumber = AccountNumber;
	}

	abstract String display();

}

