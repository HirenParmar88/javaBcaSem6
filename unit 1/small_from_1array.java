class small_from_1array
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5};
		int min=arr[0];
		for(int temp:arr)
		{
			if(temp<=min)
			{
				min=temp;
			}
		}
		
		System.out.println("Minimun : " + min);
	}
}