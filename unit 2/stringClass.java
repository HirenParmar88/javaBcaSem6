/**
 * @(#)stringClass.java
 *
 *
 * @author 
 * @version 1.00 2022/12/29
 */


public class stringClass
{

    public static void main (String[] args) 
    {
		String o1="God";
		String o2="Is";
		String o3="Great";
		
		String o4=o1+o2+o3;
		String o5;
		
		System.out.println("o1.length="+o1.length());
		System.out.println("o1==o2"+o1.equals(o2));
		System.out.println("o3.charAt="+o3.charAt(2));
		
		o5="string changed !!!";
		System.out.println("o5="+o5);
		System.out.println("o4="+o4);
		
    }
    
    
}