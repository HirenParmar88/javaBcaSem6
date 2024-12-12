/**
 * @(#)runtime_exception.java
 *
 *
 * @author 
 * @version 1.00 2023/2/7
 */


public class runtime_exception 
{
	static void demo1()
	{
		try
		{
			System.out.println("in demo1");
			throw new RuntimeException("demo1");
		}
		//catch(Exception e)
		catch(RuntimeException e)
		{
			System.out.println("caughtin"+e);
		}
		finally
		{
			System.out.println("Finally of demo1");
		}
	}
    public static void main (String[] args) 
    {
		try
		{
			demo1();
		}
		//catch(Exception e)
		catch(RuntimeException e)
		{
			System.out.println("In Main"+e);
		}
    }
    
    
}