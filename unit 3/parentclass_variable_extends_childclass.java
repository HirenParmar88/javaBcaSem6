/**
 * @(#)parentclass_variable_extends_childclass.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

class A
{
	private int i;
	void putd()
	{
		System.out.println("i="+i);
	}
}
class B extends A
{
	int j;
	void putd2()
	{
	//	System.out.println(i);
		System.out.println(j);
	
	}
}

public class parentclass_variable_extends_childclass 
{

    public static void main (String[] args) 
    {
		B obj=new B();
	//	obj.i=100;
		obj.j=200;
		obj.putd();
		obj.putd2();
    }
    
    
}