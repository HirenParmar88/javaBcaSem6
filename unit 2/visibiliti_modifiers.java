/**
 * @(#)visibiliti_modifiers.java
 *
 *
 * @author 
 * @version 1.00 2022/12/28
 */

class test
{
	int a;
	private int b;
	public int c;
	protected int d;
	
	test()
	{
		a=2;
		b=3;
		c=4;
		d=5;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class visibiliti_modifiers {

    public static void main (String[] args) {
		test t;
		t=new test();
		t.a=11;
	//	t.b=22;
		t.c=33;
		t.d=44;
		
		t.disp();
		
    }
}