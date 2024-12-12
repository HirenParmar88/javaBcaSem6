/**
 * @(#)nested_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/2/6
 */

interface showable
{
	void show();
	interface printable
	{
		void print();
	}
}
public class nested_interface implements showable.printable
{

    public static void main (String[] args) 
    {
		showable.printable p=new nested_interface();
		p.print();
    }
    public void print()
    {
    	System.out.println("print method");
    }
    public void show()
    {
    	System.out.println("show method");
    }
    
    
}