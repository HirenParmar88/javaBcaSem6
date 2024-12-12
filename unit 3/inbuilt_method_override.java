/**
 * @(#)inbuilt_method_override.java
 *
 *
 * @author 
 * @version 1.00 2023/1/12
 */

class A
{
	public int toString(int i)
	{
		System.out.println("to string override");
		return 0;
	}
}

public class inbuilt_method_override 
{

    public static void main (String[] args) 
    {
		A ob=new A();
		System.out.println("ok"+ob.toString());
		System.out.println("ok"+ob.toString());
    }
    
    
}