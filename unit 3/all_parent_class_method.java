/**
 * @(#)all_parent_class_method.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

class A
{
	int i;
	void disp()
	{
		System.out.println("i="+i);
	}
}
class B extends A
{
	int i;
	B(int a,int b)
	{
		super.i=a;
		i=b;
	}
	void disp()
	{
		super.disp();
		System.out.println("super i="+super.i);
		System.out.println("i="+i);
	}
}

public class all_parent_class_method 
{

    public static void main (String[] args) 
    {
		B obj=new B(10,20);
		obj.disp();
    }
    
    
}