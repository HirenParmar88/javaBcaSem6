/**
 * @(#)simple_inheritance.java
 *
 *
 * @author 
 * @version 1.00 2023/1/5
 */
class A
{
	int i;
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
		System.out.println("i="+i);
		System.out.println("i="+j);
	}
}


public class simple_inheritance 
{

    public static void main (String[] args) 
    {
		B obj=new B();
		obj.i=100;
		obj.j=200;
		
		obj.putd();
		obj.putd2();
    }
    
    
}