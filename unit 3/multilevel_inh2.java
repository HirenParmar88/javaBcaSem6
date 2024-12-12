/**
 * @(#)multilevel_inh2.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */
class a
{
	a()
	{
		System.out.println("a class");
	}
}
class b extends a
{
	b()
	{
		System.out.println("b class");
	}
}
class c extends b
{
	c()
	{
		System.out.println("c class");	
	}
	
}



public class multilevel_inh2 
{

    public static void main (String[] args) 
    {
		c obj=new c();
    }
    
    
}