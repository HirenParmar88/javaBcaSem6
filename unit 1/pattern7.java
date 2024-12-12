/**
 * @(#)pattern1.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/19
 */
 
 /*
    1
   2  3 
  4  5  6
 7  8  9  10
 */

import java.util.Scanner;
public class pattern7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r,c,sp,no;
		
		System.out.print("Enter Number : ");
		no = sc.nextInt();
		
		int temp=1;
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