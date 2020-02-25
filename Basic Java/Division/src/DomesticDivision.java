/*
 * Clayton Oswald
 * 08.04.2019
 * Bellevue Universiy
 * The purpose of this assignment is to create 4 different classes that groups a companies by types and subtypes.
 * DomesticDivision.java
 */

public class DomesticDivision extends Division {

	private String stateName;

	public DomesticDivision(String DivisionName, String AccountNumber,



			String StateName) {

			super(DivisionName, AccountNumber);
			this.stateName = StateName;
	}

@Override

public String display() {

	return "\nDivision Name= " + DivisionName +"\n     Account Number= " + AccountNumber+ "\n     State Name= " + stateName; 
	}
}