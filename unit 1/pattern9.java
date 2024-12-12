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
public class pattern9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r,c,no;
		
		System.out.print("Enter Number : ");
		no = sc.nextInt();
		
		for(r=1;r<=no;r++) //row
		{
			for(c=1;c<=r;c++) //column
			{
				System.out.print(r);
			}
			System.out.println("");
		}
	}
}