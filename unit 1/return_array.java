class return_array
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3};
		
		
		int newarr[] = add(arr);
		
		for(int element : newarr)
		{
			System.out.print(element + " ");
		}
	}
	
	public static int[] add(int[] a)
	{
		for(int i=0;i<3;i++)
		{
			a[i]=a[i]+5;
		}
		return a;
	}
}