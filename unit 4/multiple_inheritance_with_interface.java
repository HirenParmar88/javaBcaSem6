/**
 * @(#)multiple_inheritance_with_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/1/24
 */

interface showable
{
	void show();
}
interface printable
{
	void print();
}
class multipl_inheritance_with_interface implements showable,printable 
{

    public static void main (String[] args) 
    {
		multipl_inheritance_with_interface M=new multipl_inheritance_with_interface();
		M.show();
		M.print(); 
    }
    public void show()
    {
    	System.out.println("This is show method.");
    }
    public void print()
    {
    	System.out.println("This is print method.");
    }
    
}