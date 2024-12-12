/**
 * @(#)absmethod_in_absclass.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

class A
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
public class absmethod_in_absclass 
{

    public static void main (String[] args) 
    {
		B b=new B();
		b.disp();
    }
    
    
}