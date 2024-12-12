/**
 * @(#)parent_class_var.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */

class a
{
	int i;
}
class b extends a
{
	int i;
	b(int a,int b)
	{
		super.i=a;
		i=b;
	}
	void disp()
	{
		System.out.println("i="+i);
		System.out.println("a class i="+super.i);
	}
}

public class parent_class_var 
{

    public static void main (String[] args) 
    {
		b obj=new b(10,20);
		obj.disp();
    }
    
    
}