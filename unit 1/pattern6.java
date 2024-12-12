/**
 * @(#)pattern1.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/15
 */
 
 /*
   1
  23
 456
78910
 */

import java.util.Scanner;
public class pattern6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r,c,sp,no, temp;
		System.out.print("Enter Number : ");
		no = sc.nextInt();
		
		temp=1;
		for(r=1;r<=no;r++) //row
		{
			for(sp=no;sp>r;sp--) //space
			{
				System.out.print(" ");
			}
			for(c=1;c<=r;c++) //column
			{
				String str = String.format("%2d",temp);
				System.out.print(str);
				temp++;
			}
			System.out.println("");
		}
	}
}