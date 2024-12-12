/**
 * @(#)parameterized_constructor.java
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
	box1(double w,double h,double l)
	{
		this.w=w;
		this.h=h;
		this.l=l;
	}
}

public class parameterized_constructor {

    public static void main (String[] args) {
		box1 b=new box1(20,10,10);
		System.out.println("width="+b.w);
		System.out.println("height="+b.h);
		System.out.println("length="+b.l);
		System.out.println("Volume="+(b.w*b.h*b.l));
    }
    
    
}