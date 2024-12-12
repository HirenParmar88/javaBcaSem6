/**
 * @(#)custom_exception_using_axception_class.java
 *
 *
 * @author 
 * @version 1.00 2023/2/7
 */

class ownException extends Exception
{
	private int dt;
	ownException(int d)
	{
		dt=d;
	}
	public String toString()	//method overriding
	{
		return"caught exception"+dt+"data";
	}
}
public class custom_exception_using_axception_class 
{
	public static void compute(int x) throws ownException
	{
		if(x>20)
		{
			throw new ownException(x);
			//System.out.println("Exception throws");	
		}
		
	}
    public static void main (String[] args) 
    {
		try
		{
			compute(1);
			compute(25);
		}
		catch(ownException e)
		{
			System.out.println(e);
		}
    }
    
    
}