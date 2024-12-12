/**
 * @(#)test2.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/22
 */


public class test2 {
	public static void main(String[] args)
	{
		int n=65;
		char ch;
		
		//int to char
		ch=(char)n;
		System.out.println(ch); //A
		
		ch='b';
		//char to int
		n=ch;
		System.out.println(ch); //b
		System.out.println(n); //98
	}
}