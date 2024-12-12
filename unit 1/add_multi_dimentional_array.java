/**
 * @(#)add_multi_dimentional_array.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/14
 */
// programme to add multi dimentional array

import java.util.Scanner;

public class add_multi_dimentional_array {

	public static void main(String args[]){
		int[][] a = new int[3][2]; //row=3 and colomn=2
		int[][] b = new int[3][2];
		int[][] ans = new int[3][2];
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Array 1");
		for (int r=0;r<3;r++){
			for(int c=0;c<2;c++){
				System.out.print("Enter value : ");
				a[r][c] = sc.nextInt();
			}
		}
		
		
		System.out.println("Array 2");
		for (int r=0;r<3;r++){
			for(int c=0;c<2;c++){
				System.out.print("Enter value : ");
				b[r][c] = sc.nextInt();
			}
		}
		
		
		
		for (int r=0;r<3;r++){
			for(int c=0;c<2;c++){
				ans[r][c] = a[r][c] + b[r][c];
			}
		}
		
		
		
		System.out.println("Array Answer");
		for (int r=0;r<3;r++){
			for(int c=0;c<2;c++){
				System.out.print(ans[r][c] + "\t");
			}
			System.out.println("");
		}
	}
}