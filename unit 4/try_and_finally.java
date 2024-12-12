/**
 * @(#)try_and_finally.java
 *
 *
 * @author 
 * @version 1.00 2023/2/6
 */


public class try_and_finally 
{
	static  void A()
	{
		try 
		{
			System.out.println("A method");
			throw new RuntimeException("demo1");
		}
		finally
		{
			System.out.println("Finally of A");
		}
	}
	static void B()
	{
		try
		{
			System.out.println("B method");
		}
		finally
		{
			System.out.println("Finally of B");
		}
	}
	static void c()
	{
		try
		{
			System.out.println("C method");
		}
		finally
		{
			System.out.println("Finally of C");
		}
	}
    public static void main (String[] args) 
    {
		try
		{
			System.out.println("Main Try");
			A();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		B();
		c();
    }
    
    
}