package internship;
import java.util.*;
public class arrayp3
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int n;
	 int a[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	 System.out.println("Enter the month number.");
	 n=sc.nextInt();
	 if(n>=1 && n<=12)
	  System.out.println("The no. of days is: "+a[n]);
	 else
	  System.out.println("Wrong input"); 
	 sc.close();
   }
 }