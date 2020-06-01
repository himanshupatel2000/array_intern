package internship;
import java.util.*;
public class arrayp1 
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,a[],sum=0, n;
	 System.out.println("Enter total no. of array elements.");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Please enter your array elements.");
	 for(i=0;i<n;i++)
	 {
		a[i]=sc.nextInt();
		sum=sum+a[i];
	 }
	System.out.println("Sum of array elements is:"+sum);
	sc.close();
   }
	
  }
