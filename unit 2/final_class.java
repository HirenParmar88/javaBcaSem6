/**
 * @(#)final_class.java
 *
 *
 * @author 
 * @version 1.00 2023/1/5
 */

final class parent
{
	int i;
	parent()
	{
		i=10;
	}
	void disp()
	{
		System.out.println("i="+i);
	}
}
//final class can not be inherited.
public class final_class extends parent
{

    public static void main (String[] args) 
    {
		parent f=new parent();
		f.disp();		
    }
    
    
}