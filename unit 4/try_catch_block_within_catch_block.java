/**
 * @(#)try_catch_block_within_catch_block.java
 *
 *
 * @author 
 * @version 1.00 2023/2/6
 */


public class try_catch_block_within_catch_block 
{
	static void demo1()
	{
		try
		{
			throw new NullPointerException("demo1");
		}
		catch(NullPointerException e)
		{
			System.out.println("outer catch demo1");
			try 
			{
				throw new ArithmeticException("demo1");
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				System.out.println(a);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
    public static void main (String[] args) 
    {
		try 
		{
			System.out.println("in main try");
		}
		catch(NullPointerException e)
		{
			System.out.println("main catch :"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("main catch :"+e);
		}
    }
}