import java.util.*;
public class Main
{public static void main(String[] args)
   {int temp,i,j,n;
    int [] a = {15,3,5,17,22,93,18};
    bubble(a);
   }
public static void bubble(int num[])
{int j,temp;
boolean changed;
print(num,"before bubble");
do
{changed=false;
for(j=0;j<num.length-1;j++)
     {if(num[j]>num[j+1])   
          {temp = num[j];           
           num[j] = num[j+1];
           num[j+1] = temp;
           changed=true;          
           }
        }
     }while (changed);
print(num,"after bubble");     
}
public static void print(int a[],String mess)
{int i;
System.out.println(mess);
for(i=0;i<a.length;i++)
   System.out.print(a[i]+" ");
System.out.println();
return;
}
}
