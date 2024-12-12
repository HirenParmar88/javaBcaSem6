/**
 * @(#)mul_inheri_with_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/1/24
 */

interface showable
{
	void show();
}
interface printable extends showable
{
	void print();
}

public class mul_inheri_with_interface implements printable
{

    public static void main (String[] args) 
    {
		mul_inheri_with_interface M=new mul_inheri_with_interface();
    	M.show();
    	M.print();
    }
    public void show()
    {
    	System.out.println("This is show method");
    }
    public void print()
    {
    	System.out.println("This is print method");
    }
}