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
public class pattern5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r,c,no,temp;
		
		System.out.print("Enter Number : ");
		no = sc.nextInt();
		
		temp=1;
		for(r=1;r<=no;r++) //row
		{
			for(c=1;c<=r;c++) //column
			{
				System.out.print(String.format("%2d",temp));
				temp++;
			}
			System.out.println("");
		}
	}
}