/**
 * @(#)sum-of_parent_child_variable.java
 *
 *
 * @author 
 * @version 1.00 2023/1/5
 */

class no1
{
	int a;
	
	no1()
	{
	
	}
	no1(int temp)
	{
		a=temp;
	}
}

class no2 extends no1
{
	int b;
	no2(int temp)
	{ 
		b=temp;
	}
	void sum()
	{
		System.out.println("sum="+(a+b));
	}
}

public class sum_of_parent_child_variable 
{

    public static void main (String[] args) 
    {
		no1 n1=new no1(10);
		no2 n2=new no2(20);
		n2.sum();	
    }
    
    
}