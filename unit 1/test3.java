/**
 * @(#)test3.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/22
 */


public class test3 {
	public static void main(String[] args)
	{
		int i=32767;
		byte b=5;
		
		//int to byte
		b=(byte)i;
		System.out.println(b);
		/*this conversion may not give proper result
		  bcoz byte has 2 while integer has 4 bytes
		  so conversion may not possible for all values
		*/
		
		String s="125";
		int si;
		//String to int
		si=Integer.parseInt(s);
		System.out.println(si);
	} 
}