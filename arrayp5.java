package internship;
import java.util.*;
public class arrayp5
 {
  public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 int i,a[],b[],c[],m,n,k=0;
	 System.out.println("Enter size of 1st array.");
	 m=sc.nextInt();
	 a=new int[m];
	 System.out.println("Enter array elements.");
	 for(i=0;i<m;i++)
	 a[i]=sc.nextInt();
	 System.out.println("Enter size of 2nd array.");
	 n=sc.nextInt();
	 b=new int[n];
	 System.out.println("Enter array elements.");
	 for(i=0;i<n;i++)
	 b[i]=sc.nextInt();
	 c=new int[m+n];
	 for(i=0;i<m;i++)
	  c[k++]=a[i];
	 for(i=0;i<n;i++)
	 c[k++]=b[i];
	 System.out.println("Merged array is.");
	 for(i=0;i<m+n;i++)
	 System.out.print(c[i]+" ");	 
	 sc.close();
  }
}
