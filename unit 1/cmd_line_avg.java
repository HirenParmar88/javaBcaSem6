/**
 * @(#)cmd_line_avg.java
 *
 *
 * @author 
 * @version 1.00 2022/12/22
 */


public class cmd_line_avg {
	public static void main(String args[])
	{
		int len=args.length;
		int total=0,avg=0;
		
		for(int i=0;i<len;i++)
		{
			total += Integer.parseInt(args[i]);
		}
		avg=total/len;
		
		System.out.println("Average : " + avg);
	}
}