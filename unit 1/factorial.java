/**
 * @(#)factorial.java
 *
 *
 * @author 
 * @version 1.00 2022/12/15
 */

import java.util.*;
public class factorial {

    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int c,no,temp=1;
		
		System.out.println("Enter Number:");
		no=sc.nextInt();
		
		while(no>=1)
		{
			temp=temp*no;
			no-=1;
		}
		System.out.println(temp);
    }
    
    
}