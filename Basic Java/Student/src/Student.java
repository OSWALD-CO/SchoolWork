/*
 * Clayton Oswald
 * 07.28.2019
 * Bellevue Universiy
 * The purpose of this assignment is to get Students first last name and ID from ClassRoster.Java.
 * Student.java
 */

public class Student {

	   private String firstName;
	   private String lastName;
	   private Integer studentID;

	   public Student() {
	      
	   }

	   public Student(String firstName, String lastName, Integer studentID) {
	       FirstName(firstName);
	       LastName(lastName);
	       StudentID(studentID);
	   }
	  
	   public String FirstName() {
	       return firstName;
	   }
	   
	   public void FirstName(String firstName) {
	       this.firstName = firstName;
	   }
	   
	   public String LastName() {
	       return lastName;
	   }
	   
	   public void LastName(String lastName) {
	       this.lastName = lastName;
	   }
	   
	   public Integer StudentID() {
	       return studentID;
	   }
	   
	   public void StudentID(Integer studentID) {
	       this.studentID = studentID;
	   }
	            
	}