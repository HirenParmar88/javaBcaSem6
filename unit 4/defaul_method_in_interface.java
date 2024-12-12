/**
 * @(#)defaul_method_in_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/2/2
 */

interface testing
{
	public void square(int a);
	default void disp()
	{
		System.out.println("This is a default method");
	}
}

public class defaul_method_in_interface implements testing
{

    public void square(int a)
    {
		System.out.print(a*a);
    }
    public static void main (String[] args) 
    {
    	testing t=new defaul_method_in_interface();
    	t.disp();
    	t.square(2);
	}
    
}