/**
 * @(#)pattern_1.java
 *
 *
 * @author 
 * @version 1.00 2022/12/15
 */

import java.util.*;
public class pattern_1 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r,c,no;
		
		System.out.print("Enter Number:");
		no =sc.nextInt();
		
		for(r=1;r<=no;r++)
		{
			for(c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}	
	
}
   
    
    
}