/**
 * @(#)pattern1.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/19
 */
 
 /*
   1
  22
 333
4444
 */

import java.util.Scanner;
public class pattern10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r,c,sp,no;
		
		System.out.print("Enter Number : ");
		no = sc.nextInt();
		
		for(r=1;r<=no;r++) //row
		{
			for(sp=no;sp>r;sp--) //space
			{
				System.out.print(" ");
			}
			for(c=1;c<=r;c++) //column
			{
				System.out.print(r);
			}
			System.out.println("");
		}
	}
}