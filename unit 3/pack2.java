/**
 * @(#)pack2.java
 *
 *
 * @author 
 * @version 1.00 2023/1/16
 */


package p2;
class A
{
	int i,j,k;
	A(int i, int j)
	{
		this.i=i;
		this.j=j;
		
	}
	void sum()
	{
		k=i+j;
	}
	void disp()
	{
		System.out.println("i+j="+k);
	}
}