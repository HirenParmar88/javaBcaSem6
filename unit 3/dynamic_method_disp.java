/**
 * @(#)dynamic_method_disp.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

class A 
{
	void disp()
	{
		System.out.println("This Is A Class");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("This Is B Class");
	}
}
class C extends B
{
	void disp()
	{
		System.out.println("This Is C Class");
	}
}

public class dynamic_method_disp 
{

    public static void main (String[] args) 
    {
    	A A = new A();
    	B B = new B();
    	C C = new C();
    	
    	A aa=A;
    	aa.disp();
    	aa=B;
    	
    	aa.disp();
    	aa=C;
    	aa.disp();
    	

    }
        
}