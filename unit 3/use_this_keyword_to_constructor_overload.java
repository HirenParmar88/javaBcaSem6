/**
 * @(#)use_this_keyword_to_constructor_overload.java
 *
 *
 * @author 
 * @version 1.00 2023/1/12
 */

class A
{
	A()
	{
		this(0);
		System.out.println("Default Constructor");		//first print cons.
	}
	A(int i)
	{
		this(1,2);
		System.out.println("one para. cons."+i);
	}
	A(int i,int j)
	{
		System.out.println("two para. cons."+i+j);
	}
}

public class use_this_keyword_to_constructor_overload 
{

    public static void main (String[] args) 
    {
		A ob=new A();
    }
    
    
}