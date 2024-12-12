/**
 * @(#)declare_in_childclass.java
 *
 *
 * @author 
 * @version 1.00 2023/1/12
 */


abstract void A
{
	abstract void disp();
	void show()
	{
		System.out.println("show method");
	}
}
abstract class B extends A
{
	abstract void disp();
}

public class declare_in_childclass 
{

   public static void main (String[] args) 
   {
		B b;
	//	B ob=new B();
	//	ob.show();
    }  
}