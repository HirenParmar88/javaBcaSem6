/**
 * @(#)refvariable_absclass.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

abstract class A
{
	abstract void disp();
}
class B extends A
{
	void disp()
	{
		System.out.println("A class");
	}
}
public class refvariable_absclass 
{

    public static void main (String[] args) 
    {
		B b=new B();
		A a;
		b.disp();
    }
    
    
}