/*
 * Clayton Oswald
 * 07.21.2019
 * Bellevue Universiy
 * The purpose of this assignment is to get fields for variables that will be used again to sort the information.
 * SchoolTextBook.java
 */

import java.util.Comparator;

class SchoolTextBook {

   private String author, title, ISBN;

   private int pageCount;

   private double price;

   public SchoolTextBook(String author, String title, String isbn, int pageCount, double price) {

       super();

       this.author = author;

       this.title = title;

       ISBN = isbn;

       this.pageCount = pageCount;

       this.price = price;
}

   public String getAuthor() {

       return author;
}

   public void setAuthor(String author) {

       this.author = author;
}

   public String getTitle() {

       return title;
}
   public void setTitle(String title) {

       this.title = title;
}

   public String getISBN() {

       return ISBN;
 }

   public void setISBN(String isbn) {

       ISBN = isbn;
}
   
   public int getpageCount() {

       return pageCount;
}

   public void setpageCount(int pageCount) {

       this.pageCount = pageCount;
}

   public double getPrice() {

       return price;
}
   
   public void setPrice(double price) {

       this.price = price;
}

  
   @Override

   public String toString() {

       return "SchoolTextBook [Author=" + author + ", Title=" + title + ", ISBN=" + ISBN + ", Page Count=" + pageCount

               + ", Price=" + price + "]";

   }  
}

class SchoolTextBookAuthorComparator implements Comparator<SchoolTextBook> {

@Override

public int compare(SchoolTextBook s1, SchoolTextBook s2) {

return s1.getAuthor().compareTo(s2.getAuthor());

}
}

class SchoolTextBookTitleComparator implements Comparator<SchoolTextBook> {

  

@Override

public int compare(SchoolTextBook s1, SchoolTextBook s2) {

return s1.getTitle().compareTo(s2.getTitle());

}
}

class SchoolTextBookISBNComparator implements Comparator<SchoolTextBook> {

  

@Override

public int compare(SchoolTextBook s1, SchoolTextBook s2) {

return s1.getISBN().compareTo(s2.getISBN());

}
}

class SchoolTextBookPageCountComparator implements Comparator<SchoolTextBook> {

  

@Override

public int compare(SchoolTextBook s1, SchoolTextBook s2) {

if(s1.getpageCount() > s2.getpageCount())

       return 1;

else if(s1.getpageCount() == s2.getpageCount())

       return 0;

return -1;

}
}

class SchoolTextBookPriceComparator implements Comparator<SchoolTextBook> {

  

@Override

public int compare(SchoolTextBook s1, SchoolTextBook s2) {

   if(s1.getPrice() > s2.getPrice())

       return 1;

else if(s1.getPrice() == s2.getPrice())

       return 0;

return -1;

}
}
