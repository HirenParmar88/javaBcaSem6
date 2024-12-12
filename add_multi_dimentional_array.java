/**
 * @(#)add_multi_dimentional_array.java
 *
 *
 * @author 
 * @version 1.00 2022/12/14
 */

import java.util.*;
public class add_multi_dimentional_array {

   public static void main (String[] args) {
   		int[][] a = new int[3][2];
   		int[][] b = new int[3][2];
   		int[][] ans = new int[3][2];
   		Scanner sc =new Scanner(Scanner.in);
  	
  		System.out.println("Array 1");  		
   			for(int r=0;r<3;r++){
   				for(int c=0;c<2;c++){
   					System.out.println("Enter Value:");
   					a[r][c]=sc.nextInt();
   				}
   			}
   		System.out.println("Array 2"); 
   		for(int r=0;r<3;r++){
   			for(int c=0;c<2;c++){
   				System.out.println(("a[" +r+ "][" +c+ "]:" +a[r][c]));
   			}
   		}
}
}