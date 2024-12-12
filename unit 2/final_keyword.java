/**
 * @(#)final_keyword.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2023/1/4
 */

class final_var
{
	final int i=0;
	final_var()
	{
		//i=10;
		/* final value can not be changed during the whole execution of programmes */
	}
	final  void disp()
	{
		System.out.println("i = " + i);
	}
}

public class final_keyword {
	public static void main(String[] args)
	{
		final_var f = new final_var();
		f.disp();
	}
}