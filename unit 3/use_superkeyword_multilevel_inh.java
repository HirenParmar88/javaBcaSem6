/**
 * @(#)use_superkeyword_multilevel_inh.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */
class a
{
	int i,j;
	a(int a,int b)
	{
		i=a;
		j=b;
		System.out.println("a class");
	}
}
class b extends a
{
	
}
class c extends b
{
	c(int a,int b)
	{
		super(a,b);
	}
}

public class use_superkeyword_multilevel_inh 
{

    public static void main (String[] args) 
    {
		c obj=new c(10,20);
    }
    
    
}