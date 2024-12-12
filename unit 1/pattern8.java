/**
 * @(#)pattern1.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/15
 */
 
 /*
    1
   2 3 
  4 5 6
 7 8 9 10
  111213
   1415
    16
 */

import java.util.Scanner;
public class pattern8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r,c,sp,no,temp=1;
		
		System.out.print("Enter Number : ");
		no = sc.nextInt();
		
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
				temp++;
			}
			System.out.println("");
		}
		
		//lower
	
		for(r=2;r<=no;r++)
		{
			for(sp=1;sp<r;sp++)
			{
				System.out.print(" ");
			}
			for(c=no;c>=r;c--)
			{
				System.out.print(String.format("%2d",temp));
				temp++;
			}
			System.out.println("");
		}
	}
}