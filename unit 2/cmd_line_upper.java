/**
 * @(#)cmd_line_upper.java
 *
 *
 * @author Parag Chatbar
 * @version 1.00 2022/12/22
 */


public class cmd_line_upper {
	public static void main(String[] args)
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i].toUpperCase());			
		}
	}   
}