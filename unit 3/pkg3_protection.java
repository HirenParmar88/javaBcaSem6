/**
 * @(#)pkg3_protection.java
 *
 *
 * @author 
 * @version 1.00 2023/1/17
 */


package p3;

public class protection
{
	int pn=1;
	private int pvn=2;
	public int pubn=3;
	protected int pron=4;
	
public protection()
	{
		System.out.println("protection class !!!");
		System.out.println(pn);
		System.out.println(pvn);
		System.out.println(pubn);
		System.out.println(pron);
	}
}