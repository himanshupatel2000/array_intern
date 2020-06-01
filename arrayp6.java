package internship;
import java.util.*;
public class arrayp6
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,a[],pos=0,flag=0,n,x;
	 System.out.println("Enter size of array.");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Please enter your array elements.");
	 for(i=0;i<n;i++)
	 a[i]=sc.nextInt();
	 System.out.println("Enter element you want to search.");
	 x=sc.nextInt();
	 for(i=0;i<n;i++)
	 {
		 if(a[i]==x)
		 {
			 flag=1;
			 pos=i;
			 break;
		 }
	 }
	 if(flag==0)
	System.out.println("Sorry.Element not found.");
	 else
	System.out.println("Element "+x+" found at "+(pos+1)+"th position in the array.");	 
	sc.close();
   }
}

