/**
 * @(#)custom_exception.java
 *
 *
 * @author 
 * @version 1.00 2023/2/7
 */

class userDefineE extends Exception
{
	userDefineE(String s)
	{
		super(s);
	}
}
public class custom_exception 
{

    public static void main (String[] args) 
    {
		try
		{
			throw new userDefineE("This is super define exception.");
		}
		catch(userDefineE u)
		{
			System.out.println(u.getMessage());
		}
    }
    
    
}