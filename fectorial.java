/**
 * @(#)fectorial.java
 *
 *
 * @author 
 * @version 1.00 2022/12/15
 */

import java.util.*;
public class fectorial {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int c,no,temp=1;
		
		System.out.print("Enter Number:");
		no = sc.nextInt();
		
		while(no>0)
		{
			temp = temp * no ;
			no-=1;
		}
		System.out.println(temp);
}
    
    
}