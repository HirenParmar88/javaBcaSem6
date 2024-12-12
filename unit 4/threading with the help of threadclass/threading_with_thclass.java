/**
 * @(#)threading_with_thclass.java
 *
 *
 * @author 
 * @version 1.00 2023/2/13
 */

class Threadclass extends Thread		//SUPER CLASS
{
	Threadclass()
	{
		super("hiren");
		System.out.println("Thread Name="+this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("In child :"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("e");
		}
	}
}
public class threading_with_thclass 
{

    public static void main (String[] args) 
    {
		new Threadclass();		//DEFAULT CONSTRUCTOR.
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("In Main :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("e");
		}
    }
    
    
}