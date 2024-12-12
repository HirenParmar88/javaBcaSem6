/**
 * @(#)abstractmethod1.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

abstract class A
{
	abstract void disp();	//declare
}
class B extends A
{
	void disp()				//define
	{
		System.out.println("A class");
	}
}
public class abstractmethod1 
{

    public static void main (String[] args) 
    {
		B b=new B();
		b.disp();
    }
 
}