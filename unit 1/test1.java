/**
 * @(#)test1.java
 *
 *
 * @author 
 * @version 1.00 2022/12/22
 */
 // operator "+" check

public class test1 {
	public static void main(String[] args)
	{	
		System.out.println(1+2+"String"); //3string
		//here mathematic operation 1st performed then concatination
		
		System.out.println("String" + 1 + 2); //string12
		//here just concant will be happened
		
		System.out.println("String" + (1+2)); //string3
		//first priority to () then concant
	}
}