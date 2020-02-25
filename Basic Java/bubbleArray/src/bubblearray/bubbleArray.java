
/*
Clayton Oswald
The purpose of this program is to impliment the use of a bubble array that will sort a list of random numbers from smallest to greatest value.
10/21/2018
Bellevue University
BubbleArray.java
 */


import java.util.*;

public class bubbleArray {

public static void main(String[] args){
    
    int i;
    int n;

    //input the scanner
    Scanner input = new Scanner(System.in);

    //input the random number generator
    Random gen = new Random();

    //prompt the user to enter a number
    System.out.println("Enter the amount of numbers that you wanted sorted! ");
    
    //create the inputs for the array
    n=input.nextInt();
   int num[]=new int[n];
   
   for(i = 0; i < n; i++)
           num[i] = gen.nextInt(1000);
   
   //create strings that will display the results
    print(num, n, "Here are the randomly generated numbers before they are sorted..");
    sort(num);
    print(num, n, "Here are the randomly generated numbers after they are sorted..");
    }

// create a new method to display the 
public static void print(int num[],int n,String commentary){
        
    int j;

    System.out.println(commentary);
for(j = 1; j <= n; j++){
     System.out.print(num[j-1] + " ");
        if(j%20==0)
                System.out.println(" ");
    }
System.out.println(" ");
}

//finally create a method that includes the bubble array
public static void sort(int list[]){
    int temp;
boolean changed;

do{

  changed = false;

  for(int i = 0; i < list.length - 1; i++){

    if(list[i] > list[i + 1]){
     
        //make each number compare itself and sort in order from least to greatest
      temp=list[i];
      list[i]=list[i+1];
      list[i+1]=temp;
      
      changed = true;
     }
}
}while(changed);
}
}