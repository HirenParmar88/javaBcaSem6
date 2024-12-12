/**
 * @(#)method_overriding_or_dynamic_method_dispetch.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

class A
{
	void disp()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("class B");
	}
}
class C extends B
{
	void disp()
	{
		System.out.println("class C");
	}
}

public class method_overriding_or_dynamic_method_dispetch 
{

    public static void main (String[] args) 
    {
		C obj = new C ();
		B obj1 = new B ();
		
		obj.disp();
    }
       
}