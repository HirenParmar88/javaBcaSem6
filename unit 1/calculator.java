/**
 * @(#)calculator.java
 *
 *
 * @author 
 * @version 1.00 2022/12/13
 */

import java.util.*;
public class calculator
{
    public static void main (String[] args)
    {
    	Scanner s= new Scanner(System.in);
    	int no1,no2,choice;
    	do{
    		System.out.println("1->addition");
    		System.out.println("2->subtractiomn");
    		System.out.println("3->multiplication");
    		System.out.println("4->division");
    		
    		System.out.println("5->exit");
    		
    		System.out.print("Enter Choice:");
    		choice=s.nextInt();
    //		System.out.print("Answer:");
    		switch(choice)
    		{
    				case 1:
    					System.out.println("Enter Number 1:-");
    					no1=s.nextInt();
    					System.out.print("Enter Number 2:-");
    					no2=s.nextInt();
    					System.out.println(no1+no2);
    					break;
    					
    				case 2:
    					System.out.println("Enter Number 1:-");
    					no1=s.nextInt();
    					System.out.print("Enter Number 2:-");
    					no2=s.nextInt();
    					System.out.println(no1-no2);
    					break;
    					
    				case 3:
    					System.out.println("Enter Number 1:-");
    					no1=s.nextInt();
    					System.out.print("Enter Number 2:-");
    					no2=s.nextInt();
    					System.out.println(no1*no2);
    					break;
    					
    				case 4:
    					System.out.println("Enter Number 1:-");
    					no1=s.nextInt();
    					System.out.print("Enter Number 2:-");
    					no2=s.nextInt();
    					System.out.println(no1/no2);
    					break;
    					
    				case 5:
    					break;
    					
    				case 0:
    					// System.out.print("");
    					break;
    					
    				default:
    					break;
    		}
    	
   		 }while(choice!=0);
    
    }
}