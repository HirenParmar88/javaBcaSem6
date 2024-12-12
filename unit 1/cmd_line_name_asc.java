/*
this programme will arrange element as per ascii values
a		A		b		BB		B
A       B       BB      a       b

*/
class cmd_line_name_asc
{
	public static void main(String[] args)
	{
		for(int r=0;r<args.length;r++)
		{
			for(int c=0;c<args.length;c++)
			{
				//substraction 1st - 2nd
				/* a A
				  97 65
					ans is less than 0 means  
						1st is BIG and 2nd is SMALL and we need to swap it
				*/
				if(args[r].compareTo(args[c])<0)
				{
					String temp=args[r];
					args[r]=args[c];
					args[c]=temp;
				}				
			}
		}
		
		for(String element:args)
		{
			System.out.print(element + "\t");
		}
	}
}