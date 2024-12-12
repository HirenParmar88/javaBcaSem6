/**
 * @(#)pattern1.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/19
 */
 
 /*
    1
   3 5
  7 911
 13151719
  212325
   2729
    31
 */

import java.util.Scanner;
public class pattern16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r,c,sp,no;
		
		System.out.print("Enter Number : ");
		no = sc.nextInt();
		
		int temp=1;
		//upper
		for(r=1;r<=no;r++) //row
		{
			for(sp=no;sp>r;sp--) //space
			{
				System.out.print(" ");
			}
			for(c=1;c<=r;c++) //column
			{
				System.out.print(String.format("%2d",temp));
				temp=temp+2;
			}
			System.out.println("");
		}
		
		//lower
		for(r=no-1;r>=1;r--)
		{
			for(sp=no;sp>r;sp--)
			{
				System.out.print(" ");
			}
			for(c=1;c<=r;c++)
			{
				System.out.print(String.format("%2d",temp));
				temp=temp+2;
			}
			System.out.println("");
		}
	}
}