class AQ7 
{
	public static void main (String args[])
	{
	int a1[]={1,2,3,4,5};
	int a2[]={9,10,5,12,0};
	int a3[]={12,21,300,400,80};
	for (int i=0;i<a1.length;i++)
		{
			for (int j=0;j<a2.length;j++)
			for (int k=0;k<a3.length;k++)	
			if (a1[i]==a2[j])
			{
				if(a2[j]==a3[k])
				System.out.println("The common elements are "+a1[i]);
			}
		}
	}
}