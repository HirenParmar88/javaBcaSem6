/**
 * @(#)arithmetic.java
 *
 *
 * @author 
 * @version 1.00 2023/1/16
 */

package arith_pack;

import java.util.Scanner;
class arithmetic
{
	int a,b,ans;
	Scanner sc = new Scanner(System.in);
	void get()
	{
		System.out.print("Enter Number 1 : ");
		a = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		b= sc.nextInt();
	}
	void add()
	{
		ans = a + b;
	}
	void sub()
	{
		ans = a - b;
	}
	void mul()
	{
		ans = a * b;
	}
	void div()
	{
		ans = a / b;
	}
	void show()
	{
		System.out.println("Ans : " + ans);
	}
}