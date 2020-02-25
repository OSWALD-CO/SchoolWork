/*
 * Clayton Oswald
 * 08.04.2019
 * Bellevue Universiy
 * The purpose of this assignment is to create 4 different classes that groups a companies by types and subtypes.
 * InternationalDivision.java
 */

public class InternationalDivision extends Division{

	private String CountryName;
	private String LanguageSpoken;

	public InternationalDivision(String DivisionName, String AccountNumber,String CountryName, String LanguageSpoken) {

		super(DivisionName, AccountNumber);

		this.CountryName = CountryName;

		this.LanguageSpoken = LanguageSpoken;

	}

@Override

public String display() {

	return "\nDivision Name= " + DivisionName +"\n     Account Number= " + AccountNumber+ "\n     Country Name= " + CountryName + "\n     Language Spoken= " + LanguageSpoken;
	}
}