/**
 * @(#)illegal_access_exception.java
 *
 *
 * @author 
 * @version 1.00 2023/2/6
 */


public class illegal_access_exception 
{
	static void demo1() throws IllegalAccessException
	{
		throw new IllegalAccessException("demo1");
	}
    public static void main (String[] args) 
    {
		try
		{
			demo1();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("main catch"+e);
		}
    
    }  
    
}