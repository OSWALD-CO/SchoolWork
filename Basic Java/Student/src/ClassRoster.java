/*
 * Clayton Oswald
 * 07.28.2019
 * Bellevue Universiy
 * The purpose of this assignment is to get Students first last name and ID to Student.java.
 * ClassRoster.java
 */

	import java.util.LinkedList;
	import java.util.ListIterator;

	public class ClassRoster {

	   public static void main(String[] args) {

	       LinkedList<Student> studentList = new LinkedList<Student>();

	       studentList.add(new Student("Lewis","HAMILTON",99));
	       studentList.add(new Student("Valtteri","BOTTAS",98));
	       studentList.add(new Student("Max","VERSTAPPEN",97));
	       studentList.add(new Student("Sebastian","VETTEL",96));
	       studentList.add(new Student("Charles","LECLERC",95));
	       studentList.add(new Student("Pierre","GASLY",94));
	       studentList.add(new Student("Carlos","SAINZ",93));
	       studentList.add(new Student("Daniil","KVYAT",92));
	       studentList.add(new Student("Kimi","RÄIKKÖNEN",91));
	       studentList.add(new Student("Lando","NORRIS",90));
	       studentList.add(new Student("Alexander","Albon",89));
	       studentList.add(new Student("Antonio","Giovinazzi",88));
	       studentList.add(new Student("Romain","Grosjean",87));
	       studentList.add(new Student("Nico","Hulkenberg",86));
	       studentList.add(new Student("Robert","Kubica",85));
	       studentList.add(new Student("Kevin","Magnussen",84));
	       studentList.add(new Student("Sergio","Perez",83));
	       studentList.add(new Student("Daniel","Ricciardo",82));
	       studentList.add(new Student("George","Russell",81));
	       studentList.add(new Student("Lance","Stroll",80));
	      
	       System.out.println("Linked List Content: ");
	       
	       System.out.println("==================================");
	       
	ListIterator<Student> listIterator = studentList.listIterator();
	
	while (listIterator.hasNext()) {
	   Student student =listIterator.next();
	System.out.println(student.FirstName() + "\t"+student.LastName()+"\t\t"+student.StudentID());
	}

		   System.out.println("\n\nLinked List Content in Reverse Order: ");
	
	       System.out.println("==================================");
	       
	ListIterator<Student> reverseIterator = studentList.listIterator(studentList.size());
	
	while (reverseIterator.hasPrevious()) {
	   Student student =reverseIterator.previous();
	System.out.println(student.FirstName() + "\t"+student.LastName()+"\t\t"+student.StudentID());
	}
	
	   }

	}