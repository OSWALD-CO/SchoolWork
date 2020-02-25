/*
 * Clayton Oswald
 * 08.04.2019
 * Bellevue Universiy
 * The purpose of this assignment is to create 4 different classes that groups a companies by types and subtypes.
 * UseDivision.java
 */

public class UseDivision {

public static void main(String[] args) {

	DomesticDivision Domestic1 = new DomesticDivision("Mid Division", "18503", "Scranton");
	DomesticDivision Domestic2 = new DomesticDivision("North Division", "03061", "Nashua");

	System.out.println("\nDomestic division results");
	System.out.println(Domestic1.display());
	System.out.println(Domestic2.display());

	InternationalDivision International1 = new InternationalDivision("Northwest Division", "75315946", "United Kingdom", "English");
	InternationalDivision International2 = new InternationalDivision("Slough Division", "95135782", "United Kingdom", "English");

	System.out.println("\n\n\n\nInternational Division results");
	System.out.println(International1.display());
	System.out.println(International2.display());
	}
}

