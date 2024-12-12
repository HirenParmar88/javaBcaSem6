/**
 * @(#)implements_multiple_interface_and_extends_the_class.java
 *
 *
 * @author 
 * @version 1.00 2023/1/25
 */

interface indoor
{
	String[] games1={"camon","chess"};
	void disp1();
}

interface outdoor
{
	String[] games2={"cricket","football"};
	void disp2();
}

class Activity
{
	String[] games={"dance","singing"};
	void disp()
	{
		System.out.println(games[0]);
		System.out.println(games[1]);
	}
}

class implements_multiple_interface_and_extends_the_class extends Activity implements indoor,outdoor
{

    public static void main (String[] args) 
    {
		implements_multiple_interface_and_extends_the_class c=new implements_multiple_interface_and_extends_the_class();
		c.disp();
		c.disp1();
		c.disp2();
    }
    public void disp1()
    {
    	System.out.println(games1[10]);
    	System.out.println(games2[1]);
    }
    public void disp2()
    {
    	System.out.println(games2[0]);
    	System.out.println(games2[1]);
    }
    
    
}