/**
 * @(#)hiren1.java
 *
 *
 * @author 
 * @version 1.00 2022/12/22
 */


public class aman1 {

    public static void main (String[] args) {
		box b=new box();
		b.w=10;
		b.h=10;
		b.l=10;
		System.out.println("volume="+(b.w*b.h*b.l));
		b2=b1;
		System.out.println("volume="+b2.w*b2.h*b2.l);
		
		System.out.println(
		b1.w=5;
		b1.h=10;
		b1.l=5;
		);
		b1=null;
		System.out.println("volume="+(b.w*b.h*b.l));
		b2=null;
		System.out.println("volume="+b2.w*b2.h*b2.l);
		System.out.println(b1&b2);
    }
}