/**
 * @(#)pattern1.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/15
 */
 
 /*
  	 1
  	 3 5
  	 7 9
  	11131517
 */

import java.util.Scanner;
public class pattern13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r,c,no;
		
		System.out.print("Enter Number : ");
		no = sc.nextInt();
		
		int temp=1;
		for(r=1;r<=no;r++) //row
		{
			for(c=1;c<=r;c++) //column
			{
				System.out.print(String.format("%2d",temp));
				temp=temp+2;
			}
			System.out.println("");
		}
	}
}