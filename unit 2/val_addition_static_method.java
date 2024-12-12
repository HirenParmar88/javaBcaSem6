/**
 * @(#)val_addition_static_method.java
 *
 *
 * @author 
 * @version 1.00 2022/12/29
 */


class Inc1
{
	static int c=0;
	Inc1()
	{
		c++;
		System.out.println("c="+c);
	}

}

public class val_addition_static_method 
{

    public static void main (String[] args) 
    {
		Inc1 I1,I2,I3;
		
		I1=new Inc1();
		I2=new Inc1();
		I3=new Inc1();
		
    }
}
    
    