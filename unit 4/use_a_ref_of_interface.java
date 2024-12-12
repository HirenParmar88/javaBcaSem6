/**
 * @(#)use_a_ref_of_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/1/25
 */

interface interface2
{
	void testing(int a);
}
class A implements interface2
{
	public void testing(int a)
	{
		System.out.println("value of a="+a);
	}
}
class B
{
	public void testing(int a)
	{
		System.out.println("value of a="+a);
	}	
}

public class use_a_ref_of_interface 
{

    public static void main (String[] args) 
    {
		interface2 i2;
		A a=new A();
		i2=a;
		i2.testing(20);
		B b=new B();
	//	i2=b;
		i2.testing(50);
    }
}