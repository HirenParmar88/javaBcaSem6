
/**
 * @(#)student_eligible.java
 *
 *
 * @author 
 * @version 1.00 2022/12/13
 */

import java.util.*;
public class student_eligible {

    public static void main (String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Student Age:-");
    	int age=sc.nextInt();
    	
    	int result =(age>17)?1:0;
    	if(result==1)
    	{
    		System.out.println("Eligible..");	
    	}
    	else
    	{
    		System.out.println("Not Eligible..!!!");
    	}
    	
    }
    
    
}