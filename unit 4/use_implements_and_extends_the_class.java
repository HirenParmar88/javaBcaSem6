/**
 * @(#)use_implements_and_extends_the_class.java
 *
 *
 * @author 
 * @version 1.00 2023/1/25
 */

interface interface2
{
	void testing(int a);
}
class A 
{
	void data()
	{
		System.out.println("This is class A");
	}
	public void testing(int a)
	{
		System.out.println("value of a="+a);
	}
}

public class use_implements_and_extends_the_class extends A implements interface2
{

    public static void main (String[] args) 
    {
		use_implements_and_extends_the_class b=new use_implements_and_extends_the_class();
		b.data();
		b.testing(100);
    }
    
    
}