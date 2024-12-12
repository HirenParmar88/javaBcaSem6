/**
 * @(#)inheritance_and_implementation.java
 *
 *
 * @author 
 * @version 1.00 2023/1/25
 */

interface interface3
{
	void testing (int a);
}
class A 
{
	void data()
	{
		System.out.println("This Is Class A");
	}

}

 class inheritance_and_implementation extends A implements interface3
{
	public static void main (String[] args) 
	{
		inheritance_and_implementation b=new inheritance_and_implementation();
		b.data();
		b.testing(100);
	}
	public void testing(int a)
	{
		System.out.println("Value Of A="+a);
	}
}

/*public class inheritance_and_implementation {

    public inheritance_and_implementation() {
    }
    
    
}*/