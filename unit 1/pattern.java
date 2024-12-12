/**
 * @(#)pattern.java
 *
 *
 * @author 
 * @version 1.00 2022/12/15
 */

import java.util.Scanner;
public class pattern {

    public static void main (String[] args) 
    {
    	Scanner s=new Scanner(System.in);
    		int rows;
    		rows=s.nextInt();
    	
    	for(int i=1;i<=rows;i++)
    	{
    		for(int j=1;j<=1;j++)
    		{
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}	
    
    }	 
    
}