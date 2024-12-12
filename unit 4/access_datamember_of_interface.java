/**
 * @(#)access_datamember_of_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/1/25
 */

interface interface2
{
	int i=10;
	String s="java";
}

public class access_datamember_of_interface implements interface2
{

    public static void main (String[] args) 
    {
		access_datamember_of_interface M=new access_datamember_of_interface();
	//	M.i=10;
	//	M.s="java";
		System.out.println(M.i);
		System.out.println(M.s);
    }
    
    
}