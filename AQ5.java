import java.util.*;

class AQ5
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of the Array: ");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("\nEnter the Array Elements : ");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}

System.out.println("\nFor nth Smallest position, Enter the value of n: ");
	int k=sc.nextInt(); // kth position 

for (int i=0; i<a.length-1; i++)
 {
   for(int j=i+1; j<a.length; j++)
   {
      if(a[i]>a[j])
	  {
	  int temp=a[i];
	  a[i]=a[j];
	  a[j]=temp;
	  }
   }
 }
  System.out.println("The smallest number at position "+k+" is : "+a[k-1]);
}

}