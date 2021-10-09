import java.util.*;

class AQ8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Size of the Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("\nEnter the Elements of the Array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("\nRepeated Elements are :\t");
		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
		
		
	}
}