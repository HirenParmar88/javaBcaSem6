/**
 * @(#)abstractclass.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

abstract class A
{
	void disp()
	{
		System.out.println("A class");
	}
}
class B extends A
{
	void disp2()		//define()
	{
		System.out.println("B class");
	}
}

public class abstractclass 
{

    public static void main (String[] args) 
    {
	//	A a=new A();
		B b=new B();
		
	//	a.disp();
	//	b.disp();
		b.disp2();
    }
    
    
}