package internship;
import java.util.*;
public class arrayp4
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,a[],n;
	 System.out.println("Enter total no. of array elements.");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Please enter your array elements.");
	 for(i=0;i<n;i++)
	 a[i]=sc.nextInt();
	 System.out.println("Array in reverse is:");
	 for(i=n-1;i>=0;i--)
	 System.out.print(a[i]+" ");
	 sc.close();
   }
 }