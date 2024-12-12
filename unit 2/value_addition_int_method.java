/**
 * @(#)value_addition_int_method.java
 *
 *
 * @author 
 * @version 1.00 2022/12/29
 */

class Inc
{
	int c=0;
	Inc()
	{
		c++;
	}
	void disp()
	{
		System.out.println("c="+c);
	}
}

public class value_addition_int_method 
{

    public static void main (String[] args) 
    {
		Inc I1,I2,I3;
		
		I1=new Inc();
		I2=new Inc();
		I3=new Inc();
		
		I1.disp();
		I2.disp();
		I3.disp();
    }
    
    
}