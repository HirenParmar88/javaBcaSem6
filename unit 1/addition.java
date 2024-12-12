/**
 * @(#)addition.java
 *
 *
 * @author 
 * @version 1.00 2022/12/12
 */

import java.util.Scanner;

public class addition {

    public static void main(String[]args) {
    	
    	int x,y,z;
    	Scanner s=new Scanner(System.in);
    	
    	System.out.print("enter value of x:");
    	x=s.nextInt();
    	System.out.println();
    	
    	System.out.print("enter value of y:");
    	y=s.nextln();
    	System.out.println();
    	
    	z=x+y;
    	System.out.println("x=y="+z);
    }
    
    
    
}