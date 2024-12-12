/**
 * @(#)multi_dimentional_array.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/14
 */

import java.util.*;
public class multi_dimentional_array
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][2];
		Scanner sc= new Scanner(System.in);
		
		//initialize
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.print("Enter Value For arr[" + r + "][" + c + "] : ");
				arr[r][c]=sc.nextInt();
			}
		}
		
		//print array
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.print(arr[r][c] + "  ");
			}
			System.out.println("");
		}
	}
}