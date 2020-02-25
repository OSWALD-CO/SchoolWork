import java.util.*;

public class Arrays {

public static void main(String[] args){
    
    int i;
    int n;

    Scanner input = new Scanner(System.in);

    Random gen = new Random();

    System.out.println("How many random numbers would you like to see me sort? (please ask for less than 100!)");
    
    n=input.nextInt();
   int num[]=new int[n];
    for(i=0;i<n;i++)
           num[i]=gen.nextInt(100);
    print(num,n,"Here are " + n + " randomly generated numbers.");
    sort(num);
    print(num,n,"Here are those same numbers after I have sorted them!");
    }


public static void print(int num[],int n,String mess){
        
    int j;

    System.out.println(mess);
for(j=1;j<=n;j++)
    { System.out.print(num[j-1]+" ");
        if(j%20==0)
                System.out.println(" ");
    }
System.out.println(" ");
}


public static void sort(int list[]){
    int temp;
boolean changed;

do{

  changed = false;

  for(int i = 0; i < list.length - 1; i++){

    if(list[i] > list[i + 1]){
     
      temp=list[i];
      list[i]=list[i+1];
      list[i+1]=temp;
      changed = true;
     }
}
}while(changed);
}
}