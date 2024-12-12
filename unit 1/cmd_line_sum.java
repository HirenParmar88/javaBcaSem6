/*
to sum all arguments given
*/
class cmd_line_sum
{
	public static void main(String[] args)
	{
		int ans=0;
		for(int i=0; i<args.length; i++)
		{
			ans = ans + Integer.parseInt(args[i]);
		}
		System.out.println("Total : " + ans);
	}
}