/**
 * @(#)tagged_and_marker_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/2/6
 */

interface car
{	
}
interface engine
{
}
class working implements engine
{
	static void isworking()
	{
		System.out.println("Is Enginee Working");
	}
}
class model implements car
{
	static void show()
	{
		System.out.println("show model");
	}
}

public class tagged_and_marker_interface 
{

    public static void main (String[] args) 
    {
		working.isworking();
		model.show();
    } 
}