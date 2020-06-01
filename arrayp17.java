package internship;
import java.util.*;
public class arrayp17
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,a[],b[],k=0,n;
	 System.out.println("Enter size of array.");
	 n=sc.nextInt();
	 a=new int[n];
	 b=new int[n];
	 System.out.println("Please enter your array elements.");
	 for(i=0;i<n;i++)
	 a[i]=sc.nextInt();
	 for(i=0;i<n;i++)
	 {
		 if(a[i]%2==0)
		 {
		 b[k++]=a[i];
		 a[i]=0;
		 }
		 
	 }
	 System.out.println("Array after extraction is:");
	 for(i=0;i<n;i++)
	 System.out.print(a[i]+" ");
	 if(k>0)
	  {
	   System.out.println("\nArray containing even elements is:");
	   for(i=0;i<k;i++)
	   System.out.print(b[i]+" ");
	  }
	 else
	   System.out.println("No even number found.");	 
	sc.close();
   }
}

