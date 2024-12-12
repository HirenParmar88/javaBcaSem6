/**
 * @(#)finally_block.java
 *
 *
 * @author 
 * @version 1.00 2023/2/6
 */


public class finally_block 
{

    public static void main (String[] a) 
    {
		try
		{
			int d=a.length;
			int aa=50/d;
		}
	/*	catch(Exception e)
		{
			System.out.print(e);
		}*/
		finally
		{
			System.out.println("You Need To Correct ..");
		}
    }
     
}