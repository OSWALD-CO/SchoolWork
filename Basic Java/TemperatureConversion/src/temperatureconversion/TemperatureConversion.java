
import java.util.Scanner;
//*scanner for java has been created

public class TemperatureConversion 

public static void main(String[] args) {
        
            //create the scanner
    Scanner input = new Scanner(System.in);
    
    //prompt the user to enter a temperature in degrees F.
    System.out.print("Enter a temperature in degrees Fahrenheit.");
    
    double fahrenheit = input.nextdouble;
    
    //compute the temperature
    double celsius = (5.0/9.0) * (fahrenheit - 32);
    
    //display results
    System.out.println(fahrenheit + " degrees Fahrenheit is the same as " + celsius + " degrees Celcius.");
    
    
}
