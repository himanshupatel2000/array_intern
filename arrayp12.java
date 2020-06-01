package internship;
import java.util.*;
public class arrayp12
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,a[],sum=0,n;
	 System.out.println("Enter size of array.");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Please enter your array elements.");
	 for(i=0;i<n;i++)
	 a[i]=sc.nextInt();
	 for(i=0;i<n;i++)
	 {
		 if(a[i]%2==0)
		 sum=sum+a[i];
	 }
	 if(sum>0)
	System.out.println("Sum of even no. of elements is: "+sum);
	 else
	System.out.println("No even number found.");	 
	sc.close();
   }
}

