/**
 * @(#)final_class.java
 *
 *
 * @author 
 * @version 1.00 2023/1/12
 */


final class A
{
	void show()
	{
		System.out.println("method of A class");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("method of B class");
	}
}

public class final_class 
{

    public static void main (String[] args) 
    {
		B ob=new B();
		ob.show();
    }
    
    
}