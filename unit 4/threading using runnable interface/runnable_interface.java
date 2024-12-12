/**
 * @(#)runnable_interface.java
 *
 *
 * @author 
 * @version 1.00 2023/2/13
 */

class Threadclass implements Runnable
{
	Thread t;
	Threadclass()
	{
		t=new Thread(this,"hiren");
		System.out.println("child thread :"+t);		//hiren,5,thread
		t.start();
		System.out.println("exit from constructor");
	}
	public void run()
	{
		try
		{
			for(int i=1;i<5;i++)
			{
				System.out.println("In Child :"+i);
				Thread.sleep(250);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public class runnable_interface 
{

    public static void main (String[] args) 
    {
		Thread t=Thread.currentThread();
		System.out.println("Main Thread Created :"+t);		//main,5,thread
		new Threadclass();		//default constructor
		System.out.println("Child Class Created .");
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
			System.out.println(e);
		}
    }
    
    
}