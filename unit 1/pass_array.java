class pass_array
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4};
		
		printarr(arr);
		
		//array is passed from here
	}
	
	//bcoz of static word we can directly access this printarr function
	/*
	without this, it will be the class function and 
	we need class object to call it
	*/
	public static void printarr(int[] a)
	{
		for(int element:a)
		{
			System.out.print(element + " ");
		}
	}
}