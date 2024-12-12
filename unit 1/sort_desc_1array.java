class sort_desc_1array
{
	public static void main(String[] args)
	{
		int[] arr={33,22,555,11,3};
		
		int length=arr.length-1; //index (length) 4
		
		for(int r=0;r<=length;r++) //untill index3
		{
			for(int c=0;c<=length;c++) //untill index4
			{
				if(arr[r]>arr[c])
				{
					int temp=arr[c];
					arr[c]=arr[r];
					arr[r]=temp;
				}
			}
		}
		for(int element:arr)
		{
			System.out.print(element + " ");
		}
	}
}