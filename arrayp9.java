package internship;
import java.util.*;
public class arrayp9
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,j,a[],temp,n;
	 System.out.println("Enter size of array.");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Please enter your array elements.");
	 for(i=0;i<n;i++)
	  a[i]=sc.nextInt();
	 
	 for(i=0;i<n-1;i++)
	 {
		 for(j=0;j<n-1-i;j++)
		 {
			 if(a[j]>a[j+1])
			 {
				 temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			 }
		 }
	 }
	 System.out.println("Array after sorting is: ");
	 for(i=0;i<n;i++)
	 System.out.print(a[i]+" ");
	 sc.close();
   }
}

