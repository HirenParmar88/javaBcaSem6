/**
 * @(#)find_2array.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/22
 */

import java.util.Scanner;
public class find_2array {
	public static void main(String[] args)
	{
		int r,c,find;
		int[][] arr = new int[2][2];
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		
		
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print("Enter Element for arr[" + r + "][" + c + "] : ");
				arr[r][c]= sc.nextInt();
			}
		}
		
		System.out.print("Enter Element To Search : ");
		find=sc.nextInt();
		
		for(int[] row:arr)
		{
			for(int col:row)
			{
				if(find==col)		
				{
					System.out.println("Element Found");
					flag=true;
					break;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}
	}
}