/* How to find the largest and smallest number in an unsorted array? */

class AQ2
{
	public static void main(String[] args)
	{
		int a[]={10,2,5,9,15};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println("Maximum Number is : "+max);
		System.out.println("Minimum Number is : "+min);
	}

}