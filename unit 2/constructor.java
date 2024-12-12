/**
 * @(#)constructor.java
 *
 *
 * @author 
 * @version 1.00 2022/12/28
 */

class box1
{
	double w;
	double h;
	double l;
	box1()
	{
		w=10;
		h=10;
		l=10;
	}
}

public class constructor {

    public static void main(String []a)
    {
    	box1 b=new box1();
    	System.out.println("width="+b.w);
    	System.out.println("height="+b.h);
    	System.out.println("length="+b.l);
    	System.out.print("volume="+(b.w*b.h*b.l));
    	
    }
    
    
}