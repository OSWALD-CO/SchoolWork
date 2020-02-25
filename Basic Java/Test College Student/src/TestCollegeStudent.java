import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.*;

public class TestCollegeStudent {

    String firstName;
    String lastName;
    GregorianCalendar start;
    GregorianCalendar end;
    public Scanner scanner = new Scanner(System.in);

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public GregorianCalendar getEnrollDate()
    {
        return start;
    }

    public void setEnrollDate(GregorianCalendar enrollDate)
    {
        this.start = enrollDate;
    }
   
    public TestCollegeStudent()
    {
       
    }

    public TestCollegeStudent(String firstName, String lastName, GregorianCalendar enrollDate, GregorianCalendar projectedGraduationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.start = enrollDate;
        this.end = projectedGraduationDate;
    }

    public GregorianCalendar getProjectedGraduationDate()
    {
        return end;
    }

    public void setProjectedGraduationDate(GregorianCalendar projectedGraduationDate, int year) {
        this.end = projectedGraduationDate;
        projectedGraduationDate.set(GregorianCalendar.YEAR, year + 4);
    }


    
    public TestCollegeStudent getInput(){
       
        String fName, lName;
        GregorianCalendar enroldate;
        GregorianCalendar projectedgraduationDate;

        System.out.println("Enter the First Name: ");
        fName = scanner.next();
       
        System.out.println("Enter the Last Name: ");
        lName = scanner.next();
       
        System.out.println("Enter the Date: (Example: 18): ");
        int date = scanner.nextInt();
       
         System.out.println("Enter the Month: (Example: 09): ");
         int month = scanner.nextInt();
      
         System.out.println("Enter the year: ");
         int year = scanner.nextInt();
        
         System.out.println("");
        
        
        enroldate = new GregorianCalendar(year, month, date);
        projectedgraduationDate = new GregorianCalendar(year+4, month, date);
                     
        TestCollegeStudent cs = new TestCollegeStudent(fName,lName,enroldate,projectedgraduationDate);
       
        return cs;               
    }
   
    public void display(TestCollegeStudent cs){
        System.out.println("First Name: " + cs.getFirstName());
        System.out.println("Last Name: " + cs.getLastName());
        System.out.println("Enroll Date: " + cs.getEnrollDate().get(GregorianCalendar.MONTH) + "/"
                + cs.getEnrollDate().get(GregorianCalendar.DATE) + "/" + (cs.getEnrollDate().get(GregorianCalendar.YEAR)));
        System.out.println("Projected Graduation Date: " + cs.getProjectedGraduationDate().get(GregorianCalendar.MONTH) + "/"
                + cs.getProjectedGraduationDate().get(GregorianCalendar.DATE) + "/" + cs.getProjectedGraduationDate().
                get(GregorianCalendar.YEAR));
        System.out.println("");
    }

    public static void main(String[] args) {
       
        TestCollegeStudent cstd = new TestCollegeStudent();
       
        TestCollegeStudent student1 = cstd.getInput();
        TestCollegeStudent student2 = cstd.getInput();
       
        cstd.display(student1);
        System.out.println("\n\n");
        cstd.display(student2);       
    }


}

