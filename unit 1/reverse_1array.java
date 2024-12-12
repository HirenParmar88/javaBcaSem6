class reverse_1array
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int length=arr.length-1;
		
		for(int c=0;c<length;c++)
		{
			int temp=arr[c];
			arr[c]=arr[length];
			arr[length]=temp;
			
			length--;
		}
		
		for(int temp:arr)
		{
			System.out.print(temp + " ");
		}
	}
}