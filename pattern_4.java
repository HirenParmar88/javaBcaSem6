/**
 * @(#)pattern_4.java
 *
 *
 * @author 
 * @version 1.00 2022/12/15
 */

import java.util.*;
public class pattern_4 {

   	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r,c,no,sp;
		
		System.out.print("Enter Number:");
		no =sc.nextInt();
		
		for(r=1;r<=no;r++)
		{
			for(sp=no;sp>r;sp--)
			{
				System.out.print(" ");
			}
			for(c=1;c<=r;c++)
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}	
			
			
		for(r=2;r<=no;r++)
		{
			for(sp=1;sp<r;sp++)
			{
				System.out.print(" ");
			}
			for(c=no;c>=r;c--)
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	
}
   
    
    
}
   
    
    

  
    

    
