package internship;
import java.util.*;
public class arrayp10
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,j,a[],temp,minpos,n;
	 System.out.println("Enter size of array.");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Please enter your array elements.");
	 for(i=0;i<n;i++)
	  a[i]=sc.nextInt();
	 
	  for(i=0;i<n-1;i++)
	 {
		 minpos=i;
	     for(j=i+1;j<n;j++)
		 { 
	    	 if(a[j]<a[minpos])
	    	 minpos=j;
		 }
		temp=a[i];
		a[i]=a[minpos];
	    a[minpos]=temp;
	}
	 
	System.out.println("Array after sorting is:");
	 for(i=0;i<n;i++)
	 System.out.print(a[i]+" ");
	 sc.close();
   }
}

