/**
 * @(#)final_method.java
 *
 *
 * @author 
 * @version 1.00 2023/1/5
 */

class final_class
{
	int i=0;
	final_class()
	{
		i=10;
	}
	final void disp()
	{
		System.out.println("i="+i);
	}
}

public class final_method extends final_class
{

    public static void main (String[] args) 
    {
    	final_method t=new final_method();
    	t.disp();
    }
    
    
}