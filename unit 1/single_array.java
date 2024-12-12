/**
 * @(#)single_array.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/14
 */

import java.util.Scanner;
public class single_array {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//declare
		int[] arr = new int[5];
		
		//intialize
		for(int c=0;c<arr.length;c++){
			System.out.print("Enter Values For Index " + c + " : ");
			arr[c]=sc.nextInt();
		}
		
		//for each loop to print
		for(int val:arr){
			System.out.print(val + "  ");
		}
	}
}