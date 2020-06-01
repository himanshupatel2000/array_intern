package internship;
import java.util.*;
public class arrayp11
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,a[],c=0,n;
	 System.out.println("Enter size of array.");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Please enter your array elements.");
	 for(i=0;i<n;i++)
	 a[i]=sc.nextInt();
	 for(i=0;i<n;i++)
	 {
		 if(a[i]>0)
			c++;
	 }
	 if(c>0)
	System.out.println("Total no. of positive elements are: "+c);
	 else
	System.out.println("No positive element is present in the array.");	 
	sc.close();
   }
}

