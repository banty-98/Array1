class AQ4
{
	public static void main(String[] args)
	{
		int a[]={10,20,30,40,50};
		int b[]={50,60,70,80,90};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
				System.out.println("\nIntersection Elements of the array is: "+a[i]);
				}
			}
		}
	}
}