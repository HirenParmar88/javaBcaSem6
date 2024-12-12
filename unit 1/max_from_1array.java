class max_from_1array
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5};
		int max=arr[0];
		for(int temp:arr)
		{
			if(max<=temp)
			{
				max=temp;
			}
		}
		
		System.out.println("Max : " + max);
	}
}