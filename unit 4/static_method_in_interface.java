/**
 * @(#)static_method_in_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/2/2
 */

interface testing
{
	void disp();
	static int cube(int a)
	{
		return a*a*a;
	}
}
class A implements testing
{
	public void disp()
	{
		System.out.println("Display Method");
	}
}
public class static_method_in_interface 
{

    public static void main (String[] args) 
    {
		static_method_in_interface a=new static_method_in_interface ();
		a.disp();
		System.out.println("cube is="+testing.cube(3));
		System.out.println("cube is="+testing.cube(3));
		System.out.println("cube is="+testing.cube(3));
    }

}