/*
 * Clayton Oswald
 * 07.21.2019
 * Bellevue Universiy
 * The purpose of this assignment is use the info in SchoolTextBook.java to sort by the users request.
 * SchoolTextBookSort.java
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SchoolTextBookSort{

   public static void main(String args[]){

       List<SchoolTextBook> books = new ArrayList<>();

       books.add(new SchoolTextBook("Author2", "Title1", "ISBN3", 525, 29));

       books.add(new SchoolTextBook("Author4", "Title3", "ISBN2", 825, 99));

       books.add(new SchoolTextBook("Author1", "Title5", "ISBN4", 364, 325));

       books.add(new SchoolTextBook("Author5", "Title2", "ISBN1", 754, 299));

       books.add(new SchoolTextBook("Author3", "Title4", "ISBN5", 158, 149));

      

       Scanner sc = new Scanner(System.in);

       System.out.println("1. Author\n2. Title\n3. ISBN\n4. Page Count\n5. Price\n\n");

       System.out.print("How would you like to sort these books? : ");

       int order = sc.nextInt();

       switch (order){

       case 1:

           Collections.sort(books, new SchoolTextBookAuthorComparator());

           break;

       case 2:

           Collections.sort(books, new SchoolTextBookTitleComparator());

           break;

       case 3:

           Collections.sort(books, new SchoolTextBookISBNComparator());

           break;

       case 4:

           Collections.sort(books, new SchoolTextBookPageCountComparator());

           break;

       case 5:

           Collections.sort(books, new SchoolTextBookPriceComparator());

           break;

       default:

           break;
       }

      

       System.out.println("\n*** After sorting, the books are :");

      

for (SchoolTextBook b : books){

System.out.println(b);

}
}
}